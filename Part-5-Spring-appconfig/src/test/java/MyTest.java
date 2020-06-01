import com.lkyi.config.AppConfig;
import com.lkyi.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("容器创建完毕");
        User user = context.getBean(User.class);
        System.out.println(user.getName());
        context.close();
    }
}
