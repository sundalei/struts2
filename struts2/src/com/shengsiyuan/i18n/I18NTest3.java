package com.shengsiyuan.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest3 {
	public static void main(String[] args) {
		Locale locale = Locale.US;
		
		ResourceBundle bundle = ResourceBundle.getBundle("shengsiyuan", locale);
		
		String value = bundle.getString("hello");
		
		String result = MessageFormat.format(value, new Object[] {"world"});
		
		System.out.println(result);
	}
}
