package com.reader.base;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.reader.utils.AppiumUtils;
import com.reader.utils.LogConfiguration;
import com.reader.utils.SelectDriver;

public class BasePrepare {
	public AppiumDriver<WebElement> driver;
	public AppiumUtils appiumUtils;
	
	/**
	 *初始化driver
	 * @param context
	 */
	@BeforeClass
	public void initTest(ITestContext context){
		LogConfiguration.initLog(this.getClass().getSimpleName());
		System.out.println(this.getClass().getSimpleName());
		appiumUtils = new AppiumUtils();
		driver = new SelectDriver().selectDriver(context, appiumUtils);
	}
	
	@AfterClass
	public void cleanTest(){
		driver.quit();
	}
	
	
	
}
