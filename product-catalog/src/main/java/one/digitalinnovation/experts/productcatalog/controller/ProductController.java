package one.digitalinnovation.experts.productcatalog.controller;

import one.digitalinnovation.experts.productcatalog.model.Produto;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository hangar;

    @RequestMapping(method = RequestMethod.POST)
    Produto create(@RequestBody Produto produto){
        return hangar.save(produto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Optional<Produto> findById(@PathVariable Integer id){
        return hangar.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    Produto updateByid(@RequestBody Produto produto){
        return hangar.save(produto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    void delById(@PathVariable Integer id){
         hangar.deleteById(id);
    }

    @GetMapping
    public Iterable<Produto> findall(){
        Iterable<Produto> allProduto = hangar.findAll();
        return allProduto;
    }
}
