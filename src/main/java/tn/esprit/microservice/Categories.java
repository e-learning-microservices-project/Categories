package tn.esprit.microservice;

import javax.persistence.*;

@Entity(name="Categories")
public class Categories {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String description;


	
	public Categories(String name, String description) {
		super();
		//this.teachers = teachers;
		this.name = name;
		this.description = description;
		//this.students = students;
	}

	public int getId() {
		return id;
	}
	
	public Categories() {
		super();
	}

	/*public int getTeachersListe() {
		return teachers;
	}*/

	/*public void setTeachers_id(int teacher_id) {
		this.teachers = teacher_id;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public int getStudentsListe() {
		return students;
	}*/

	/*public void setStudents_id(int students_id) {
		this.students = students_id;
	}*/

	/*public void setId(int id) {
		this.id = id;
	}*/


	
}
