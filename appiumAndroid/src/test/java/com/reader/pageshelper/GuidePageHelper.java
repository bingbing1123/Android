package com.reader.pageshelper;

import org.openqa.selenium.By;

import com.reader.utils.AppiumUtils;

public class GuidePageHelper {
	
	public static void clickOnGp(AppiumUtils appiumUtils, By byElement){
		appiumUtils.click(byElement);
	}
	
	public static void containsOnGP(AppiumUtils appiumUtils,String expected,By byElement){
		appiumUtils.isContains(byElement, expected);
	}

}
