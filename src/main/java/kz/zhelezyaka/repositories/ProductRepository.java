package kz.zhelezyaka.repositories;

import kz.zhelezyaka.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}