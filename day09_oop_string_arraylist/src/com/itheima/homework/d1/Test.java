package com.itheima.homework.d1;

public class Test {
    /*
        请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
        例如："abcba"、"上海自来水来自海上"均为对称字符串。
    * */
    public static void main(String[] args) {
        String str1 = "上海自来水来自海上";
        String str2 = "abcba";
        String str3 = "abcbad";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
    public static boolean isPalindrome(String s){
        for (int i = 0,j=s.length()-1; i <j ; i++,j--) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
