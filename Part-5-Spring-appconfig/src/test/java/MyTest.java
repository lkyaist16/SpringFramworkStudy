import com.lkyi.config.AppConfig;
import com.lkyi.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) ctx.getBean("getUser");
        System.out.println(user.getName());

    }
}
