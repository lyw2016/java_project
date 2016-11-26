package com.lyw.demo;

/**
 * 重构测试类
 *
 * @author Administrator
 * @create 2016-11-26-上午 10:51
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class Demo2 {


    private static int num;

    public static void main(String[] args) {
        show(num);
    }

    private static void show(int num) {
        System.out.println("------------YouMeek.com-----------num值=" + num + "," + "当前类=Demo2.main()");
    }
}
