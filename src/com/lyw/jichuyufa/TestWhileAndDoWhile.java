package com.lyw.jichuyufa;

/**
 * while和do...while循环
 *
 * @author Administrator
 * @create 2016-11-30-下午 1:10
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestWhileAndDoWhile {
    public static void main(String[] args) {
        int i = 0;
        while ((i < 10)) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
