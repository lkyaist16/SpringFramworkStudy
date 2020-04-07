import com.lkyi.po.User;
import com.lkyi.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();

        User user = (User) context.getBean("user");
        user.show();

    }
}
