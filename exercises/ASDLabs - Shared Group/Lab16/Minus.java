package com.asd.lab16.prob;



public class Minus implements Expression{

    Expression leftOperand;
    Expression rightOperand;
    
    public Minus(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
		
    public int interpret()  { 
        return leftOperand.interpret() - rightOperand.interpret();
    }

}
