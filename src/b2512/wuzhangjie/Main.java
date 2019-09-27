package b2512.wuzhangjie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int num=0;
//        System.out.print("请输入任何字符:");
//        String father = scan.next();
//        System.out.print("请输入你想查找的字符串:");
//        String son = scan.next();
//        while (father.indexOf(son)>=0){
//            father = father.substring(father.indexOf(son)+son.length());
//            num++;
//        }
//        System.out.println(son+"出现了"+num+"次!");




//        System.out.print("请输入任何字符:");
//        String str = scan.next();//接收数据
//        System.out.print("请输入你想查找的字符串:");
//        char[] sub = scan.next().toCharArray();//查找字符串的数组
//        char[] charArray = str.toCharArray();//toCharArray() 方法将字符串转换为字符数组
//        int count = 0;//出现多少次
//        int correctCount = 0;//正确次数
//        while (str.length()>=sub.length){//3//如果任意字符长度大于0
////            str.length()>sub.length
//            for (int i =0;i<sub.length;i++){//i<查找字符的长度
////                if (str.length()<sub.length){//如果任意字符的长度小于查找字符
////                    str="";//数据清空
////                    break;
////                }
//                if (charArray[i]!=sub[i]){//如果任意字符[i]不等于查找字符[i]
//                    str = str.substring(1);//从第1位开始截
//                    charArray = str.toCharArray();//重新把str赋值给数组
//                    correctCount = 0;//正确次数为0
//                    break;
//                }else {
//                    correctCount++;//正确次数++;
//                }
//            }
//            if (correctCount==sub.length){
//                count++;//出现次数++;
//                correctCount=0;//正确次数为0
//                str = str.substring(sub.length);//截取掉查找字符的长度
//                charArray = str.toCharArray();//重新赋值
//            }
//        }
//        System.out.println("出现了"+count+"次"+String.valueOf(sub));

















//        System.out.print("请输入任何字符:");
//        String str = scan.next();//接收数据
//        System.out.print("请输入你想查找的字符串:");
//        char[] sub = scan.next().toCharArray();//查找字符串的数组
//        char[] arr = str.toCharArray();
//        int num = 0;
//        while (str.length()>=sub.length){
//            for (int i =0;i<sub.length;i++){
//                if (arr[i]!=sub[i]){
//                    str = str.substring(1);
//                    arr = str.toCharArray();
//                    break;
//                }else if (arr[i]==sub[i]&&i==sub.length-1){
//                    num++;
//                    str = str.substring(sub.length);
//                    arr = str.toCharArray();
//                }
//            }
//        }
//        System.out.print(num);







        System.out.print("请输入任何字符:");
        String str = scan.next();
        System.out.print("请输入你要查找的字符:");
        char[] sub = scan.next().toCharArray();
        char[] arr = str.toCharArray();
        int pic = 0;
        while (str.length()>=sub.length){
            for (int i =0;i<sub.length;i++){
                if (arr[i]!=sub[i]){
                    str = str.substring(1);
                    arr = str.toCharArray();
                }else if (arr[i]==sub[i]&&i==sub.length-1){//0 1 2 //sub.length1
                    pic++;
                    str = str.substring(sub.length);
                    arr = str.toCharArray();
                }
            }
        }
        System.out.print(pic);
    }
}
