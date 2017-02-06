package jp.ac.uryukyu.ie.e165722;

import java.lang.Math;
import java.io.IOException;
import java.lang.String;
import java.lang.System;
import java.io.InputStreamReader;
import java.io.*;

//yはお金（円）の頭文字
public class main{

    public static void main (String args[]){

        int y0 = 100;

        BufferedReader y1 = new BufferedReader(
                new InputStreamReader(System.in));

        while (y0 > 0){

            int y2 = 0;

            try{
                System.out.println("所持金は" + y0 + "です。");
                System.out.println("掛金を設定してください？");
                y2 = Integer.parseInt(y1.readLine());{
                }

                if (y0 < y2 || y2 <= 0) {
                    System.out.println("あなたお金持ってないですよ笑");
                    continue;

                }
                y0 -= y2;


            }
            catch (IOException y3) {
            System.out.println("入力エラーが発生したため終了します。");
            System.exit(1);
            }

            catch (NumberFormatException y4) {
            System.out.println("数字を入力してください。");
            continue;
        }



        }
    }
}