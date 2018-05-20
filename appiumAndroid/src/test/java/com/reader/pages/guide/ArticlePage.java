package com.reader.pages.guide;

import org.openqa.selenium.By;

public class ArticlePage {
	
	//top标题栏:“返回”、“分享”按钮
	public static final By AP_BUTTON_BACK = By.id("com.dangdang.reader:id/common_back");
	public static final By AP_BUTTON_SHARE = By.id("com.dangdang.reader:id/common_menu_btn");
	
	/**
	 * 专栏信息
	 */
	public static final By AP_CHANNEL_INFO = By.id("com.dangdang.reader:id/detaild_channel_id");		//专栏信息
	public static final By AP_CHANNEL_ICON = By.id("com.dangdang.reader:id/channel_detail_icon");		//专栏icon
	public static final By AP_CHANNEL_TITLE = By.id("com.dangdang.reader:id/channel_detail_title");		//专栏title
	public static final By AP_CHANNEL_DEC = By.id("com.dangdang.reader:id/channel_detail_subscribe");		//专栏描述
	public static final By AP_CHANNEL_SUBSCRIBE = By.id("com.dangdang.reader:id/subscribe_btn");		//订阅按钮
	
	
	/**
	 * 文章详情部分
	 */
	public static final By AP_ARTICLE_TITLE = By.id("com.dangdang.reader:id/title_id");			//文章title
	public static final By AP_ARTICLE_AUTHOR = By.id("com.dangdang.reader:id/author_layout_id");		//作者列，是一个LinearLayout，里面的作者名的index是1
	
	//以下是文章正文部分，是h5(webview)
	/**
	 * 以下是文章关联的电子书的信息
	 */
	public static final By AP_LINK_EBOOK = By.id("com.dangdang.reader:id/buy_ebook_id"); 		//文章关联的电子书
	public static final By AP_EBOOK_ICON = By.id("com.dangdang.reader:id/bookinfo_cover");		//电子书的封面
	public static final By AP_EBOOK_CAPTION = By.id("com.dangdang.reader:id/bookinfo_caption");		//电子书的书名
	public static final By AP_EBOOK_AUTHOR = By.id("com.dangdang.reader:id/bookinfo_author");		//电子书的作者
	public static final By AP_EBOOK_DIGEST = By.id("com.dangdang.reader:id/bookinfo_digest");		//电子书的简介
	public static final By AP_EBOOK_PRICE = By.id("com.dangdang.reader:id/bookinfo_price");			//电子书的价格
	public static final By AP_BUTTON_EBOOK_DETAIL = By.id("com.dangdang.reader:id/bookinfo_detail");		//电子书单品页入口
	
	//文章的赞、评论信息
	public static final By AP_ARTICLE_READ_NUM = By.id("com.dangdang.reader:id/channel_read_num");	
	public static final By AP_ARTICLE_PRISE_NUM = By.id("com.dangdang.reader:id/channel_prise_num");
	public static final By AP_ARTICLE_COMMENT_NUM = By.id("com.dangdang.reader:id/channel_comment_num");
	
	/**
	 * 打赏功能
	 */
	public static final By AP_BUTTON_REWARD = By.id("com.dangdang.reader:id/reward_btn");	//打赏按钮
	public static final By AP_REWARD_TITLE = By.id("com.dangdang.reader:id/tv_title");		//打赏title
	public static final By AP_REWARD_CLOSE = By.id("com.dangdang.reader:id/btn_reward_close");   //打赏页面关闭按钮
	public static final By AP_INPUT_REWARD = By.id("com.dangdang.reader:id/et_reward_input");		//打赏金输入框
	public static final By AP_REWARD_SUBMIT = By.id("com.dangdang.reader:id/btn_reward_submit");	//确认打赏按钮
	
	//相关书籍部分
	public static final By AP_LINK_BOOKLIST_TITLE = By.id("com.dangdang.reader:id/everyone_look_tv");		//相关书籍的文本
	public static final By AP_LINK_BOOKLIST = By.id("com.dangdang.reader:id/content_ll");	//相关书籍的list
	
	//相关阅读模块
	public static final By AP_LINK_READE = By.id("com.dangdang.reader:id/root");  //相关阅读，每一条id相同都是RelativeLayout
	public static final By AP_LINK_READE_TITLE = By.id("com.dangdang.reader:id/text_article_title"); 
	
	//评论框部分
	public static final By AP_INPUT_COMMENT = By.id("com.dangdang.reader:id/comment_rl");		//评论输入框
	public static final By AP_BUTTON_LIKE =By.id("com.dangdang.reader:id/detail_like_iv");		//点赞按钮
	public static final By AP_LIKE_COUNT = By.id("com.dangdang.reader:id/like_count_tv");		//赞的数目
	public static final By AP_BUTTON_COLLECT = By.id("com.dangdang.reader:id/detail_collect_iv");		//收藏按钮
	
	public static final By AP_WRITE_COMMENT = By.id("com.dangdang.reader:id/write_comment_et");		//写评论
	public static final By AP_WRITE_COMMENT_IMG = By.id("com.dangdang.reader:id/write_comment_img");	//添加图片入口
	public static final By AP_WRITE_COMMENT_SEND = By.id("com.dangdang.reader:id/write_comment_send");		//发送按钮
	
	
	
	

}
