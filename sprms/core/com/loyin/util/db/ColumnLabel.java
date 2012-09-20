package com.jyd.util.db;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * <pre>
 * ���ֶ���ʾ����
 * ��select COM1 �ֶ�һ from table1 
 * ��ô��Ӧ��POJO��
 * @ Column(name="COM1")
 * @ ColumnLabel(name="�ֶ�һ")
 * private String com1
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ColumnLabel
{
String name();
}
