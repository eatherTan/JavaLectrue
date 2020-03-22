package com.example.examine.partA;

import java.util.regex.Pattern;

public class FigureImpl implements Figure {
    @Override
    public void checkFigure(String figure) throws Exception {
        String pattern = "\\d";
        if (figure != null && figure.length() <= 8){
            String[] singleFirgures = figure.split("");
            for (String str : singleFirgures){
                if (!Pattern.matches(pattern,str)){
                    throw new Exception("用户输入的字符不都为数据，无法转换");
                }
            }
        }else{
            throw new Exception("数据长度不可大于8");
        }
    }

    /**
     * 当个位时不带单位，当十位时但是是十，以此类推
     * 但是
     * @param figure
     * @return
     */
    @Override
    public String changeFigureToCaptical(String figure) {
        String[] chineseFigure = {"零","一","二","三","四","五","六","七","八","九"};
        String[] unit = {"十","百","千","万"};
        String[] singleFirgures = figure.split("");
        for (int i = 0; i < singleFirgures.length; i++){

        }
        return null;
    }
}
