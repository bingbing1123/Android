package com.reader.pages.guide;

import org.openqa.selenium.By;

public class WriteStrategyPage {
	//写攻略入口
	public static final By WSP_ENTER_STRATEGY = By.id("com.dangdang.reader:id/create_iv");
	
	
	//title栏:“返回按钮”、标题、“发布”按钮
	public static final By WSP_BUTTON_BACK = By.id("com.dangdang.reader:id/common_back");
	public static final By WSP_TEXT_TITLE = By.id("com.dangdang.reader:id/common_title");
	public static final By WSP_BUTTON_COMMIT = By.id("com.dangdang.reader:id/common_menu_tv");
	
	/**
	 * 攻略编辑区
	 */
	//攻略标题
	public static final By WSP_EDIT_TITLE = By.id("com.dangdang.reader:id/strategy_title_et");
	//攻略内容
	public static final By WSP_EDIT_CONTENT = By.id("com.dangdang.reader:id/strategy_content_et");
	//“添加书”按钮
	public static final By WSP_BUTTON_ADD_BOOK= By.id("com.dangdang.reader:id/add_btn");
	//“预览”按钮
	public static final By WSP_BUTTON_PREVIEW = By.id("com.dangdang.reader:id/preview_btn");
	//从书城添加
	public static final By WSP_ADD_FROM_STORE = By.id("com.dangdang.reader:id/add_from_store_btn");
	//从书架添加
	public static final By WSP_ADD_FROM_SHELF= By.id("com.dangdang.reader:id/add_from_shelf_btn");
	//从收藏添加
	public static final By WSP_ADD_FROM_COLLECT = By.id("com.dangdang.reader:id/add_from_collect_btn");
	
	//添加攻略时，输入页面
	public static final By WSP_SEARCH_BOOK = By.id("com.dangdang.reader:id/search_et");
	public static final By WSP_SEARCH_CONCEL = By.id("com.dangdang.reader:id/search_confirm");
	public static final By WSP_BUTTON_ADD_TO_STRATEGY = By.id("com.dangdang.reader:id/add_btn");
	public static final By WSP_SEARCH_MEDIA_ITEM = By.id("com.dangdang.reader:id/search_media_item");
	public static final By WSP_STRATEGY_BOOK_DEL = By.id("com.dangdang.reader:id/strategy_book_del");
	
	
	

}
