package com.utils;

/**
 * 1. @description:
 * 2. @author: Dawn
 * 3. @time: 2022/6/8
 */
public class HexChar {
    public String toHex(int hexValue) {
        return Integer.toHexString(hexValue);
    }

//    public static void main(String[] args) {
//        String hex_value = "150";
//        System.out.println(Integer.parseInt(hex_value, 16));
//    }
    public int HexConversion(String hex_value) {
        int value = Integer.parseInt(hex_value, 16);
        return value;
    }
}


