package com.example.examine.partA;

public interface Figure {
    /**
     * 校验数据长度和是否包含字符
     * @param figure
     */
    void checkFigure(String figure) throws Exception;

    /**
     * 把数据转化为大写
     * @param figure
     * @return
     */
    String changeFigureToCaptical(String figure);
}
