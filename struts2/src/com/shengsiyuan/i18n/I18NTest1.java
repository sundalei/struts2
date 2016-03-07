package com.shengsiyuan.i18n;

import java.util.Locale;

public class I18NTest1 {
	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale locale : locales) {
			System.out.println(locale.getDisplayCountry());
			System.out.println(locale.getDisplayLanguage());
		}
	}
}
