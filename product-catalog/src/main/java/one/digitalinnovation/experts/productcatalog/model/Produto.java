package one.digitalinnovation.experts.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
public class Produto {
    @Id
    private Long id;
    private String name;
    private Integer amunt;


    public Integer getAmunt() {
        return amunt;
    }

    public void setAmunt(Integer amunt) {
        this.amunt = amunt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
