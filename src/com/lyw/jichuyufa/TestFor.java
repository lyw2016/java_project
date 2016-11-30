package com.lyw.jichuyufa;

/**
 * for循环
 *
 * @author Administrator
 * @create 2016-11-30-下午 12:44
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestFor {
    public static void main(String[] args) {
        long result = 0;
        long f = 1;
        for (int i = 1; i <= 10; i++) {
            f = f * i;
            result += f;
        }
        System.out.println(result);
    }
}
