package com.reader.utils;

import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

/**
 * 动态生成各个模块中每条用例的日志，运行完成用例之后请到result/log目录下查看
 * @author wangbing
 *
 */

public class LogConfiguration {

	public static void initLog(String fileName){
		//获取到模块名字
		String functionName = getFunctionName(fileName);
		System.out.println(functionName);
		//声明日志文件存储路径以及文件名、格式
	    final String logFilePath  = "./result/logs/"+functionName+"/"+fileName+".log";  
		Properties prop = new Properties();
		//配置日志输出的格式
		prop.setProperty("log4j.rootLogger","info, toConsole, toFile");
		prop.setProperty("log4j.appender.file.encoding","UTF-8" );
		prop.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
		prop.setProperty("log4j.appender.toConsole.Target","System.out");
		prop.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout ");
		prop.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");		
		prop.setProperty("log4j.appender.toFile", "org.apache.log4j.DailyRollingFileAppender");
		prop.setProperty("log4j.appender.toFile.file", logFilePath);
		prop.setProperty("log4j.appender.toFile.append", "false");
		prop.setProperty("log4j.appender.toFile.Threshold", "info");
		prop.setProperty("log4j.appender.toFile.layout", "org.apache.log4j.PatternLayout");
		prop.setProperty("log4j.appender.toFile.layout.ConversionPattern", "[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
		//使配置生效
		PropertyConfigurator.configure(prop);
		
	}
	
	/**
	 * 获取模块的名字(类名)
	 * @return 
	 */
	public static String getFunctionName(String fileName){
		String functionName = null;
		int firstUnderlineIndex = fileName.indexOf("_");
		functionName = fileName.substring(0, firstUnderlineIndex-4);
		return functionName;
	}

	
}
