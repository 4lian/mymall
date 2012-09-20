package com.jyd.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Floatfromat {
	/**���ַ����ֽ���������ȡ**/
	public static String floatFormat(Object str){ 
		DecimalFormat   format   =   new   DecimalFormat("0");
		BigDecimal val = new BigDecimal(str.toString());
		String result = format.format(val);
		return result;
	}
	/**���ַ����ֽ���С�������λ��ȡ**/
	public static String floatFormatHB(Object str){  
		DecimalFormat   format   =   new   DecimalFormat("#.00");
		BigDecimal val = new BigDecimal(str.toString());
		String result = format.format(val);
		return result;
		
	}
	/**���ַ����ֽ������������ȡ**/
	public static String roundFormat(String str){
		float f = Float.valueOf(str);
		f = Math.round(f*1000)/1000f;
		return String.valueOf(f);
	}
	public static void main(String args[]){
		System.out.println(Floatfromat.roundFormat("-101.1030"));
	}
}
