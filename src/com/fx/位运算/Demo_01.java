package com.fx.位运算;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Demo_01 {
    // 以效率最高的方式计算 除2 和 2的3次方
    public static void demo_01() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入要除于2的数：");
        int i = in.nextInt();
        System.out.println("结果为：" + (i >> 1));
        System.out.print("请输入乘以8的数：");
        int x = in.nextInt();
        System.out.println("结果为：" + (x << 3));
    }
    // 判断奇偶数
    public static void demo_02() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入要判断奇偶的数：");
        int i = in.nextInt();
        System.out.println("结果为：" + (((i & 1) == 0) ? "偶数" : "奇数"));
    }

    // 获取二进制位是1还是0
    public static void demo_03() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要想获取的数字：");
        int i = in.nextInt();
        System.out.println("请输入要获取的二进制位数");
        int x = in.nextInt();
        System.out.println(((i >> (x-1)) & 1) == 0 ? "0" : "1");
    }

    // 交换两个整数变量的值
    /*
         ^ 运算的性质：A^A = 0  A^0 = A
         A = A^B
         B = A^B  B = A^B^B = A
         A = A^B  A = A^B^A = B
     */
    public static void demo_04() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a = in.nextInt();
        System.out.println("请输入b的值：");
        int b = in.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a+"; b = "+b);
    }

    // 不用判断语句，求整数的绝对值
    /*
        int类型的整数是4个字节，32位
        当一个【负数】int类型 >> 有符号右移31位就是等于 -1
        当一个【正数】int类型 >> 有符号右移31位就是等于 0
        当一个数和0进行异或就是它自己 x^0 = x
        当一个数和-1进行异或运算就是取反操作 x^(-1) = ~x
        取反 + 1 才会算出绝对值
        A >>> 31 A不带符号右移31为，如果A是整数就是0，A是负数就是1

        (A ^ (A >> 31)) + (A >>> 31)
                0/-1        0/1
     */
    public static void demo_05() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字：");
        int i = in.nextInt();
        int result = (i ^ (i >> 31)) + (i >>> 31);
        System.out.println(i + "的绝对值为 ： " + result );
    }


    public static void main(String[] args) {
//        demo_01();
//        demo_02();
//        demo_03();
//        demo_04();
        demo_05();
    }
}
