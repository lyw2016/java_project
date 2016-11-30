package com.lyw.jichuyufa;

/**
 * 循环测试
 *
 * @author Administrator
 * @create 2016-11-30-下午 1:30
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestXunHuan {
    public static void main(String[] args) {
        //输出1~100之内前5个可以被3整除的数字
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
                num++;
            }

            if (num == 5) break;
        }

        System.out.println();

        //输出101~200内的质数,质数只能被1和本身整除
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
            }
        }

    }
}
