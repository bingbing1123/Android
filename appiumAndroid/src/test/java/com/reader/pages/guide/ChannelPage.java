package com.reader.pages.guide;

import org.openqa.selenium.By;

public class ChannelPage {
	
	//top标题栏
	public static final By CP_BUTTON_BACK = By.id("com.dangdang.reader:id/common_back");		//返回按钮
	public static final By CP_BUTTON_SHARE = By.id("com.dangdang.reader:id/common_menu");		//分享按钮
	
	/**
	 * 频道信息部分
	 */
	public static final By CP_CHANNEL_PIC = By.id("com.dangdang.reader:id/channel_detail_icon");		//专栏图片
	public static final By CP_CHANNEL_INFO = By.id("com.dangdang.reader:id/channel_info");					//专栏信息
	public static final By CP_CHANNEL_TITLE =By.id("com.dangdang.reader:id/channel_detail_title");			//专栏名称
	public static final By CP_CHANNEL_COUNT = By.id("com.dangdang.reader:id/channel_detail_subscribe_count");		//专栏订阅数
	public static final By CP_CHANNEL_DES = By.id("com.dangdang.reader:id/channel_detail_description");				//专栏介绍
	public static final By CP_BUTTON_SUBSCRIBE = By.id("com.dangdang.reader:id/subscribe");			//专栏订阅按钮
	public static final By CP_BUTTON_SUBSCRIBED = By.id("com.dangdang.reader:id/subscribe_tv");		//专栏完成订阅按钮
		
	/**
	 * 专栏作家主页入口
	 */
	public static final By CP_ENTER_WRITER = By.id("com.dangdang.reader:id/column_writer_container");		//作家个人主页入口
	public static final By CP_WRITER_NAME = By.id("com.dangdang.reader:id/channel_detail_initiator_company");		//作家名称
	
	//书单入口
	public static final By CP_ENTER_BOOKLIST = By.id("com.dangdang.reader:id/channel_booklist_container");		//书单入口
	
	/**
	 * 文章列表
	 */
	public static final By CP_CHANNEL_ARTICLE = By.id("com.dangdang.reader:id/root"); 		//单条文章
	
	public static final By CP_ARTICLE_ICON = By.id("com.dangdang.reader:id/article_icon");			//文章icon
	public static final By CP_ARTICLE_TITLE = By.id("com.dangdang.reader:id/article_title");		//文章标题
	public static final By CP_ARTICLE_DES = By.id("com.dangdang.reader:id/article_des");			//文章简介
	
	public static final By CP_READ_COUNT = By.id("com.dangdang.reader:id/browse_count_tv");			//文章阅读数
	public static final By CP_ARTICLE_PRAISE = By.id("com.dangdang.reader:id/praise_count_tv");		//文章点赞数
	public static final By CP_ARTICLE_COMMENT = By.id("com.dangdang.reader:id/comment_count_tv");		//文章评论数
	public static final By CP_ARTICLE_DATE = By.id("com.dangdang.reader:id/article_time");			//文章发布时间
	
	
	

}
