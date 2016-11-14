package test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sxx.entity.User;
import com.sxx.service.UserService;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sxx/resource/applicationContext.xml");
		UserService userService = context.getBean("userServiceImpl", UserService.class);
		List<User> lUser = userService.getAllUser();
		Iterator<User> i = lUser.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
