package com.lyw.demo;

/**
 * 快捷模板练习
 *
 * @author Administrator
 * @create 2016-11-26-上午 9:00
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class Demo1 {

    public static void main(String[] args) {
        int temp1 = 100;
        int temp2 = 50;
        int temp3 = addNum(temp1, temp2);
        //<editor-fold desc="Description">
        System.out.println("------------YouMeek.com-----------temp3值=" + temp3 + "," + "当前类=Demo1.main()");
        System.out.println("------------YouMeek.com-----------temp2值=" + temp2 + "," + "当前类=Demo1.main()");
        System.out.println("------------YouMeek.com-----------temp1值=" + temp1 + "," + "当前类=Demo1.main()");
        //</editor-fold>

    }

    private static int addNum(int param1, int param2) {
        int param3 = param1 + param2;
        return param3;
    }
}
