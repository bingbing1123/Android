package com.reader.pages;

import org.openqa.selenium.By;

public class GuidePage {
	
	//底部tab:导读、书城、书房、社区、我的
	public static final By GP_BUTTON_GUIDE = By.id("com.dangdang.reader:id/tab_home_ll");
	public static final By GP_BUTTON_STORE = By.id("com.dangdang.reader:id/tab_store_ll");
	public static final By GP_BUTTON_SHELF = By.id("com.dangdang.reader:id/tab_shelf_ll");
	public static final By GP_BUTTON_FIND = By.id("com.dangdang.reader:id/tab_find_rl");
	public static final By GP_BUTTON_PERSONAL = By.id("com.dangdang.reader:id/tab_personal_rl");
	
	/**
	 * 导读——推荐
	 */
	//标题栏
	public static final By GP_BUTTON_HOT = By.id("com.dangdang.reader:id/hot_tv");		//推荐
	public static final By GP_BUTTON_ATTEN =By.id("com.dangdang.reader:id/atten_tv");		//订阅
	public static final By GP_BUTTON_SEARCH = By.id("com.dangdang.reader:id/search_iv");	//搜索
	
	//热门话题部分
	public static final By GP_BUTTON_CHANGE = By.id("com.dangdang.reader:id/change_tv");  //换一换
	public static final By GP_BUTTON_TOPIC = By.id("com.dangdang.reader:id/title_tv"); 		//话题
	
	//热门文章部分
	public static final By GP_CHANNEL_NAME= By.id("com.dangdang.reader:id/author_tv");		//频道名称
	public static final By GP_ARTICLE_ITEM = By.id("com.dangdang.reader:id/root_rl"); 		//单条文章 
	public static final By GP_ARTICLE_PIC = By.id("com.dangdang.reader:id/pic_iv");			//文章图片
	public static final By GP_ARTICLE_TITLE = By.id("com.dangdang.reader:id/title_tv");		//文章title
	public static final By GP_ARTICLE_CONTENT = By.id("com.dangdang.reader:id/content_tv");		//文章内容
	public static final By GP_NUM_READ = By.id("com.dangdang.reader:id/read_num_tv");			//文章阅读数
	public static final By GP_NUM_PRAISE = By.id("com.dangdang.reader:id/praise_num_tv");		//文章点赞数
	public static final By GP_NUM_COMMENT =By.id("com.dangdang.reader:id/comment_num_tv");		//文章评论数
	public static final By GP_ENTER_STRATEGY = By.id("com.dangdang.reader:id/create_iv");		//攻略入口
	
	/**
	 * 推荐专栏部分
	 */
	public static final By GP_RECOMMEND_CHANNEL_TEXT = By.name("推荐专栏");
	public static final By GP_RECOMMEND_CHANNEL_MORE = By.id("com.dangdang.reader:id/more_tv");		//更多专栏入口
	public static final By GP_RECOMMEND_CHANNEL_CARD = By.id("com.dangdang.reader:id/card_0");		//这三个专栏的id，分别是card(0,1,2)
	public static final By GP_RECOMMEND_CHANNEL_CARD_IMG = By.id("com.dangdang.reader:id/head_view");  //专栏头像
	public static final By GP_RECOMMEND_CHANNEL_CARD_TITLE = By.id("com.dangdang.reader:id/title_tv");		//专栏名
	public static final By GP_RECOMMEND_CHANNEL_CARD_FUNS = By.id("com.dangdang.reader:id/fans_num_tv");		//专栏粉丝
	public static final By GP_RECOMMEND_CHANNEL_CARD_SUBSCRIBE =By.id("com.dangdang.reader:id/subscribe_btn");	//专栏订阅按钮
	
	//以下是推荐专栏列表
	public static final By GP_RECOMMEND_CHANNEL_BACK = By.id("com.dangdang.reader:id/common_back");		//推荐专栏页“返回”按钮
	public static final By GP_RECOMMEND_PAGE_TITLE = By.id("com.dangdang.reader:id/common_title");		//推荐专栏页title
	public static final By GP_RECOMMEND_CHANNEL_LIST = By.id("com.dangdang.reader:id/recommend_column_list");		//专栏列表
	public static final By GP_RECOMMEND_CHANNEL_ICON = By.id("com.dangdang.reader:id/channel_icon");		//推荐专栏页,专栏icon
	public static final By GP_RECOMMEND_CHANNEL_TITLE = By.id("com.dangdang.reader:id/recommend_channel_title");	//推荐专栏页,专栏标题
	public static final By GP_RECOMMEND_CHANNEL_FANS = By.id("com.dangdang.reader:id/recommend_channel_fans");		//推荐专栏页,专栏粉丝
	public static final By GP_RECOMMEND_CHANNEL_DEC = By.id("com.dangdang.reader:id/recommend_channel_desc");		//推荐专栏页,专栏描述
	public static final By GP_RECOMMEND_CHANNEL_SUB = By.id("com.dangdang.reader:id/subscribe_btn");			//推荐专栏页,专栏订阅按钮
	
	
	
	/**
	 * 导读——订阅,单条文章布局和推荐一样
	 */
	

}
