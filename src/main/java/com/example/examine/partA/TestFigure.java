package com.example.examine.partA;

import java.util.Scanner;

public class TestFigure {
    public static void main(String[] args) {
        Figure figure = new FigureImpl();
        Scanner input = new Scanner(System.in);
        String figureStr = null;
        System.out.println("请输入要转化的数字,长度小于8");
        figureStr = input.next();
        try {
            figure.checkFigure(figureStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String changedFigure = figure.changeFigureToCaptical(figureStr);
    }
}
