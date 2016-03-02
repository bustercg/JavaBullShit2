package com.company;
import java.util.Scanner;

/**
 * Created by battl_4m39d0w on 3/1/2016.
 */
public class GetInput {
    public static void getNumbers()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter yo number bitch");
        Main.x = keyboard.nextInt();
        Main.sign = keyboard.next();
        Main.y = keyboard.nextInt();
    }
}
