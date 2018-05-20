package com.reader.pages.guide;

import org.openqa.selenium.By;

public class RecommendChannel {
	
	//title栏
	public static final By RC_BUTTON_BACK = By.id("com.dangdang.reader:id/common_back");	//"返回"按钮
	public static final By RC_TEXT_TITLE = By.id("com.dangdang.reader:id/common_title");   //专栏列表title
	
	//单条专栏数据
	public static final By RC_ITEM_CHANNEL_LIST = By.className("android.widget.RelativeLayout");
	public static final By RC_CHANNEL_ICON = By.id("com.dangdang.reader:id/channel_icon");
	public static final By RC_CHANNEL_TITLE = By.id("com.dangdang.reader:id/recommend_channel_title");
	public static final By RC_CHANNEL_FANS = By.id("com.dangdang.reader:id/recommend_channel_fans");
	public static final By RC_CHANNEL_DESC = By.id("com.dangdang.reader:id/recommend_channel_desc");
	public static final By RC_BUTTON_SUBSCRIBE= By.id("com.dangdang.reader:id/subscribe_btn");
	
	
	

}
