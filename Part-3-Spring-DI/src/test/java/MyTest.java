import com.lkyi.po.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
    }
}
