package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bean.Brand;
import service.BrandManagementService;

@CrossOrigin(origins = {"*"}, allowedHeaders = "*", allowCredentials = "false", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BrandRestController {
	
	@Autowired
	private BrandManagementService brandManagementService;
	
	/**
	 * get list brand
	 * @return
	 */
	@RequestMapping(value = "/brands", method = RequestMethod.GET)
	public ResponseEntity<List<Brand>> getListBrands(){
		List<Brand> brands = brandManagementService.getAll();
		if(brands.isEmpty()) {
        	return new ResponseEntity<List<Brand>>(HttpStatus.NO_CONTENT);
        }else {
        	return new ResponseEntity<List<Brand>>(brands, HttpStatus.OK);
        }
	}
	

}
