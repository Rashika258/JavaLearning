package technoserve;

import javax.persistence.Table;

@Entity
@Table(name="details")
public class Student {
	@Id
	int id;
	String name;
	int age;
	@Transient
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
