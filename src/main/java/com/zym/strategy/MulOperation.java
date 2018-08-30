package com.zym.strategy;

public class MulOperation extends AbstractOperation {

    public MulOperation(){
        System.out.println("乘法");
    }


    @Override
    public double reckon(double n1, double n2) {

        return n1*n2;
    }
}
