package kz.zhelezyaka.services;

import kz.zhelezyaka.commands.ProductForm;
import kz.zhelezyaka.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}