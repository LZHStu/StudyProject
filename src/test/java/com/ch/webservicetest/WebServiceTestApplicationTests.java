package com.ch.webservicetest;

import com.ch.webservicetest.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebServiceTestApplicationTests {

	@Autowired
	Person persion;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testConService(){
		boolean b = ioc.containsBean("testCofigService");
		System.out.println(b);

	}

	@Test
	public void contextLoads() {
		System.out.println(persion);
	}

}
