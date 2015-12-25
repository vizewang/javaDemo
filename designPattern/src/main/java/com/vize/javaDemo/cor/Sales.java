package com.vize.javaDemo.cor;

/**
 * Created by vizewang on 2015/8/16.
 */
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.05){
            System.out.println("批准了折扣"+this.getClass());
        }else {
            successor.processDiscount(discount);
        }
    }
}
