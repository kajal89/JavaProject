package com.project;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.project.dao.ProductDAO;
import com.project.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDAO dao;

	@RequestMapping("/")
	public String home(Model model) {

		// get all products
		List<Product> products = dao.getProducts();
		model.addAttribute("list", products);
		return "index";
	}

	@RequestMapping("/add_Product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_Product";
	}

	@RequestMapping(value = "/handle_product", method = RequestMethod.POST)
	public RedirectView HandleProduct(@ModelAttribute Product product, HttpServletRequest httpServletRequest) {
		RedirectView redirectView = new RedirectView();
		System.out.println(product);
		dao.createProduct(product);
		// It goes to home page
		redirectView.setUrl(httpServletRequest.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/delete/{pid}")
	public RedirectView deleteProduct(@PathVariable("pid") int pid, HttpServletRequest httpServletRequest) {
		RedirectView redirectView = new RedirectView();
		this.dao.deleteProduct(pid);
		redirectView.setUrl(httpServletRequest.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/update/{pid}")
	public String updateForm(@PathVariable("pid") int pid,Model model) {
		Product p = this.dao.getProduct(pid);
		model.addAttribute("product", p);
		return "update_product";
	}
	
}
