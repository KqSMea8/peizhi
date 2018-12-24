package demo.com.demo.q.api;

import demo.com.demo.q.domain.eo.Product;

public interface ProductService {

    Object getProductList();

    Object getProductById(Integer id);

    Object createProduct(Product product);

    Object deleteProductById(Integer id);

}
