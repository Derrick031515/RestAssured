package com.hupofire.controller;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
/**
 * @description;
 * @Author：Derrick
 * @Date：2021/2/28 11:44 上午
 */
public class LoginApi_Controller {
    static String code = null;
    static String msg = null;
    static String access_token = null;

    public static Object[] GetAccessTokin(int id,String apiUrl,String param){
        Response response = given()
                .log().all()
                .config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
                .request()
                .body(param)
        .when()
                .post(apiUrl)
        .then()
                .extract()
                .response();
        response.print();
        String json = response.asString();

        code = response.jsonPath().getString("code");
        msg = response.jsonPath().getString("message");
        if("200".equals(code)){
            access_token = response.jsonPath().getString("access_token");
        }

        Object[] LoginInfo = {json,code,msg,access_token};
        return LoginInfo;
    }
}
