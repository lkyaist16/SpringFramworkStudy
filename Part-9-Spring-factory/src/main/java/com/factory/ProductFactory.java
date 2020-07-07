package com.factory;

import org.springframework.beans.factory.FactoryBean;
import com.po.Product;

public class ProductFactory implements FactoryBean<Product> {
    public Product getObject() throws Exception {
        return new Product().setProductId("myProduct").setProductName("productByMyFactory");
    }

    public Class<?> getObjectType() {
        return Product.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
