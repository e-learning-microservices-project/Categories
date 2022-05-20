package tn.esprit.microservice;

import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoriesRestAPI {

	@Autowired
	private CategorieService categorieservice;
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Categories> createCourse(@RequestBody Categories category) {
		return new ResponseEntity<>(categorieservice.addCategories(category),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Categories> getcategories() {
		if (categorieservice != null) {
		return categorieservice.getCategories();
		}else {
			return null;
		}
	}
	
	@GetMapping("/getstudent/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String EtudiantExist(@PathVariable(value ="id") int id) {
		
		return categorieservice.studentExist(id);
		
	}
	 
	@PutMapping(value="/update/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Categories> updateCourse(@PathVariable(value ="id")int id, @RequestBody Categories course) {
		return new ResponseEntity<>(categorieservice.updateCategories(course, id),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCourse(@PathVariable(value ="id")int id) {
		return new ResponseEntity<>(categorieservice.deleteCourse(id),HttpStatus.OK);
	}
}
