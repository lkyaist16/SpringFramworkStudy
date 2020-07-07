import com.factory.ProductFactory;
import com.po.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProoductFactoryTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Product product = (Product) applicationContext.getBean("ProductFactory");
        System.out.println(product.toString());
        ProductFactory factory = (ProductFactory) applicationContext.getBean("&ProductFactory");
        System.out.println(factory.isSingleton());
    }
}
