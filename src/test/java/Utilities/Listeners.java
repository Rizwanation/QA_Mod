package Utilities;

import UI.TestCases.base;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends base implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("Starting test : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Successful *********!");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        takeSS(result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
