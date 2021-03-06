//I commented out some of your code when discussiing these pages with David, he also had some methods he wanted to take from what he initially posted//

package com.tts.eCommerce.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.service.CartService;
import com.tts.eCommerce.service.ProductService;


@Controller
public class CartController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CartService cartService;

//	
//	@ModelAttribute("cart")
//	public Map<Product, Integer> cart() {
//		User user = loggedInUser();
//		if(user == null) 
//			return null;
//		System.out.println("Get cart");
//		return user.getCart();
//	}
//	
//	@ModelAttribute("list")
//	public List<Double> list(){
//		
//	}

	@GetMapping("/cart")
	public String showCart() {
		return "storefront/cart";
	}

	@PostMapping("/cart")
	public String addToCart(@RequestParam long productId, Cart cart, Integer quantity, Model model) {
		cartService.addProductToCart(cart, productId, quantity);
		model.addAttribute("cart", cart);
		return "storefront/cart";
	}

	@PatchMapping("/cart")
	public String updateQuantities(@RequestParam Long[] productId, @RequestParam Integer[] quantity) {
		for (int i = 0; i < productId.length; i++) {
			Product product = productService.findById(productId[i]);
		}
		return "storefront/cart";
	}

	@DeleteMapping("/cart")
	public String removeFromCart(@RequestParam long id) {

		return "storefront/cart";
	}

}
