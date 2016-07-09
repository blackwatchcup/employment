
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.etc.employment.entity.Member;
import com.etc.employment.entity.User;
import com.etc.employment.service.IUserService;
import com.etc.employment.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/applicationContext.xml", "classpath*:config/dispatcher-servlet.xml"})
public class Testshow {
//	@Resource
//	private IUserService userService;
//	@Test
//	public void testConn() {
//		System.out.println("aaaaaaaaaaaaaa");
//	}
//	@Test
//	public void addUser() {
//		User user = new User("yakov", "123");
//		userService.addUser(user);
//		System.out.println("添加成功。。。");
//	}
	@Resource
	private MemberService memberService;
	@Test
	public void add() {
		Date date = new Date();
		Member m1 = new Member(3, "小谍", "123", "12345687", "145021225@qq.com", "小巫婆", date, "1","dfd");
		memberService.addMember(m1);
	}
	@Test
	public void getUserJson() {
		User user = new User("zhangsan1", "123");
		
		JSONArray array = new JSONArray();
		JSONObject json = new JSONObject();
		json.put("username", user.getUname());
		array.add(json);
		System.out.println(array.toString());
		//return array.toString();
	}
}
