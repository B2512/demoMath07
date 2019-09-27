package b2512.yeqingnan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入任意字符串：");
        String str = sc.next();
        char[] charArray = str.toCharArray();
        System.out.print("输入查找指定字符串:");
        char[] sub = sc.next().toCharArray();
        int count = 0;
        int correctCount = 0;
        while (str.length() > 0) {
            for (int i = 0; i < sub.length; i++) {
                if (str.length() < sub.length) {
                    str="";
                    break;
                }
                if (charArray[i] != sub[i]) {
                    str = str.substring(1);
                    charArray = str.toCharArray();
                    correctCount = 0;
                    break;
                }else {
                    correctCount++;
                }
            }
            if (correctCount == sub.length) {
                count++;
                correctCount = 0;
                str = str.substring(sub.length);
                charArray = str.toCharArray();
            }
        }
        System.out.println("指定字符串" + String.valueOf(sub) + "在原字符串中出现" + count + "次");
    }
}
