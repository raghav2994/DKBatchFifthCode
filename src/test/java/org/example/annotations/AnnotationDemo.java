package org.example.annotations;

import org.testng.annotations.*;

public class AnnotationDemo {

    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Before Suite Gets Triggered");
    }

    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("After Suite gets triggered");
    }

    @BeforeTest
    public void beforeTestRun(){
        System.out.println("Before Test Runs method gets triggered");
    }

    @AfterTest
    public void afterTestRunMethod(){
        System.out.println("After Test Runs method gets triggered");

    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class method gets triggered");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class method gets triggered");
    }

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("Before Test method gets triggered");
    }

    @AfterMethod
    public void afterTestMethod(){
        System.out.println("After Test method gets triggered");
    }

    @Test
    public void TESTCASEONE(){
        System.out.println("Test case one");
    }

    @Test
    public void TESTCASETWO(){
        System.out.println("Test case two");
    }
}
