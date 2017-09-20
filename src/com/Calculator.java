package com;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import out.CalculatorLexer;
import out.CalculatorParser;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by coda on 2017/9/19.
 */
public class Calculator {

    public static void main(String[] args) {
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(new FileInputStream("src/test.in"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        CalculatorLexer lexer = new CalculatorLexer(inputStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokenStream);
        ParseTree parseTree = parser.prog();
        MyVIsitor visitor = new MyVIsitor();
        Float rtn = visitor.visit(parseTree);

//        System.out.println("#result#"+rtn.toString());



    }

}
