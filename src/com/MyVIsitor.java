package com;

import out.CalculatorBaseVisitor;
import out.CalculatorParser;

import java.util.HashMap;

/**
 * Created by coda on 2017/9/20.
 */
public class MyVIsitor extends CalculatorBaseVisitor<Float> {
    private HashMap<String,Float> tables = new HashMap<>();

    @Override
    public Float visitDo(CalculatorParser.DoContext ctx) {
        return super.visitDo(ctx);
    }

    @Override
    public Float visitAssign(CalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Float value = visit(ctx.expr());
        tables.put(id,value);
        return value;
    }

    @Override
    public Float visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Float visitPrintResult(CalculatorParser.PrintResultContext ctx) {

        System.out.println(visit(ctx.expr()));
        return 0f;
    }

    @Override
    public Float visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Float left = Float.valueOf(ctx.expr(0).getText());
        Float right = Float.valueOf(ctx.expr(1).getText());
        if(ctx.op.getType()==CalculatorParser.MUL){
            return left*right;
        }else{
//            if(right==0)
//                throw new Exception("");
            return left/right;
        }
    }

    @Override
    public Float visitAddSub(CalculatorParser.AddSubContext ctx) {
        Float left = Float.valueOf(ctx.expr(0).getText());
        Float right = Float.valueOf(ctx.expr(1).getText());
        if(ctx.op.getType()==CalculatorParser.ADD){
            return left+right;
        }else{
            return left-right;
        }
    }

    @Override
    public Float visitId(CalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if(tables.containsKey(id)){
            return tables.get(id);
        }else {
            try {
                throw new Exception("the id is not defined");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0f;
        }
    }

    @Override
    public Float visitInt(CalculatorParser.IntContext ctx) {
        Float value = Float.valueOf(ctx.INT().getText());
        return value;
    }
}
