package com.example.lineartable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *  逆波兰表达式计算器
 *  后缀表达式
 */
public class PolandNotation {
    public static void main(String[] args) throws Exception {

        //先定义 逆波兰表达式
        //(3+4)*5-6 => 3 4 + 5 * 6 -  (为了方便使用空格把数字、字符隔开)
        String suffixExpression  = "3 4 + 5 * 6 -";
        String suffixExpression1  = "30 4 + 5 * 6 -";  //结果为164
        //思路：先将 "3 4 + 5 * 6 -"  放入ArrayList中
        //2.将ArrayList传递给一个方法，遍历ArrayList 配合栈完成计算
        //3.将得到中缀表达式对应的List 转换成后缀表达式的List
        List<String> list = doInfixExpressionList(suffixExpression1);
        int res = calculate(list);
        System.out.println("运算结果为：" + res);

    }

    public static List<String> doInfixExpressionList(String s){

        List<String> list = new ArrayList<>();//存放中缀表达式内容
        int i = 0;
        String str ;
        char c;
        do {
            //如果c是一个非数组，需要加入到list
            if ((c= s.charAt(i))<48 || (c= s.charAt(i))>57 ){
                list.add(""+c);
                i++;
            } else { //如果是一个数，需要考虑多位数
                str = "";
                while (i < str.length() && (c=s.charAt(i)) >= 48 && (c=s.charAt(i)) <= 57)
                    str += c;
                    i++;
            }
        }while (i < s.length());
        return list;
    }

    /**
     * 下面这个方法是完成逆波兰表达式的运算的
     * 思路如下：
     * 1. 从左至右扫描，将3和4压入栈中；
     * 2.遇到+运算符，因此弹出4和3（4为栈顶元素，3为次顶元素），计算出3+4的值，再将结果7入栈；
     * 3.将5入栈
     * 4.接下来是*运算符，因为弹出5和7，计算出7*5=35，再将结果35入栈；
     * 5.将6入栈；
     * 最后是-运算符，计算出35-6的值，即29，由此得出最终结果
     *
     */
    public static int calculate(List<String> list) throws Exception {
        //创建栈，只需要一个栈即可
        Stack<String> stack = new Stack<>();
        for (String item : list){
            //使用正则表达式来取出数
            if (item.matches("\\d+")) { //"\d"表示的是数，+ 表示匹配一个或多个;则这里表示的是多位数
                stack.push(item);
            }else {
                //如果是运算符，那pop两个数，并计算，再入栈
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")){
                    res = num1 + num2;
                }else if (item.equals("*")){
                    res = num1 * num2;
                }else if (item.equals("-")){
                    res = num1 - num2;
                }else if (item.equals("/")){
                    res = num1/num2;
                }else {
                    throw new Exception("运算符不正确");
                }
                stack.push(String.valueOf(res));
            }
        }
        //最后留在stack中的就是运算结果
        return Integer.parseInt(stack.pop());
    }
}
