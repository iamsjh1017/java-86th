package resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/test.xml");
		Menu menu = (Menu)context.getBean("menu");
		menu.info();
	}
}
