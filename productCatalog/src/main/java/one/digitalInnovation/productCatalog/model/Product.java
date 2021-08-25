package one.digitalInnovation.productCatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product", type = "catalog")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer anount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAnount() {
        return anount;
    }

    public void setAnount(Integer amount) {
        this.anount = anount;
    }
}
