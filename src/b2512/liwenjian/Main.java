package b2512.liwenjian;

import java.util.Scanner;
public class Main {
    //题目：计算字符串中字串出现的次数
    public static void main(String[]args){
/*
        Scanner calculation=new Scanner(System.in);
        System.out.print("请输入字符串：");
        String string=calculation.next();
        System.out.print("出现的次数:");
        String appear=calculation.next();
        int count = 0;
        int start = 0;
        while (string.indexOf(appear, start) >= 0 && start < string.length()) {
            count++;
            start = string.indexOf(appear, start) + appear.length();
        }
        System.out.println(appear + "在" + string + "出现的次数为" + count);

 */

        Scanner calculation=new Scanner(System.in);
        System.out.print("请输入字符串：");
        String string=calculation.next();
        System.out.print("出现的次数:");
        char[] appear=calculation.next().toCharArray();
        int count = 0;
        int cool = 0;
        char[]start=string.toCharArray();
        while (string.length()>0)
            for (int i = 0;i<appear.length;i++) {
                if (string.length() < appear.length) {
                    string = "";
                    break;
                }
                if (start[i] != appear[i]) {
                    string = string.substring(1);
                    start = string.toCharArray();
                    cool = 0;
                    break;
                } else {
                    cool++;
                }
                if (cool == appear.length) {
                    count++;
                    cool = 0;
                    string = string.substring(appear.length);
                    start = string.toCharArray();
                }
            }
        System.out.println(string+"中出现了"+count+"次"+String.valueOf(appear));


    }
}
