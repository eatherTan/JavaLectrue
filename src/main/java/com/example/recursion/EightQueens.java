package com.example.recursion;

/**
 * 八皇后问题
 * 在8×8格的国际象棋上摆放8个皇后，
 * 使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，
 * 问有多少种摆法。
 */

public class EightQueens {
    /**
     * 1.第一个皇后先放第一行第一列
     * 2.第二个皇后放在第二行第一列，判断是否ok，如果不ok，继续放在第二列、第三列，依次把所有列都放完，
     * 找到一个合适位置
     * 3.继续放第三个皇后，从第一列、第二列....直到第八个皇后也能放在你一个不冲突的位置
     * 4.当得到一个正确解时，在栈回退到上一个栈时，就会开始回溯，即将第一个皇后放到第一列的所有正确解，全部得到
     * 5.然后后头继续放第一个皇后放在第二列.... 循环1,2,3,4步骤
     */
    /**
     * 说明：
     * 理论上应该要创建一个二维数组来表示棋盘，但是实际上，可以通过算法，用一个一维数组即可
     * arr[8] = {0,4,7,5,2,6,1,3}
     * 对应arr下标表示第几行，即第一个皇后，arr[i]=value,value表示第i+1个皇后，放在第i+1行的第value+1列
     */

    //定义max 表示有8个皇后
    int max = 8;
    //定义数组arr，保存皇后放置位置的结果，比如：arr = {0,4,7,5,2,6,1,3}
    int[] arr = new int[max];
    public static void main(String[] args) {
        EightQueens eight = new EightQueens();
        eight.check(0);
    }

    /**
     * 放置皇后
     * 注意：check是每一次递归时，进入到check中都有for循环， for(int i = 0; i< max; i++)
     * @param n
     */
    private void check(int n){
        if (n == max){ //n =8,表示8个皇后已经放好了
            print();
            return;
        }
        //依次放入皇后，并判断是否冲突
        for (int i = 0; i < max; i++) {
            //先把当前这个皇后n，放到该行的第1列
            arr[n] = i;
            //判断当放置第n个皇后到i列时，是否冲突
            if (judge(n)){
                //接着放n+1，即开始递归
                check(n+1);
            }
            //如果冲突，就继续执行 arr[n] = i;即把第n个皇后，放置在本行的后移一个位置
        }
    }

    /**
     * 查看当我们放置第n个皇后，就去检测该皇后是否和前面已经摆放的皇后冲突
     * @param n  n表示第n个皇后
     * @return
     */
    private boolean judge(int n){
        for (int i = 0; i < n; i++){
            //arr[i] == arr[n]  表示判断第n个皇后是否和前面的n-1个皇后在同一列
            //Math.abs(n-i) == Math.abs(arr[n] - arr[i])，判断同一斜线
            //没有必要判断是否会在同一行，因为n每次都在递增，不会相同
            if (arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n] - arr[i])){
                return false;//冲突
            }
        }
        return true; //不冲突
    }

    //写一个方法，可以将皇后摆放的位置输出
    private void print(){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
