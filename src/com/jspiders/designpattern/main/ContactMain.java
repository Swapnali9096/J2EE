package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.Contact;
import com.jspiders.designpattern.creational.ContactBuilder;

public class ContactMain {
public static void main(String[] args) {
	Contact contact=new com.jspiders.designpattern.creational.ContactBuilder().setFirstName("ram").setMobile(9875678756l).buildContact();
	System.out.println(contact);
}
}