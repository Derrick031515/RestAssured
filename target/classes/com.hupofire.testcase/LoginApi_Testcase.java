package com.hupofire.testcase;

import com.hupofire.handler.LoginApi_Handler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description;
 * @Author：Derrick
 * @Date：2021/2/28 4:53 下午
 */
public class LoginApi_Testcase {
    private static Logger logger =Logger.getLogger("F");

    @BeforeTest
    public void setUp(){
        LoginApi_Handler.InitializeExcelData();
    }

    @Test
    public void case1() throws Exception {
        String login = LoginApi_Handler.Login(1);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @Test
    public void case2() throws Exception {
        String login = LoginApi_Handler.Login(2);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @Test
    public void case3() throws Exception {
        String login = LoginApi_Handler.Login(3);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @Test
    public void case4() throws Exception {
        String login = LoginApi_Handler.Login(4);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @Test
    public void case5() throws Exception {
        String login = LoginApi_Handler.Login(5);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @Test
    public void case6() throws Exception {
        String login = LoginApi_Handler.Login(6);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @Test
    public void case7() throws Exception {
        String login = LoginApi_Handler.Login(7);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,login api,"
                + login
                + ",v1");
    }

    @AfterTest
    public void tearDown() throws Exception {
        LoginApi_Handler.GetCaseInfo(1);

        LoginApi_Handler.GetCaseInfo(2);

        LoginApi_Handler.GetCaseInfo(3);

        LoginApi_Handler.GetCaseInfo(4);

        LoginApi_Handler.GetCaseInfo(5);

        LoginApi_Handler.GetCaseInfo(6);

        LoginApi_Handler.GetCaseInfo(7);

    }
}
