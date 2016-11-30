package com.lyw.jichuyufa;

/**
 * 分支Switch
 *
 * @author Administrator
 * @create 2016-11-30-下午 1:45
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestSwitch {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
            case 5:
                System.out.println("D");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
