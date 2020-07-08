import com.factory.ProductFactory;
import com.po.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProoductFactoryTest {
    public static void main(String[] args) {
        //使用工厂类获取实例类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Product product = (Product) applicationContext.getBean("ProductFactory");
        System.out.println(product.toString());
        //获取工厂类，需要使用&转义符
        ProductFactory factory = (ProductFactory) applicationContext.getBean("&ProductFactory");
        System.out.println(factory.isSingleton());
    }
}
