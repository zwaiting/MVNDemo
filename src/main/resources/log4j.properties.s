# Output pattern : date [thread] priority category - message   FATAL 0  ERROR 3  WARN 4  INFO 6  DEBUG 7 
#log4j.rootLogger=WARN, Console, RollingFile
log4j.rootCategory=DEBUG, Console, RollingFile ,JndiDataSourceAppender
log4j.additivity.org.apache=false
log4j.additivity.com.springfestival.unicom=false
log4j.additivity.org.springframework.web.servlet=false
log4j.additivity.org.hibernate=false
#Console
log4j.appender.Console=org.apache.log4j.ConsoleAppender
log4j.appender.Console.layout=org.apache.log4j.PatternLayout
log4j.appender.Console.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n
#RollingFile
log4j.appender.RollingFile=org.apache.log4j.DailyRollingFileAppender
log4j.appender.RollingFile.File=${catalina.base}/logs/springfestival.log
log4j.appender.RollingFile.layout=org.apache.log4j.PatternLayout
log4j.appender.RollingFile.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n
#Springframework level
log4j.logger.org.springframework=ERROR
log4j.logger.org.springframework.core=ERROR
log4j.logger.org.springframework.beans=ERROR
log4j.logger.org.springframework.context=ERROR
log4j.logger.org.springframework.http=ERROR
log4j.logger.org.springframework.web.servlet.mvc=ERROR
log4j.logger.org.springframework.web.servlet.handler=ERROR
log4j.logger.org.springframework.web.context=ERROR
log4j.logger.org.springframework.web=DEBUG
log4j.logger.com.alibaba.druid=ERROR

#Hibernate level
#log4j.logger.org.hibernate=ERROR
#Project defalult level
log4j.logger.com.springfestival.unicom=INFO,Console
log4j.logger.org.hibernate=ERROR,Console
log4j.logger.net.sf=ERROR,Console
log4j.logger.org.activiti=ERROR,Console
log4j.logger.org.apache=ERROR,Console
log4j.logger.com.jolbox=ERROR,Console


##输出到数据库
## JDBC appender directly, 2b)
#log4j.appender.JDBC2=org.apache.log4j.jdbcplus.JDBCAppender
## created db alias in aliases.conf: danko = D:\Programme\Firebird\Firebird1.5\Data\danko.fdb
#log4j.appender.JDBC2.url=jdbc:mysql://127.0.0.1:3306/hr
#log4j.appender.JDBC2.dbclass=com.mysql.jdbc.Driver
#log4j.appender.JDBC2.username=root
#log4j.appender.JDBC2.password=root
##log4j.appender.JDBC2.sql=INSERT INTO LOG_LOG4J2 (MSG) VALUES ('@MSG@')
##next: example for most functions/log types
#log4j.appender.JDBC2.sql=insert into log_icecoldmonitor(level,category,thread,time,location,note) values('%p','%c','%t',now(),'%l','%m')
#log4j.appender.JDBC2.layout=org.apache.log4j.PatternLayout
## conversion pattern with 4 parts separated by #, second is empty
#log4j.appender.JDBC2.layout.ConversionPattern=[%t] %m %l##%d{dd.MM.yyyy}#%d{HH:mm:ss}
#log4j.appender.JDBC2.layoutPartsDelimiter=#
#log4j.appender.JDBC2.buffer=1
#log4j.appender.JDBC2.commit=true
#log4j.appender.JDBC2.quoteReplace=true
#log4j.appender.JDBC2.throwableMaxChars=3000

#log4j.appender.db.BufferSize=1
#
#log4j.appender.db.sqlname=log
#
#log4j.appender.db.layout=org.apache.log4j.PatternLayout
#
log4j.appender.JndiDataSourceAppender.Threshold=ERROR

log4j.appender.JndiDataSourceAppender=com.myfirst.log.PrepareStatementJdbcAppender
log4j.appender.JndiDataSourceAppender.driver=com.mysql.jdbc.Driver
log4j.appender.JndiDataSourceAppender.URL=jdbc:mysql://127.0.0.1:3306/hr
log4j.appender.JndiDataSourceAppender.user=root
log4j.appender.JndiDataSourceAppender.password=root
#log4j.appender.db.sql=insert into log_icecoldmonitor(level,category,thread,time,location,note) values('%p','%c','%t',now(),'%l','%m')
log4j.appender.JndiDataSourceAppender.sql=insert into log_icecoldmonitor(level,category,thread,time,location,note) values(?,?,?,?,?,?)
log4j.appender.JndiDataSourceAppender.sqlParams=%p%c%t%d{yyyy-MM-dd HH:mm:ss}%l%m