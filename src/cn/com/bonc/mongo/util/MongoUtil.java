package cn.com.bonc.mongo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.bson.Document;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**   
 *公司:东方国信 
 *@author lzy  
 *@date 2018年10月1日
*/
@Component
public class MongoUtil {

	//数据库名
	private static String DATABASENAME="test";
	//主机
	private static String LOCALHOST="localhost";
	//端口
	private static Integer PORT=27017;
	
	public static MongoDatabase getMongoDatabase() {
		MongoClient mongoClient=new MongoClient(LOCALHOST,PORT);
		return mongoClient.getDatabase(DATABASENAME);
	}
}