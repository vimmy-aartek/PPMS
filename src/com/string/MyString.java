package com.string;

public class MyString {
public static void main(String[] args) {
	String s1="abc";
	String s2=new String("abc");
	
	boolean s3=s1.equals(s2);
	System.out.println("s1 equals s2:"+s3);
	}
}
