package com.actitime.generics;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class ListenerImplementation extends BaseClass implements ITestListener{
	@Override
	public void onteststart(ITestResult result) {
		
	}
	@Override
	public void ontestsuccess(ITestResult result) {
		}
	@Override
	public void ontestfailure(ITestResult result) {
		String res = result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs("OutputType.File");
		}
	
}
{

}
