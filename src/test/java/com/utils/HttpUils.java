package com.utils;

import com.alibaba.fastjson.JSONPath;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 1. @description:
 * 2. @author: Dawn
 * 3. @time: 2022/6/7
 */
public class HttpUils{
    public String post(String params) {
        Map<String, Object> headers = new HashMap();
        String str = "{\"jsonrpc\":\"2.0\",\"method\":\"eth_getBlockByNumber\",\"params\":[\"0x" +params + "\",true],\"id\":1}";
        System.out.println(str);
        headers.put("Content-Type", "application/json");
        String body = given()
                .headers(headers)
                .body(str)
                .post("https://godwoken-testnet-v1.ckbapp.dev/")
                .asString();
        System.out.println("打印接口返回值：" + body);
        String read = (String) JSONPath.read(body, "$.result.size");
//        String read = (String) JSONPath.read(body, "$.result.timestamp");
        System.out.println("获取断言返回值：" + read);
        String substring = read.substring(2);
        System.out.println("字符串截取：" + substring);
        return substring;
    }
}
