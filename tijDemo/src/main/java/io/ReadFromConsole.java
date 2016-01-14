package io;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by weizwang on 2016/1/11.
 */
public class ReadFromConsole {
    public static void main(String[] args) {
        String str = readString3("请输入字符串");
        System.out.println("readStringFromDialog 方法的输入:" + str);
    }
    private static String readString1(String prompt){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        System.out.println(prompt);
        try {
            str=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private static String readStringFromDialog(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    private static String readString2(String prompt){
        Scanner scanner=new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
    private static String readString3(String prompt){
        Console console=System.console();
        if(console==null){
            throw new IllegalThreadStateException("不能使用控制台" );
        }
        return console.readLine(prompt);
    }
}
