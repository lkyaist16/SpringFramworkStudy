import com.po.Coffee;
import com.po.Tea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        System.out.println("Spring IoC 容器初始化开始");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("Spring IoC 容器初始化完毕");

        System.out.println("Spring IoC容器获取bean-Coffee");
        Coffee coffee = (Coffee) applicationContext.getBean("Coffee");

        System.out.println("Spring IoC容器获取bean-Tea");
        Tea tea = (Tea) applicationContext.getBean("Tea");
    }
}
