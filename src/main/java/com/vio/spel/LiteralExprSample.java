package com.vio.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class LiteralExprSample {
    public static void manin(String[] args){
        ExpressionParser parser=new SpelExpressionParser();

        String hw=(String) parser.parseExpression("\"Hello World\"").getValue();

        double doubleeNumber=(Double)parser.parseExpression("6.0221415E+23").getValue();

        int mabValue=(Integer)parser.parseExpression("0x7fffffff").getValue();

        boolean trueValue=(Boolean)parser.parseExpression("true").getValue();
    }

}


