import com.lkyi.po.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

}
