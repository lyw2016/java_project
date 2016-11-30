package com.lyw.jichuyufa;

/**
 * 0~100之内奇数的和
 *
 * @author Administrator
 * @create 2016-11-30-下午 12:58
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class OldSum {
    public static void main(String[] args) {
        int result = 0;

        /*for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
                result += i;
        }*/

        for (int i = 1; i <= 99; i += 2) {
            result += i;
        }

        System.out.println("0~100之内奇数的和为:" + result);


    }
}
