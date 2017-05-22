package com.myfirst;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;

/**
 * Created by LT on 2017/5/9.
 */
public class test {
	private static  DataSource ds;
	public static void main(String[] args) {

		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		System.out.println("测试git修改");
		System.out.println(0.0D/0.0D*100);
		System.out.println(decimalFormat.format(0.0D/0.0D*100));
	}
}
