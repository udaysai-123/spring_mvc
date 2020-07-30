package org.dxc.shopping.controller;


import java.util.List;
import java.util.logging.Logger;

import org.dxc.shopping.model.Product;
import org.dxc.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	public Logger
	logger=Logger.getLogger(ProductController.class.getName());
	@Autowired
	private ProductService productService;
	@RequestMapping("/")
	public String showIndexPage() {
		logger.info("=========showIndexPage()called=============="); 
		return "index";
	}
	@RequestMapping("/displayproduct")
	public ModelAndView showAllProduct() {
		logger.info("=========showIndexPage()called=============="); 

		List<Product> allProduct=productService.getProduct();
		ModelAndView modelAndView=new ModelAndView("view-product");
		modelAndView.addObject("productlist",allProduct );
		return modelAndView;
		
	}
	@RequestMapping("/addproduct")
	public String showAddProductPage() {
		logger.info("=========showIndexPage()called=============="); 
		return "add-product";
	}
	@RequestMapping(value="/addnewproduct",method=RequestMethod.POST)
			public String addNewProduct(@RequestParam("productid") int
			pid,@RequestParam("productname") String
			pname,@RequestParam("quantity") int quantity,@RequestParam("price")
			double price){
		logger.info("=========addNewProduct()called==============");
				logger.info("=========Product ============="+pid + ""+pname+" "+ " " +quantity + " " + price); 
				
		return "success";

}
	
}
