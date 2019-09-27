package b2512.huangsai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入字符串:");
//        String ont = scan.next();
//        System.out.println("请输入一个字符");
//        String two = scan.next();
//        char[] three = ont.toCharArray();
//        char[]  a = two.toCharArray();
//        int c = 0;
//        String d = ont.replaceAll(two,"");
//        char[]  f = d.toCharArray();
//        for(int i=0; i<three.length; i++)
//        {
//            for (int j=0;j<a.length; j++) {
//                if (d.length() == three[i]) {
//                    c++;
//                }
//            }
//        }
//        System.out.println("字符"+ont+"，\n在字符串"+two+"\n中共出现了"+c+"次。");

        // 获取数据
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入字符串:");
        String str = scanner.next(); // "asdasd"
        System.out.print("输入子串:");
        char[] sub = scanner.next().toCharArray();
        int count = 0;
        int correctCount = 0;
        // aasdisudassdasd09sd89asd
        char[] charArray = str.toCharArray();
        while (str.length() > 0){
            for (int i = 0;i<sub.length;i++){
                if(str.length() < sub.length){
                    str = "";
                    break;
                }
                if(charArray[i] != sub[i]){
                    str = str.substring(1);
                    charArray = str.toCharArray();
                    correctCount = 0;
                    break;
                }else{
                    correctCount++;
                }
            }
            if(correctCount == sub.length){
                count++;
                correctCount = 0;
                str = str.substring(sub.length);
                charArray = str.toCharArray();
            }
        }
        System.out.println(str+"中出现了"+count+"次"+String.valueOf(sub));
        //
    }
}

