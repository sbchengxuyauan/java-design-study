package com.zym.strategy;

/**
 * 策略模式 实现算法接口，分别调用
 */
public class Test {

    public static  void main(String[] args){
        Ioperation add=new AddOperation();
        int k= (int) add.reckon(1,2);
    }
}
