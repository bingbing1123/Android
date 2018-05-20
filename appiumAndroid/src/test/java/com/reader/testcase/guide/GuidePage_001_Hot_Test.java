package com.reader.testcase.guide;

import io.appium.java_client.TouchAction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reader.base.BasePrepare;
import com.reader.pages.guide.ArticlePage;
import com.reader.pages.guide.ChannelPage;
import com.reader.pages.guide.GuidePage;
import com.reader.pageshelper.guide.GuidePageHelper;
import com.reader.utils.AppiumUtils;

public class GuidePage_001_Hot_Test extends BasePrepare {

	/**
	 * 话题测试
	 */
	@Test
	public void hotPage_01_topic() {
		GuidePageHelper.pauseOnGp(appiumUtils, 5);
		GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_GUIDE);
		GuidePageHelper.pauseOnGp(appiumUtils, 2);
		List<WebElement> list_topic = GuidePageHelper.findElementLisOnGp(appiumUtils, GuidePage.GP_BUTTON_TOPIC);
		//int index = (int)Math.random()*(list_topic.size()-1);
		WebElement topic = list_topic.get(1);
		String topic_text = topic.getText().toString();
		topic.click();
		GuidePageHelper.clickOnGp(appiumUtils, ChannelPage.CP_BUTTON_BACK);

		GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_CHANGE);
		List<WebElement> list_topic2 = driver.findElements(GuidePage.GP_BUTTON_TOPIC);
		WebElement topic2 = list_topic2.get(1);
		String topic_text2 = topic.getText().trim();
		topic2.click();
		GuidePageHelper.clickOnGp(appiumUtils, ChannelPage.CP_BUTTON_BACK);
	}

	/**
	 * 查看文章
	 */
	@Test
	public void hotPage_02_article() {
		//GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_GUIDE);
		List<WebElement> list_article = appiumUtils.getElementList(GuidePage.GP_ARTICLE_ITEM);
		WebElement article = list_article.get(1);
		String channel_name = article.findElement(GuidePage.GP_CHANNEL_NAME).getText().toString().trim();
		String article_title = article.findElement(GuidePage.GP_ARTICLE_TITLE).getText().toString().trim();
		article.click();
		appiumUtils.pause(2);
		String channel_detail_name = appiumUtils.findElement(ArticlePage.AP_CHANNEL_TITLE).getText().trim();
		String article_detail_title = appiumUtils.findElement(ArticlePage.AP_ARTICLE_TITLE).getText().trim();
		appiumUtils.isTextCorrect(channel_detail_name, channel_name);
		appiumUtils.isTextCorrect(article_detail_title, article_title);
		driver.findElement(ArticlePage.AP_BUTTON_BACK).click();
	}

	/**
	 * 查看推荐专栏
	 */
	@Test
	public void hotPage_03_recommendChanndel() {
		//GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_GUIDE);
//		Duration duration = Duration.ofSeconds(1);
//		int width = driver.manage().window().getSize().width;
//		int height = driver.manage().window().getSize().height;
//		for (int i = 0; i < height; i += 10) {
//			TouchAction action = new TouchAction(driver).press(width / 2, height * 4 / 5).waitAction(duration)
//					.moveTo(width / 2, height / 5 + i).release();
//			action.perform();
//			try {
//				driver.findElement(By.name("推荐专栏"));
//				System.out.println("找到了推荐专栏");
//				break;
//			} catch (Exception e) {
//			}
		AppiumUtils.swipeToUp();
		AppiumUtils.swipeToUp();
		AppiumUtils.swipeToUp();
			GuidePageHelper.clickOnGp(appiumUtils,GuidePage.GP_RECOMMEND_CHANNEL_MORE);
		

	}

}
