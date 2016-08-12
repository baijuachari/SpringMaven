package com.baiju.springcore.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring lifecycle
 * 1. Instantiate
 * 2. Populate properties
 * 3. Set Bean Name
 * 4. Set Bean factory
 * 5. Pre initialization
 * 6. Initialize Bean
 * 7. Post Initialization
 * 8. Ready to use
 * 9. Destory
 */
// InitializingBean.afterPropertiesSet() for initialization
// DisposableBean.destroy() for destroy
//
//BeanNameAware interface has one method setBeanName()
public class HelloBean implements InitializingBean, DisposableBean, 
			BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

	private String message;
	private String name;

	public HelloBean() {
		System.out.println("default constructor...");
    }
    
	
	public void setMessage(String message) {
		System.out.println("setter message...");
    	this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }
    // InitializingBean 
    public void afterPropertiesSet() throws Exception {
    	System.out.println("afterPropertiesSet() method called......");
    }

	public void myInit() {
		System.out.println("myInit() method called...");
    }
    
	//myDestroy() is specified as destroy-methos in the xml.
	//this is used when we do not implement DisposableBean interface 
	public void myDestroy() {
		System.out.println("myDestroy() method called...");
    }
    //when we use DisposableBean then implement destroy()
	public void destroy() throws Exception {
		System.out.println("destroy() method called......");
		
	}

	// from 
	public void setBeanName(String name) {
		System.out.println("setBeanName() method called......");
		System.out.println("configured Bean name is :"+ name);
		this.name = name;
	}


	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory() method called......");
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext() method called......");		
	}


	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization() method called......");	
		if (bean instanceof HelloBean) {
			System.out.println("postProcessBeforeInitialization() method HELLO BEAN TYPE......");	
		}
		return bean;
	}


	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization() method called......");		
		return bean;
	}
}
