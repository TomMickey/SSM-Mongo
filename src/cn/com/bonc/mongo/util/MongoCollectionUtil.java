package cn.com.bonc.mongo.util;

import java.io.IOException;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mongodb.client.MongoCollection;

/**   
 *公司:东方国信 
 *@author lzy  
 *@date 2018年10月1日
*/
@Component
public class MongoCollectionUtil {

	@Autowired
	private MongoUtil mongoUtil;
	@Autowired
	private MongoHelper mongoHelper;
	
	public MongoCollection<Document> getMongoCollection() throws IOException{
		return mongoHelper.getMongoDatabase().getCollection("account");
	}
}
