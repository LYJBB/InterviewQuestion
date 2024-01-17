package com.lewis.Question;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @Author: LYJ
 * @Date: 2024/1/17 19:40 （日期和时间）
 * 加入满减优惠政策(满100减10)
 */
public class Four {
    public static void main(String[] args) {
        try {
            System.out.println("请输入您需要苹果多少斤：");
            Scanner AppleScanner = new Scanner(System.in);
            int appleNumber = AppleScanner.nextInt();
            System.out.println("请输入您需要草莓多少斤：");
            Scanner StrawberriesScanner = new Scanner(System.in);
            int strawberries = StrawberriesScanner.nextInt();
            System.out.println("请输入您需要芒果多少斤：");
            Scanner MangoScanner = new Scanner(System.in);
            int mango = MangoScanner.nextInt();
            BigDecimal totalPrice = FruitPrice.applePrice.multiply(new BigDecimal(appleNumber))
                    .multiply(Discount.appleDiscount)
                    .add(FruitPrice.strawberriesPrice.multiply(new BigDecimal(strawberries)).multiply(Discount.strawberriesDiscount))
                    .add(FruitPrice.mangoPrice.multiply(new BigDecimal(mango)).multiply(Discount.mangoDiscount));
            if (totalPrice.compareTo(new BigDecimal(100)) >= 0){
                System.out.println("您需要支付:"+totalPrice.subtract(new BigDecimal(10)).setScale(2,RoundingMode.UP)+"元");
            }else{
                System.out.println("您需要支付:"+totalPrice.setScale(2, RoundingMode.UP)+"元");
            }
        }catch (Exception e){
//            System.out.println(e.getMessage());
            throw new RuntimeException("请输入整数哦！");
        }
    }
}
