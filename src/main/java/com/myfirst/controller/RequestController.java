package com.myfirst.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

/**
 * Created by LT on 2017/5/10.
 */
@Controller
@RequestMapping("/f")
public class RequestController {
	private static Logger logger = LoggerFactory.getLogger(RequestController.class);
	@RequestMapping("/a")
	public String init(){
		logger.error("test");
		return "logTest";
	}


	@RequestMapping("/logTest")
	public void logTest() {
		DataSource ds;
		InitialContext context = null;
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/mysql_log");
			String sql = "insert into log_icecoldmonitor(level,category,thread,time,location,note) values('d','1','1',now(),'1','1')";
			Connection connection = ds.getConnection();
			Statement ps = connection.createStatement();
			ps.execute(sql);
			ps.close();
			connection.close();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
	}
}
