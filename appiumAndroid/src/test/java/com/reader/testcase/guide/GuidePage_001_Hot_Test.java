package com.reader.testcase.guide;

import io.appium.java_client.TouchAction;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reader.base.BasePrepare;
import com.reader.pages.guide.ArticlePage;
import com.reader.pages.guide.ChannelPage;
import com.reader.pages.guide.GuidePage;
import com.reader.pages.guide.RecommendChannel;
import com.reader.pageshelper.guide.GuidePageHelper;
import com.reader.utils.AppiumUtils;

public class GuidePage_001_Hot_Test extends BasePrepare {

	public Logger logger = Logger.getLogger(GuidePage_001_Hot_Test.class);

	/**
	 * 话题测试
	 */
	@Test
	public void GuidePage_01_topicList() {
		GuidePageHelper.pauseOnGp(appiumUtils, 5);
		GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_GUIDE);
		GuidePageHelper.pauseOnGp(appiumUtils, 1);

		WebElement topic_root = driver.findElement(By.id("com.dangdang.reader:id/flow_layout"));
		List<WebElement> topic_list = topic_root.findElements(By.className("android.widget.RelativeLayout"));
		WebElement topic = topic_list.get(2);
		WebElement topic_text = topic.findElement(GuidePage.GP_ITEM_TOPIC);
		String str = topic_text.getText().trim();

		try {
			if (topic.findElement(By.id("com.dangdang.reader:id/icon_iv")).isDisplayed()) {
				topic.click();
				appiumUtils.isContains(ChannelPage.CP_CHANNEL_TITLE, str);
				logger.info("跳转到专栏详情页");
			}
		} catch (Exception e) {
			topic.click();
			appiumUtils.isContains(By.id("com.dangdang.reader:id/common_title"), str);
			logger.info("跳转到话题详情页");
		}

		GuidePageHelper.clickOnGp(appiumUtils, ChannelPage.CP_BUTTON_BACK);

		GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_CHANGE);

		WebElement topic_root2 = driver.findElement(By.id("com.dangdang.reader:id/flow_layout"));
		List<WebElement> topic_list2 = topic_root2.findElements(By.className("android.widget.RelativeLayout"));
		WebElement topic2 = topic_list2.get(2);
		WebElement topic_text2 = topic2.findElement(GuidePage.GP_ITEM_TOPIC);
		String str2 = topic_text2.getText().trim();

		try {
			if (topic2.findElement(By.id("com.dangdang.reader:id/icon_iv")).isDisplayed()) {
				topic2.click();
				appiumUtils.isContains(ChannelPage.CP_CHANNEL_TITLE, str2);
				logger.info("跳转到专栏详情页");
			}
		} catch (Exception e) {
			topic2.click();
			appiumUtils.isContains(By.id("com.dangdang.reader:id/common_title"), str2);
			logger.info("跳转到话题详情页");
		}
		GuidePageHelper.clickOnGp(appiumUtils, ChannelPage.CP_BUTTON_BACK);
	}

	/**
	 * 话题详情页发布话题
	 */
	public void GuidePage_02_writeTopic() {
		WebElement topic_root = driver.findElement(By
				.id("com.dangdang.reader:id/flow_layout"));
		List<WebElement> topic_list = topic_root.findElements(By
				.className("android.widget.RelativeLayout"));
		WebElement topic = topic_list.get(2);

		try {
			if (topic.findElement(By.id("com.dangdang.reader:id/icon_iv"))
					.isDisplayed()) {
				topic.click();
				logger.info("跳转到专栏详情页");
				// 发布话题测试代码
			}
		} catch (Exception e) {
			topic.click();
			logger.info("跳转到话题详情页");
			// 专栏详情页测试代码
		}

	}

	/**
	 * 查看文章
	 */
	public void GuidePagee_03_article() {
		List<WebElement> list_article = appiumUtils
				.getElementList(GuidePage.GP_ARTICLE_ITEM);
		WebElement article = list_article.get(1);
		String channel_name = article.findElement(GuidePage.GP_CHANNEL_NAME)
				.getText().trim();
		String article_title = article.findElement(GuidePage.GP_ARTICLE_TITLE)
				.getText().trim();
		article.click();
		appiumUtils.pause(1);
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
	public void GuidePage_04_recommendChanndel() {
		GuidePageHelper.pauseOnGp(appiumUtils, 5);
		GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_GUIDE);
		GuidePageHelper.pauseOnGp(appiumUtils, 1);
		Duration duration = Duration.ofSeconds(1);
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		for (int i = 0; i < height; i += 100) {
			TouchAction action = new TouchAction(driver)
					.press(width / 2, height * 4 / 5).waitAction(duration)
					.moveTo(width / 2, height/ 5 + i).release();
			action.perform();
			GuidePageHelper.pauseOnGp(appiumUtils, 1);
			try {
				GuidePageHelper.clickOnGp(appiumUtils,GuidePage.GP_RECOMMEND_CHANNEL_MORE);
				logger.info("找到了推荐专栏");
				break;
			} catch (Exception e) {
				logger.info("没有找到推荐专栏");
			}
		}
			GuidePageHelper.clickOnGp(appiumUtils,RecommendChannel.RC_BUTTON_BACK);
		}

}
