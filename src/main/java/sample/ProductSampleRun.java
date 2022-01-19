package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.di.business.domain.Product;
import sample.di.business.service.ProductService;

public class ProductSampleRun {

  public static void main(String[] args) {
    ProductSampleRun productSampleRun = new ProductSampleRun();
    productSampleRun.execute();
  }

  @SuppressWarnings("resource")
  public void execute() {
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("/sample/config/applicationContext.xml");

    ProductService productService = ctx.getBean(ProductService.class);

    productService.addProduct(new Product("카페라떼", 5800));


    Product product = productService.findByProductName("카페라떼");

    System.out.println(product);

  }
}
