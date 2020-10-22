package Lab2.MethodOverloading;

public class Student {
	private String name;
	private String id;
	private String grade;
	public Student(String name, String id, String grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Student(String id) {
		super();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String display()
	{
		return "name="+name+"id="+id+"grade="+grade;
	}
	public String display(int year)
	{
		return "name="+name+"id="+id+"grade="+grade+"year="+year;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade + "]";
	}
	

}
