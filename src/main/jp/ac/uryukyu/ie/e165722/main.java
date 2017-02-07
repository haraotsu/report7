package jp.ac.uryukyu.ie.e165722;

import java.lang.Math;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;


//yはお金（円）の頭文字

public class main {

    public static void main(String args[]) {

        int y0 = 100;

        if (y0 > 0) {

            int y2 = 0;

            System.out.println("所持金は" + y0 + "円です。");


            System.out.println("掛金を設定してください。");

            Scanner scan = new Scanner(System.in);

            String str = scan.next();

            System.out.println("掛金は" + str + "です。");

        }


        int n1, n2, n3;

        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        n3 = (int) (Math.random() * 10);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("でした。");

    }
}