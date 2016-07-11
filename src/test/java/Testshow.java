
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.etc.employment.entity.Member;
import com.etc.employment.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/applicationContext.xml", "classpath*:config/dispatcher-servlet.xml"})
public class Testshow {
	@Resource
	private MemberService memberService;
	@Test
	public void add() {
		Date date = new Date();
		Member m1 = new Member(3, "小谍", "123", "12345687", "145021225@qq.com", "小巫婆", date, "1","dfd","男");
		memberService.addMember(m1);
	}
}
