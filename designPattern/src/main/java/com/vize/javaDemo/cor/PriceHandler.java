package com.vize.javaDemo.cor;

/**
 * Created by vizewang on 2015/8/16.
 */
public abstract class PriceHandler {
    protected PriceHandler successor;
    public void setSuccessor(PriceHandler successor){
        this.successor=successor;
    }
    public abstract void processDiscount(float discount);
}
