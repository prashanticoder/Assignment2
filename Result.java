package Lab2.MethodOverloading;

public class Result {
	public static void main(String[] args) {
		Student s=new Student("chinnu","562");
		Student s1=new Student("588");
		Student s2=new Student("566","prasanthi","A");
		System.out.println(s.display());
		System.out.println(s.display(2020));
		System.out.println(s1.display());
		System.out.println(s1.display(2020));
		System.out.println(s2.display());
		System.out.println(s2.display(2020));
		
	}

}
