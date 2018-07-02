package com.dmj.springmvn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
