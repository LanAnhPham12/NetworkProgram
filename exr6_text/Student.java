package exr6_text;

public class Student {
	int id;
	String name;
	int bYear;
	double grade;
	
	
	public Student(int id, String name, int bYear) {
		this.id = id;
		this.name = name;
		this.bYear = bYear;
	}

	

	public void setGrade(double grade) {
		this.grade = grade;
	}



	public String toString() {
		return "Id:" + id + ", Name:" + name + ", bYear:" + bYear + ", Grade:" + grade;
	}
}
