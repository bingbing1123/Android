package com.reader.testcase.guide;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.reader.base.BasePrepare;
import com.reader.pages.guide.GuidePage;
import com.reader.pages.guide.WriteStrategyPage;
import com.reader.pageshelper.guide.GuidePageHelper;

public class GuidePage_002_WriteStrategy_Test extends BasePrepare{
	@Test
	public void writeStrategy_01_AddBookFormStore(){
		GuidePageHelper.pauseOnGp(appiumUtils, 5);
		GuidePageHelper.clickOnGp(appiumUtils, GuidePage.GP_BUTTON_GUIDE);
		GuidePageHelper.pauseOnGp(appiumUtils, 2);
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_ENTER_STRATEGY);
		driver.findElement(WriteStrategyPage.WSP_EDIT_TITLE).sendKeys("攻略");
		//GuidePageHelper.enterContent(appiumUtils, WriteStrategyPage.WSP_EDIT_TITLE, "攻略");
		GuidePageHelper.enterContent(appiumUtils, WriteStrategyPage.WSP_EDIT_CONTENT, "这条攻略是从书城＼书架＼收藏添加书后发布的");
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_BOOK);
		GuidePageHelper.clickOnGp(appiumUtils,WriteStrategyPage.WSP_ADD_FROM_STORE);
		GuidePageHelper.enterContent(appiumUtils, WriteStrategyPage.WSP_SEARCH_BOOK, "好");
		List<WebElement> list_book = GuidePageHelper.findElementLisOnGp(appiumUtils, WriteStrategyPage.WSP_SEARCH_MEDIA_ITEM);
		list_book.get(2).click();
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_TO_STRATEGY);
		
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_BOOK);
		GuidePageHelper.clickOnGp(appiumUtils,WriteStrategyPage.WSP_ADD_FROM_SHELF);
		GuidePageHelper.enterContent(appiumUtils, WriteStrategyPage.WSP_SEARCH_BOOK, "快乐");
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_SEARCH_CONCEL);
		
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_BOOK);
		GuidePageHelper.clickOnGp(appiumUtils,WriteStrategyPage.WSP_ADD_FROM_SHELF);
		GuidePageHelper.enterContent(appiumUtils, WriteStrategyPage.WSP_SEARCH_BOOK, "快乐");
		List<WebElement> list_book2 = GuidePageHelper.findElementLisOnGp(appiumUtils, WriteStrategyPage.WSP_SEARCH_MEDIA_ITEM);
		list_book2.get(2).click();
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_TO_STRATEGY);
		
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_BOOK);
		GuidePageHelper.clickOnGp(appiumUtils,WriteStrategyPage.WSP_ADD_FROM_COLLECT);
		List<WebElement> list_book3 = GuidePageHelper.findElementLisOnGp(appiumUtils, WriteStrategyPage.WSP_SEARCH_MEDIA_ITEM);
		int index = (int)Math.random()*(list_book3.size()-1);
		list_book3.get(index).click();
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_ADD_TO_STRATEGY);
		
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_PREVIEW);
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_BACK);
		GuidePageHelper.clickOnGp(appiumUtils, WriteStrategyPage.WSP_BUTTON_COMMIT);
	}

}
