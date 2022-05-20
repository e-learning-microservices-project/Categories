package tn.esprit.microservice;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategorieService{
	
	@Autowired
	private CategoriesRepository categoriesRepository  ;
	
	public Categories addCategories(Categories category) {
		return categoriesRepository.save(category);
	}
	
	//updateCategories
	public Categories updateCategories(Categories c, int id) {
		if (categoriesRepository.findById(id).isPresent())
		{
			Categories categories = categoriesRepository.findById(id).get();
			//subject,description,language
			//course.setSubject(c.getSubject());
			categories.setDescription(c.getDescription());
			//course.setLanguage(c.getLanguage());
			//categories.setTeachers_id(c.getTeacher_id());
			
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
}
