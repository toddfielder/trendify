package com.fielder.category.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class CategoryController {
	@Value("${service.instance.name}")
	private String instance;
	
//	@Autowired
//	private CategoryService categoryService;
//	
//	
//	@RequestMapping(value = "", method = RequestMethod.GET)
//	public ResponseEntity<List<Category>> getCategories() {
//	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
//	}
//	@RequestMapping(value = "/{catId}", method = RequestMethod.GET)
//	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {
//	    return new ResponseEntity<Category>(categoryService.getCategoryById(catId), HttpStatus.OK);
//	}
//	@RequestMapping(value = "/topics", method = RequestMethod.POST)
//	public ResponseEntity<List<Category>> getCategoryWithTopics(@RequestBody List<Integer> topicIds) {
//	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
//	}
	@GetMapping("/")
	public String message(){
		return "Hello from: "+ instance;
	}
}
