package com.zym.strategy;

public class AddOperation extends  AbstractOperation {



    public AddOperation(){
      System.out.println("加法");
    }

    @Override
    public double reckon(double n1, double n2) {
        return n1+n2;
    }
}
