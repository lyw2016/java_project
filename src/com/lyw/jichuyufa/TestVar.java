package com.lyw.jichuyufa;

/**
 * 变量作用域
 *
 * @author Administrator
 * @create 2016-11-30-上午 10:41
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestVar {
    static int j;   //成员变量

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        System.out.println(j);

        boolean b = false;
        if (b) {
            System.out.println("b is true");
        }

        long longNum1 = 8888888888888888888L;
    }

    public void m() {
        int i = 0;  //局部变量
        int j = i + 5;
        double d = 3.14;
        Dog dog = new Dog(22, 7, 1964);
        System.out.println(1);
    }

    private class Dog {
        int day, month, year;

        public Dog(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
