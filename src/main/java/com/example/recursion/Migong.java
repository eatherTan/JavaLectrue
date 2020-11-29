package com.example.recursion;

import org.apache.ibatis.annotations.Param;

/**
 * 迷宫走法，找到出路
 */
public class Migong {
    public static void main(String[] args) {
        //先创建一个二维数组，模拟迷宫，表示地图
        //地图
        int[][] map = new int[8][7];
        //1. 使用1表示墙，不能通行
        for (int i = 0; i < 7 ;i++){
            map[0][i]= 1;
            map[7][i]= 1;
        }
        for (int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        setWay(map,1,1);
        System.out.println("行走路线");
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //1.出发点：i,j 表示小球从地图的触发位置(1,1)
    //2.如果小球到达map[6][5],表达终点达到
    //约定：当map[i][j]为0表示该点还未走过，1位墙，2表示通路可以走，3表示已经该点已经走过，但是走不通
    //3.在走迷宫时，行走策略：下->右->上->左，如果该点走不通，再回溯
    /**
     *
     * @param map 地图
     * @param i 从哪个位置开始找
     * @param j
     * @return 如果找到通路，就返回true，否则就返回false
     */
    //使用递归回溯来找路
    public static boolean setWay(int[][] map, int i, int j){
        if (map[6][5] == 2){

            return true;
        }else {
            if (map[i][j]==0){
                map[i][j] = 2;
                if (setWay(map,i+1,j)){
                    return true;
                }else if (setWay(map,i,j+1)){
                    return true;
                }else if(setWay(map,i-1,j)){
                    return true;
                }else if (setWay(map,i,i-1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {//如果map[i][j] != 0,可能是1,2,3,
                return false;
            }
        }
    }
}
