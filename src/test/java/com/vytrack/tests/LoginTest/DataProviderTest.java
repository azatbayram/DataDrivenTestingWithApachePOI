package com.vytrack.tests.LoginTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider
    public Object [][] testData(){
        String [][] data={
                {"Person of Interest", "10"},
                {"Sherlock", "9"},
                {"Breaking Bad", "9"},
                {"The Office", "8"},
                {"Friends", "7"},
                {"Westworld", "10"},
                {"Gotham", "9"},
                {"Dark", "8"}
        };

        return data;
    }

    @Test(dataProvider = "testData")
    public void test1(String TVShow, String rating){

        System.out.println("TV Show: "+TVShow+ " | Rating: "+rating);

    }

    @DataProvider
    public Object [][] testData2(){
        String [][] data={
                {"Azat","27"},
                {"Guvanch", "27"},
                {"Agamyrat","27"},
                {"Myrat", "26"},
                {"Hajy","29"}
        };
        return data;
    }

    @Test(dataProvider = "testData2")
    public void test2(String name, String age){
        System.out.println("Name: "+name+" Age: "+age);
    }

}
