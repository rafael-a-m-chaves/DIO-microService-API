package one.digitalinnovation.experts.shoppingCart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping
    public String indexRequest(){
        return "<h1>Isto é um teste</h1>";
    }

}
