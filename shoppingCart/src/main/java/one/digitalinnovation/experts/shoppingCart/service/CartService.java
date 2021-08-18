package one.digitalinnovation.experts.shoppingCart.service;

import one.digitalinnovation.experts.shoppingCart.model.Cart;
import one.digitalinnovation.experts.shoppingCart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public String createCart (Cart cart){
        cartRepository.save(cart);
        return "Carrinho Criado";
    }

    public String addIten (Cart cart){
        cartadd = cartRepository.getById(cart.getId());
    }
}


