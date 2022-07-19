package sg.edu.nus.iss.day12wkshp;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/cart", "/cart.html"})
public class CartController {
    
    @GetMapping(produces = {"text/html"})
    public String displayCart (Model model) {
        List<Item> cartItems = CartService.getShoppingItems();
        model.addAttribute("cart", cartItems);
        
        return "cart";

    }
}