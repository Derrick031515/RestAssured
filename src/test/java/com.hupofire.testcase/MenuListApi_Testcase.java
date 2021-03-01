package com.hupofire.testcase;

import com.hupofire.controller.MenuListApi_Controller;
import com.hupofire.handler.LoginApi_Handler;
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
public class MenuListApi_Testcase {
    private static Logger logger =Logger.getLogger("F");

    @BeforeTest
    public void setUp(){
        MenuListApi_Handler.InitializeExcelData();
    }

    @Test
    public void case1() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(1);
        String msg_Exp = "{\"breakfast\":[{\"menu_name\":\"Steamed Dumplings\",\"menu_nunber\":\"01\",\"menu_price\":5.5},{\"menu_name\":\"mixed congee\",\"menu_nunber\":\"02\",\"menu_price\":3.0},{\"menu_name\":\"Deep-Fried Dough Sticks\",\"menu_nunber\":\"03\",\"menu_price\":1.5},{\"menu_name\":\"Tea egg\",\"menu_nunber\":\"04\",\"menu_price\":1.0},{\"menu_name\":\"Doubao\",\"menu_nunber\":\"05\",\"menu_price\":1.5},{\"menu_name\":\"Clay oven rolls\",\"menu_nunber\":\"06\",\"menu_price\":2.0}],\"code\":\"200\",\"dinner\":[{\"menu_name\":\"Stir fried pork with chili\",\"menu_nunber\":\"13\",\"menu_price\":21.0},{\"menu_name\":\"Sliced pork soup with peas\",\"menu_nunber\":\"14\",\"menu_price\":15.0},{\"menu_name\":\"Original pork rolls\",\"menu_nunber\":\"15\",\"menu_price\":26.0},{\"menu_name\":\"Sour cabbage\",\"menu_nunber\":\"16\",\"menu_price\":20.0},{\"menu_name\":\"Sauteed Potato, Green Pepper and Eggplant\",\"menu_nunber\":\"17\",\"menu_price\":25.5},{\"menu_name\":\"Spareribs with brown sauce\",\"menu_nunber\":\"18\",\"menu_price\":39.0}],\"lunch\":[{\"menu_name\":\"Kung Pao Chicken\",\"menu_nunber\":\"07\",\"menu_price\":17.0},{\"menu_name\":\"double cooked pork slices\",\"menu_nunber\":\"08\",\"menu_price\":25.0},{\"menu_name\":\"Sweet and Sour Spare Ribs\",\"menu_nunber\":\"09\",\"menu_price\":35.0},{\"menu_name\":\"Fried pork slices with garlic\",\"menu_nunber\":\"10\",\"menu_price\":30.0},{\"menu_name\":\"sour and spicy shredded potatoes\",\"menu_nunber\":\"11\",\"menu_price\":25.5},{\"menu_name\":\"Braised eggplant\",\"menu_nunber\":\"12\",\"menu_price\":32.0}]}";
        String menuInfo = MenuListApi_Handler.MenuList(1, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case2() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(1);
        String msg_Exp = "[{\"menu_name\":\"Stir fried pork with chili\",\"menu_nunber\":\"13\",\"menu_price\":21.0},{\"menu_name\":\"Sliced pork soup with peas\",\"menu_nunber\":\"14\",\"menu_price\":15.0},{\"menu_name\":\"Original pork rolls\",\"menu_nunber\":\"15\",\"menu_price\":26.0},{\"menu_name\":\"Sour cabbage\",\"menu_nunber\":\"16\",\"menu_price\":20.0},{\"menu_name\":\"Sauteed Potato, Green Pepper and Eggplant\",\"menu_nunber\":\"17\",\"menu_price\":25.5},{\"menu_name\":\"Spareribs with brown sauce\",\"menu_nunber\":\"18\",\"menu_price\":39.0}]";
        String menuInfo = MenuListApi_Handler.MenuList(2, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case3() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(1);
        String msg_Exp = "null";
        String menuInfo = MenuListApi_Handler.MenuList(3, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case4() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(1);
        String msg_Exp = "null";
        String menuInfo = MenuListApi_Handler.MenuList(4, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case5() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(1);
        String msg_Exp = "null";
        String menuInfo = MenuListApi_Handler.MenuList(5, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case6() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(2);
        String msg_Exp = "Unknownuserinfo,pleasere-login.";
        String menuInfo = MenuListApi_Handler.MenuList(6, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

    @Test
    public void case7() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(2);
        String msg_Exp = "Unknownuserinfo,pleasere-login.";
        String menuInfo = MenuListApi_Handler.MenuList(7, access_token,msg_Exp);
        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + ",heartTester,menu api,"
                + menuInfo
                + ",v1");
    }

   @Test
    public void case8() throws Exception {
        String access_token = LoginApi_Handler.LoginToAccessToken(2);
       String msg_Exp = "Unknown user info, please re-login.";
       String menuInfo = MenuListApi_Handler.MenuList(8, access_token,msg_Exp);
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

        MenuListApi_Handler.GetCaseInfo(4);

        MenuListApi_Handler.GetCaseInfo(5);

        MenuListApi_Handler.GetCaseInfo(6);

        MenuListApi_Handler.GetCaseInfo(7);

        MenuListApi_Handler.GetCaseInfo(8);

    }
}
