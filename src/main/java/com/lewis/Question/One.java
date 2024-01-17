package com.lewis.Question;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @Author: LYJ
 * @Date: 2024/1/17 18:44 （日期和时间）
 * 计算超市购买苹果和草莓所需金额 苹果单价8 草莓单价13
 */
public class One {
    public static void main(String[] args) {
        try {
            System.out.println("请输入您需要苹果多少斤：");
            Scanner AppleScanner = new Scanner(System.in);
            int appleNumber = AppleScanner.nextInt();
            System.out.println("请输入您需要草莓多少斤：");
            Scanner StrawberriesScanner = new Scanner(System.in);
            int strawberries = StrawberriesScanner.nextInt();
            BigDecimal totalPrice = FruitPrice.applePrice.multiply(new BigDecimal(appleNumber))
                    .add(FruitPrice.strawberriesPrice.multiply(new BigDecimal(strawberries)));
            System.out.println("您需要支付:"+totalPrice.setScale(2, RoundingMode.UP)+"元");
        }catch (Exception e){
//            System.out.println(e.getMessage());
            throw new RuntimeException("请输入整数哦！");
        }
    }
}

