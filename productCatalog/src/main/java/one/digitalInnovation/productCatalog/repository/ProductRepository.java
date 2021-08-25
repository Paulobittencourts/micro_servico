package one.digitalInnovation.productCatalog.repository;

import one.digitalInnovation.productCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}

