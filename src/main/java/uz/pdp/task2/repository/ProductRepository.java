package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Product;
import uz.pdp.task2.projection.CustomProduct;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
