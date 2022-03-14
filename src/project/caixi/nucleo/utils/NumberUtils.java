package project.caixi.nucleo.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberUtils {

	public static String formatCurrency(Float num) {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(localeBR);
		
		return currency.format(num);
	}

	public static String formatCurrency(Double num) {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(localeBR);
		
		return currency.format(num);
	}

}
