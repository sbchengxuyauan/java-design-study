package com.zym.strategy;

public class SubOperation extends AbstractOperation {


    public SubOperation(){
       System.out.println("减法");
    }

    @Override
    public double reckon(double n1, double n2) {

        return n1-n2;
    }
}
