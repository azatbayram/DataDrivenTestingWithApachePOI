package com.vytrack.tests.LoginTest;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.tests.TestBase;
import com.vytrack.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {

    @DataProvider
    public Object [][] testData(){

        ExcelUtil qa3Short=new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA3-short");

        String [][] dataArray= qa3Short.getDataArrayWithoutFirstRow();

        return dataArray;

    }

    @Test(dataProvider = "testData")
    public void test(String username, String password, String firstName, String lastName){

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);

        DashboardPage dashboardPage=new DashboardPage();
        String actualUsername=dashboardPage.getUserName();
        String expectedUsername=firstName+" "+lastName;

        Assert.assertEquals(actualUsername,expectedUsername);

    }
}
