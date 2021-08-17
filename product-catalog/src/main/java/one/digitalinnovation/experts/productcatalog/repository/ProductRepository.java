package one.digitalinnovation.experts.productcatalog.repository;

import one.digitalinnovation.experts.productcatalog.model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


public interface ProductRepository extends ElasticsearchCrudRepository<Produto,Integer> {

}
