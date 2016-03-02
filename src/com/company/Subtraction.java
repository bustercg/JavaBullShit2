package com.company;

/**
 * Created by battl_4m39d0w on 3/1/2016.
 *
 * x=100
 * y=10
 */
public class Subtraction {
    public static void subtract() {
        if (Main.x >= Main.y) {
            for (int i = Main.y; i < Main.y; i++) {
                Main.answer++;
            }
        } else
            for (int i = Main.x; i < Main.y; i++) {
                Main.answer += -1;
            }
    }
}
