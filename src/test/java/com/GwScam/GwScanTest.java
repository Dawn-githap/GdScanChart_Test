package com.GwScam;

import com.utils.HexChar;
import com.utils.HttpUils;
import com.utils.UserData;

/**
 * 1. @description:
 * 2. @author: Dawn
 * 3. @time: 2022/6/7
 */
public class GwScanTest {
    public static void main(String[] args) {
        HttpUils httpUils = new HttpUils();
        HexChar hexChar = new HexChar();
        for (int i = 84830; i < 87705; i++) {
            String aChar = hexChar.toHex(i);
            System.out.println("区块转换成hex:"+ aChar);
            String post = httpUils.post(aChar);
            int conversion = hexChar.HexConversion(post);
            System.out.println("请求返回值："+conversion);
            UserData.vars.put(i,conversion);
        }

        int sum = 0;
        for (int i = 84830; i < 87705; i++) {
            Integer value = UserData.vars.get(i);
            sum += value;
        }
        System.out.println("thesum:" +sum);
    }
}
