package com.dubbo.consumer.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alei.user.UserService;
import com.alei.user.model.User;

public class ServerMain {
	private static String obj=new String();
	private static Logger log = LoggerFactory.getLogger(ServerMain.class.getCanonicalName());
	public static void main(String[] args) {
		try {
			log.info("====>> begin start server");
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });
			context.start();
			UserService userService = context.getBean("userService", UserService.class);
			User user = userService.getByUserName("dingjianglei");
			log.info("========>>"+user.toString());
			log.info("====>> success start server");
			synchronized(obj){
				obj.wait();
			}
		}catch (Exception e) {
			log.info("====>> fail start server");
		}
	}
}
