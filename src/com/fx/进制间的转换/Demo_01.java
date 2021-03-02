package com.fx.进制间的转换;

public class Demo_01 {
    /**
     * 十进制转十六进制
     * @param ten
     */
    public static void ten_sixteen(int ten) {
        int shang = ten;
        int yu = 0;
        char result;
//        String hex = "";
        StringBuilder hex = new StringBuilder();
        while(shang != 0) {
            shang = ten / 16;
            yu = ten % 16;
            if (yu < 10) {
                result = (char) (yu + '0');
            }else {
                result = (char) (yu - 10 + 'A');
            }
            hex.insert(0, result); // 从下往上
            ten = shang;
        }
        System.out.println(hex.toString());
    }

    /**
     * 十进制转2进制
     * @param ten
     */
    public static void ten_two(int ten) {
        int shang = ten;
        int yu = 0;
        StringBuilder B = new StringBuilder();
        while (shang != 0) {
            shang = ten / 2;
            yu = ten % 2;
            B.insert(0, yu);
            ten = shang;
        }
        System.out.println(B.toString());
    }

    /**
     * 二进制转为10进制
     * @param binary
     */
    public static void two_ten(long binary) {
        long shang = binary;
        int yu = 0;
        int result = 0;
        int i = 0;
        while (shang != 0){
            shang = binary / 10;
            yu = (int) (binary % 10);
            result = result +(yu * (int)Math.pow(2, i++));
            binary = shang;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        ten_sixteen(12345456); // bc6070
        ten_two(123); // 1111011
        two_ten(101101); // 45

        // Java API的方法
        System.out.println(Integer.toHexString(12345456));
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.parseInt("101101", 2));

    }
}
