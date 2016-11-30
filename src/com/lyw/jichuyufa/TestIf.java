package com.lyw.jichuyufa;

/**
 * 分支if
 *
 * @author Administrator
 * @create 2016-11-30-下午 12:37
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestIf {
    public static void main(String[] args) {
        int i = 20;
        if (i < 20) {
            System.out.println("<20");
        } else if (i < 40)
            System.out.println("<40");
        else if (i < 60)
            System.out.println("<60");
        else
            System.out.println(">60");
        System.out.println(">60");
    }
}
