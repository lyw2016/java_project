package com.lyw.jichuyufa;

/**
 * break和continue
 *
 * @author Administrator
 * @create 2016-11-30-下午 1:25
 * 物勒工名，以考其诚，工有不当，必行其罪，以究其情
 */
public class TestBreakAndContinue {
    public static void main(String[] args) {
        //break;
        int stop = 4;
        for (int i = 0; i < 10; i++) {
            if (stop == i) break;
            System.out.println(i);
        }

        //continue
        for (int i = 0; i < 5; i++) {
            if (stop == i) continue;
            System.out.println(i);
        }
    }
}
