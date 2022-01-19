package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import sample.di.business.domain.Product;



public class ProductServiceImpl implements ProductService {

  private ProductDao productDao;

  @Autowired
  public void setProductDao(ProductDao productDao) {
    this.productDao = productDao;
  }


  @Override
  public void addProduct(Product product) {
    productDao.addProduct(product);
  }

  @Override
  public Product findByProductName(String name) {
    return productDao.findByProductName(name);
  }
}
