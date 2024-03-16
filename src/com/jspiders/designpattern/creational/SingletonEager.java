package com.jspiders.designpattern.creational;

public class SingletonEager {
private static  SingletonEager singletonEager=new SingletonEager();
private SingletonEager() {
	System.out.println("constructor is invoked");
}
public static SingletonEager getObject() {
	return singletonEager;
}
}