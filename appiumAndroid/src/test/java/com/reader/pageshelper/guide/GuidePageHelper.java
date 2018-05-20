package com.reader.pageshelper.guide;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reader.utils.AppiumUtils;

public class GuidePageHelper {
	//导读的上的点击操作
	public static void clickOnGp(AppiumUtils appiumUtils, By byElement){
		appiumUtils.click(byElement);
	}
	//导读上，判断得到的元素是否包含期望的文本
	public static void containsOnGp(AppiumUtils appiumUtils,String expected,By byElement){
		appiumUtils.isContains(byElement, expected);
	}
	//得到元素list
	public static List<WebElement> findElementLisOnGp(AppiumUtils appiumUtils,By Element){
		return appiumUtils.getElementList(Element);
	}
	
	//暂停
	public static void pauseOnGp(AppiumUtils appiumUtils,int time){
		appiumUtils.pause(time);
	}

}
