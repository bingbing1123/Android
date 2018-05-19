package com.reader.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static org.testng.AssertJUnit.*; 

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class AppiumUtils {
	
	public static AndroidDriver<WebElement> driver;
	/**定义日志输出对象*/
	public Logger logger = Logger.getLogger(AppiumUtils.class);
	
	/**
	 * 得到driver
	 * @return 
	 */
	public AndroidDriver<WebElement> getDriver(String url,DesiredCapabilities capabilities,String platform){
		if(platform.equalsIgnoreCase("android")){
			try {
				driver = new AndroidDriver<WebElement>(new URL(url),capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
		}else if(platform.equalsIgnoreCase("ios")){
			try {
				driver = new AndroidDriver<WebElement>(new URL(url),capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return driver;
	}
	
	//通过By对象 去查找某个元素
	public WebElement findElement(By byElement){
		return driver.findElement(byElement);
	}
	
	//通过By对象 去查找一组元素
	public List<WebElement> getElementList(By byElement){
		return driver.findElements(byElement);
	}
	
	//点击元素
	public void click(By byElement){
		WebElement element = findElement(byElement);
		try {
			element.click();
			logger.info("点击元素："+getLocatorByElement(element, ">"));
		} catch (Exception e) {
			logger.error("点击元素:"+getLocatorByElement(element, ">")+"失败", e);
			Assert.fail("点击元素:"+getLocatorByElement(element, ">")+"失败", e);
		}
	}
	
	//获取文本
	public String getText(By byElement){
		return findElement(byElement).getText().trim();
	}
	
	//判断文本是不是和需求要求的文本一致
	public void isTextCorrect(String actual, String expected){
		try {
			assertEquals(expected, actual);
		} catch (AssertionError e) {
			logger.info("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
			Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
		}
		logger.info("找到了期望的文字[" + expected + "]");
	}
	
	//清空元素内容
	public void clear(By byElement){
		WebElement element = findElement(byElement);
		element.clear();
		logger.info("清空元素" + getLocatorByElement(element, ">") + "上的内容");
	}
	
	//输入内容
	public void typeContent(By byElement,String str){
		WebElement element = findElement(byElement);
		element.sendKeys(str);
		logger.info("在控件" + getLocatorByElement(element, ">") + "上的输入" + str);
	}
	
	//暂停当前用例的执行，暂停的时间为：sleepTime
	public void pause(int sleepTime){
		if(sleepTime <= 0){
			return;
		}else {
			try {
				TimeUnit.SECONDS.sleep(sleepTime);
				logger.info("暂停:" + sleepTime + "秒");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//得到实际，判断实际文本是否包含期望文本
	public void isContains(By byElement,String expect){
		String actual = findElement(byElement).getText().trim();
		try {
			assertTrue(actual.contains(expect));
		} catch (AssertionError e) {
			logger.info("跳转正确，得到的[" + actual + "] 里没有［" + expect + "]");
			Assert.fail("跳转正确，得到的[" + actual + "] 里没有［" + expect + "]");
		}
		logger.info("跳转异常，得到的[" + actual + "] 里包含［" + expect + "]");
	}
	
	//判断元素是否显示
	public boolean isDisplay(By byElement){
		try {
			assertTrue(findElement(byElement).isDisplayed());
		} catch (AssertionError e) {
			logger.info("结果未出现");
		}
		logger.info("找到结果");
		return false;
	}
	//判断元素是否存在
	public boolean doesElementsExist(By byElement){
		try {
			findElement(byElement);
			logger.info("元素存在");
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	//判断元素是否被选中
	public void isSelected(By byElement){
		try {
			assertTrue(findElement(byElement).isSelected());
		} catch (AssertionError e) {
			logger.info("该元素没有被选择");
			Assert.fail("该元素没有被选择");
		}
		logger.info("该元素已被选择");
	}
	
	//随机点击列表元素
	public void clickInIndex(By byElement){
		List<WebElement> list = getElementList(byElement);
		try {
			int index = (int) (Math.random()*list.size());
			list.get(index).click();
		} catch (AssertionError e) {
			logger.info("取到的随机数范围溢出");
		}
	}
	
	/** 根据元素来获取此元素的定位值 */
	public String getLocatorByElement(WebElement element, String expectText) {
		String text = element.toString();
		String expect = null;
		try {
			expect = text.substring(text.indexOf(expectText) + 5, text.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("failed to find the string [" + expectText + "]");
		}
		return expect;
	}
	
	//向上滑动
	public void swipeToUp(){
		Duration duration=Duration.ofSeconds(1);
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
//		driver.swipe(width/2, height*3/4, width/2, height/4, duration);
		TouchAction action = new TouchAction(driver).press(width/2,height * 4/5).waitAction(duration).moveTo(width /2, height /4).release();
		action.perform();
	}
	
	//向下滑动
	public void swipeToDown(){
		Duration duration=Duration.ofSeconds(1);
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		TouchAction action = new TouchAction(driver).press(width / 2,height/4).waitAction(duration).moveTo(width /2, height* 3/4).release();
		action.perform();
	}
	
	//向左滑动
	public void swipeToLeft(){
		Duration duration=Duration.ofSeconds(1);
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		TouchAction action = new TouchAction(driver).press(width-10,height/2).waitAction(duration).moveTo(width/4, height/2).release();
		action.perform();
	}
	
	//向右滑动
	public void swipeToRight(){
		Duration duration=Duration.ofSeconds(1);
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		TouchAction action = new TouchAction(driver).press(10,height/2).waitAction(duration).moveTo(width * 3/4, height/2).release();
		action.perform();
	}
	
	//跳转到webview界面，通过切换context实现Native app 和Webview切换
	public void switchToWebView(String contextName){
		Set<String> contexts = driver.getContextHandles();
		System.out.println(contexts);
		for(String context : contexts){
			if(context.contains(contextName)){
				driver.context(contextName);
				logger.info("跳转" + context + "页面成功");
			}
		}
	}
	
	public void clickInListById(By byElement,int index){
		List<WebElement> list = getElementList(byElement);
		list.get(index).click();
	}
	
	

}
