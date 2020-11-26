package com.cts.SComplex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.SComplex.model.Product;
import com.cts.SComplex.service.ProductService;

@Controller
public class SComplexController {
	
	 @Autowired
	 private ProductService productService;
	
	 @RequestMapping("/scomplex")
	 public ModelAndView home(){  
        return new ModelAndView("sComplexHome"); 
	}
	 
	 @RequestMapping("/viewProduct")
	 public ModelAndView viewProduct(){  
        return new ModelAndView("viewProduct"); 
	}
	
	@RequestMapping("/productDetails")  
    public ModelAndView productDetail(@RequestParam("itemId") int itemId, Model model){  
		Product p=new Product();
		System.out.println("this is item ID : " + itemId);
		try {
			p = productService.getProductDetailByItemIds(itemId);
			if(null != p) {
				System.out.println(p.toString());
				model.addAttribute("productDetail", p);
				return new ModelAndView("productDetails");
			}
			return new ModelAndView("invalidItemId");
		} catch (Exception e) {
			System.out.println("exception : " +e.getMessage());
			return new ModelAndView("viewProduct");
		} 
    }
	
	@RequestMapping("/addProduct")
	public ModelAndView addProduct() {
		return new ModelAndView("addProduct");
	}
	
	@RequestMapping("/productAddition")
	public ModelAndView productAddition(@RequestParam("itemName") String itemName, @RequestParam("sportName") String sportName, @RequestParam("brand") String brand, @RequestParam("price") int price, @RequestParam("rating") String rating, Model model) {
		
		try {
			int a;
			a=productService.addProducts(itemName, sportName, brand, price, rating);
			if(a>0) {
				return new ModelAndView("productAddedSuccessfully");
			}
			else {
				return new ModelAndView("unableToAdd");
			}
		}catch (Exception e) {
			System.out.println("exception : " + e.getMessage());
			return new ModelAndView("redirect:/addProduct");
		}
		
	}

}
