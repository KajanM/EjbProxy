package com.arachchi.ejb.core.service.impl;

import com.arachchi.ejb.core.service.ExampleTest;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by nuran on 4/13/15.
 */
@ApplicationScoped
public class ExampleTestImpl implements ExampleTest {
	private int a =0;
	@Override
	public void test() {
		System.out.println("Test "+a);
	}
}
