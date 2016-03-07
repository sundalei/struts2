package com.shengsiyuan.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest2 {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("shengsiyuan");
		System.out.println(bundle.getString("hello"));
		
		bundle = ResourceBundle.getBundle("shengsiyuan", Locale.CHINA);
		System.out.println(bundle.getString("hello"));
	}
}
