package com.hupofire.testcase;

import com.hupofire.handler.LoginApi_Handler;
import com.hupofire.handler.LogoutApi_Handler;
import com.hupofire.handler.MenuListApi_Handler;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description;
 * @Author：Derrick
 * @Date：2021/2/28 4:53 下午
 */
public class LogoutApi_Testcase {
    private static Logger logger =Logger.getLogger("F");

    @BeforeTest
    public void setUp(){
        LogoutApi_Handler.InitializeExcelData();
    }

    @Test
    public void case1() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(1);
        String msg_Exp = "logout success";
        String menuInfo = LogoutApi_Handler.LogoutList(1, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case2() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(2);
        String msg_Exp = "Unknown user info, logout fail.";
        String menuInfo = LogoutApi_Handler.LogoutList(2, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case3() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(2);
        String msg_Exp = "Unknown user info, logout fail.";
        String menuInfo = LogoutApi_Handler.LogoutList(3, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @AfterTest
    public void tearDown() throws Exception {
        MenuListApi_Handler.GetCaseInfo(1);

        MenuListApi_Handler.GetCaseInfo(2);

        MenuListApi_Handler.GetCaseInfo(3);

    }
}
