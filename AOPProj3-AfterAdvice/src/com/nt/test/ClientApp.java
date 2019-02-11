package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.WishMSG;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");

		WishMSG proxy=ctx.getBean("pfb",WishMSG.class);
		String result;
		result=proxy.msg();
		System.out.println(result);
	}

}
