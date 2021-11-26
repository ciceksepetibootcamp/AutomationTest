package com.selenium.ciceksepetitest;

public class StartTest {
    public static void main(String[] arg) throws InterruptedException {

        TestOne test = new TestOne ();
        test.setUp();
        test.open();
        test.closePopUp();
        test.help();
        test.bestHelpQuestion();
        test.productSearch();
        test.productFilter();

        TestTwo testtwo = new TestTwo();
        testtwo.setUp();
        testtwo.open();
        testtwo.closePopUp();
        testtwo.randomSelect();
        testtwo.productBasket();
        testtwo.continueShopping();
        testtwo.goBasketAndRemove();


    }
}
