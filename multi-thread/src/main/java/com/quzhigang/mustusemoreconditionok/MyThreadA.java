/**
 * Project Name:multi-thread
 * File Name:MyThreadA.java
 * Package Name:com.quzhigang.mustusemoreconditionok
 * Date:2017年9月19日上午9:59:37
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionok;
/**
 * ClassName:MyThreadA <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午9:59:37 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyThreadA extends Thread {
	
	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		
		myService.awaitA();
		
	}
	
	
	

}

