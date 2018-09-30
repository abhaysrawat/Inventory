package AR.Inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController 
{
/*	@Autowired
	private CategoryDAO categoryDAO;*/
	
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView home() 
	{
		
		ModelAndView mv= new ModelAndView("page"); 
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);	
/*		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);	*/
		return mv;
	}

	@RequestMapping(value="/track")
	public ModelAndView track() 
	{
		
		ModelAndView mv= new ModelAndView("page"); 
		mv.addObject("title","Track");
		mv.addObject("userClickTrack",true);	
		return mv;
	}	
		
	@RequestMapping(value="/rules")
	public ModelAndView rules() 
	{
		
		ModelAndView mv= new ModelAndView("page"); 
		mv.addObject("title","Rules");
		mv.addObject("userClickRules",true);	
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about() 
	{
		
		ModelAndView mv= new ModelAndView("page"); 
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);	
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);	
		return mv;
	}
	
	 
	
/*	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() 
	{
		
		ModelAndView mv= new ModelAndView("page"); 
		mv.addObject("title","All Products");
		//System.out.println("Hello");
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);	
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) 
	{
		
		ModelAndView mv= new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		Category category=null;
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("category",category); 
		mv.addObject("userClickCategoryProducts",true);	
		return mv;
	}*/
	
}
