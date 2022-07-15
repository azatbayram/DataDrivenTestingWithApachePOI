package com.vytrack.tests.LoginTest;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.Test;

public class loginWithPOM {

    @Test
    public void loginTest(){

        Driver.get().navigate().to(ConfigurationReader.get("url"));
        LoginPage loginPage=new LoginPage();
        loginPage.login(ConfigurationReader.get("driver_username"),ConfigurationReader.get("driver_password"));
        Driver.closeDriver();

    }
}
