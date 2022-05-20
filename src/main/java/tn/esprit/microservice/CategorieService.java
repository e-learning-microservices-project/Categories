package tn.esprit.microservice;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CategorieService{
	
	@Autowired
	private CategoriesRepository categoriesRepository  ;
	@Autowired
	RestTemplate restTemplate;
	
	public Categories addCategories(Categories category) {
		return categoriesRepository.save(category);
	}
	
	//updateCategories
	public Categories updateCategories(Categories c, int id) {
		if ( (categoriesRepository.findById(id).isPresent()) )
		{
			Categories categories = categoriesRepository.findById(id).get();
			//teachers; name;description;students;
			categories.setTeachers_id(c.getTeachersListe());
			categories.setName(c.getName());
			categories.setDescription(c.getDescription());
			categories.setStudents_id(c.getStudentsListe());
			
			
			return categoriesRepository.save(categories);
		}
		else return null;	
	}
	
	//deleteCourse
	public String deleteCourse (int id)
	{
		if (categoriesRepository.findById(id).isPresent())
		{
			categoriesRepository.deleteById(id);
			return "Course deleted!";
		}return "Course not found!";
	}
	
	//getCategories
	public List<Categories> getCategories ()
	{
		return categoriesRepository.findAll();
	}


	
	//exist student
	public String studentExist(long id) {
		String result = 
				restTemplate.
				getForObject("http://localhost:8087/api/etudiants/hello", String.class,id);
		return result;			
	}

}
