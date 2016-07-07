
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etc.employment.entity.User;
import com.etc.employment.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/applicationContext.xml", "classpath*:config/dispatcher-servlet.xml"})
public class Testshow {
	@Resource
	private IUserService userService;
	@Test
	public void testConn() {
		System.out.println("aaaaaaaaaaaaaa");
	}
	@Test
	public void addUser() {
		User user = new User("yakov", "123");
		userService.addUser(user);
		System.out.println("添加成功。。。");
	}
}
