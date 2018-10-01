package cn.com.bonc;

import java.io.IOException;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.client.MongoCollection;

import cn.com.bonc.mongo.util.MongoCollectionUtil;
import cn.com.bonc.mongo.util.MongoUtil;

/**   
 *公司:东方国信 
 *@author lzy  
 *@date 2018年10月1日
*/
@Controller
public class HelloController {
	@Autowired
	private MongoCollectionUtil mongoCollectionUtil;

	public HelloController() {
		
	}
	@RequestMapping("/hello.do")
	public String hello() throws IOException {
		Integer count=(int) mongoCollectionUtil.getMongoCollection().count();
		System.out.println(count);
		return "hello";
	}
}
