package cn.com.bonc.mongo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**   
 *公司:东方国信 
 *@author lzy  
 *@date 2018年10月1日
*/
@Component
public class MongoHelper {

	//主机
	private static String SERVER;
	//端口
	private static Integer PORT;
	//数据库
	private static String DATABASE;
	
	public MongoHelper() {
		
	}
	
	public static MongoDatabase getMongoDatabase() {
		MongoDatabase mongoDatabase=null;
		Properties properties=new Properties();
		InputStream inputStream=MongoHelper.class.getClassLoader().getResourceAsStream("mongo.properties");
		MongoClient mongoClient=null;
		try {
			properties.load(inputStream);
			SERVER=properties.getProperty("server");
			PORT=Integer.parseInt(properties.getProperty("port"));
			DATABASE=properties.getProperty("database");
			mongoClient=new MongoClient(SERVER,PORT);
			mongoDatabase=mongoClient.getDatabase(DATABASE);
			return mongoDatabase;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mongoDatabase;
	}
}
