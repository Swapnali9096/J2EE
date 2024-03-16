package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.SingletonEager;
import com.jspiders.designpattern.creational.SingletonLazy;

public class SingletonLazyMain {
public static void main(String[] args) {
	SingletonEager singletonLazy1=SingletonEager.getObject();
	System.out.println(singletonLazy1);
	SingletonEager singletonLazy2=SingletonEager.getObject();
	System.out.println(singletonLazy2);
}
}