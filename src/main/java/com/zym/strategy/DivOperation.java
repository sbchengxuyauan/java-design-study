package com.zym.strategy;

public class DivOperation extends AbstractOperation {

    public DivOperation(){
       System.out.println("除法");
    }


    @Override
    public double reckon(double n1, double n2) {
        if(n2==0)
         return 0;
         return n1/n2;
    }
}
