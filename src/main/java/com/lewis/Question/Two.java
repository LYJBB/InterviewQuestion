package com.lewis.Question;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @Author: LYJ
 * @Date: 2024/1/17 19:15 （日期和时间）
 * 新增水果，B客户去买
 */
public class Two {
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
                    .add(FruitPrice.strawberriesPrice.multiply(new BigDecimal(strawberries)))
                    .add(FruitPrice.mangoPrice.multiply(new BigDecimal(mango)));
            System.out.println("您需要支付:"+totalPrice.setScale(2, RoundingMode.UP)+"元");
        }catch (Exception e){
//            System.out.println(e.getMessage());
            throw new RuntimeException("请输入整数哦！");
        }
    }
}
