package com.example.lineartable;

import java.util.ArrayList;
import java.util.List;

public class PolandInfixToSuffixExpression {

    /**
     * 中缀表达式转后缀表达式的思路步骤分析 ：例子:1+((2+3)*4)-5 转后缀表达式
     * 1.初始化两个栈:运算符栈s1和存储中间结果的栈s2;
     * 2.从左至右扫描中缀表达式
     * 3.遇到操作数，将其压入s2;
     * 4.遇到运算符时，比较其与s1栈顶运算符的优先级
     *   a.如果s1为空，或栈顶运算符为左括号"(",则直接将此运算符入栈； 注意"("不是运算符，只是一个计算优先级改变的方式
     *   b.否则，若优先级比栈顶运算符的高，也将运算符压入s1；
     *   c.否则，将s1栈顶的运算符弹出并压入s2中，再次转到4.a. 与s1中新的栈顶运算符想比较；
     * 5.遇到左括号时：
     *   a.如果是左括号"(",则直接压入s1
     *   b.如果是有括号")",则依次弹出s1栈顶的运算符，并压入s2,直到遇到左括号为止，此时将这一对括号丢弃
     * 6.重复步骤2-5，直到表达式的最右边
     * 7.将s1中剩余的运算符依次弹出并压入s2
     * 8.依次弹出s2中的元素并输出，结果的逆序即为中缀表达式对应的后缀表达式
     *
     */


    public static void main(String[] args) {

        //把 1+((2+3)*4)-5 转成后缀表达式 " 1 2 3 + 4 x + 5 -"
        //思路：
        //1、先把String转成字符串，对List进行操作
    }

    /**
     * 从后缀表达式 得到中缀表达式
     * @param s
     * @return
     */
    public static List<String> getListString(String s){
        List<String> list = new ArrayList<>();//定义一个List，存放中缀表达式
        int i= 0; //指针，遍历中缀表达式字符串
        String str;
        char c;
        do {
            //如果是一个非数字，我需要加入到ls
            if ((c=s.charAt(i))<48 || (c=s.charAt(i))>57) {
                list.add(""+c);
                i++;
            } else { //如果是一个数，需要考虑多位数
                str = "";
                while (i < s.length() && (c=s.charAt(i))>= 48 && (c=s.charAt(i)) <= 57){
                    str += c;
                    i++;
                }
                list.add(str);
            }
        }while (i < s.length());
        return list;
    }
}
