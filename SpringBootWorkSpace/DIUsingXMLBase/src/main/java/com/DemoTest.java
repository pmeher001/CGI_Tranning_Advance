package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.display();
		
		Resource res = new ClassPathResource("beans.xml");	// load the xml file 	
		BeanFactory bean = new XmlBeanFactory(res);		// created reference of BeanFactory 
		
		// 1st example 
//		Employee e1	= (Employee)bean.getBean("emp1");		// pull object using id as emp1
//		e1.display();
//		
//		Employee e2	= (Employee)bean.getBean("emp1");		// pull object using id as emp1
//		e2.display();
//		System.out.println("-------------------------");
//		Employee e3	= (Employee)bean.getBean("emp2");		// pull object using id as emp1
//		e3.display();
//		
//		Employee e4	= (Employee)bean.getBean("emp2");		// pull object using id as emp1
//		e4.display();
		
		// 2nd example 
		
//		Employee e5 = (Employee)bean.getBean("emp1");
//		System.out.println(e5);
//		
//		Employee e6 = (Employee)bean.getBean("emp2");
//		System.out.println(e6);
//		
//		Employee e7 = (Employee)bean.getBean("emp3");
//		System.out.println(e7);
		
		// 3rd Example 
		
//		Employee e7 = (Employee)bean.getBean("emp3");
//		System.out.println(e7);
//		
//		Employee e8 = (Employee)bean.getBean("emp4");
//		System.out.println(e8);
//		
//		
//		Employee e9 = (Employee)bean.getBean("emp5");
//		System.out.println(e9);
		
		// 4th Example 
		//Address ad1 = (Address)bean.getBean("add1");
		//System.out.println(ad1);
		
		Employee e10 = (Employee)bean.getBean("emp6");
		System.out.println(e10);
		
	}

}