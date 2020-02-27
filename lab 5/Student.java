import java.util.*;
class Parent {
	String name;
	int age;
	public Parent(String name,int age) {
		this.name=name;
		this.age=age;
	}

}
class Student extends Parent{
	int roll_no;
	String dept;
	int no_course;
	public Student(String name,int age,int roll_no,String dept) {
		super(name,age);
		this.roll_no=roll_no;
		this.dept=dept;
	}
	public String toString() {
		return ("Roll No: "+roll_no+" Name: "+name+" Age:"+age+" Dept: "+dept);
	}
}
class Lab5Task2 {
	public static void main(String[] args) {
		Student one=new Student("Sheraz",19,67,"Software");
		Student two=new Student("Shahbaz",20,67,"Civil");
		Student three=new Student("Sarup",20,67,"Mining");
		Student four=new Student("Sajid",21,123,"International Relationships");
		Student five=new Student("Abdul Jabbar",20,64,"Software");
		ArrayDeque queue=new ArrayDeque();
		queue.add(one);
		queue.add(two);
		queue.add(three);
		queue.add(four);
		queue.add(five);
		System.out.println("Before Removing:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		System.out.println("After Removing:");
		Iterator itr1=queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.element());
		Student six=new Student("Muhammad Moiz",20,125,"Software");
		queue.addFirst(five);
		Student seven=new Student ("Ali Raza",20,66,"Software");
		queue.addFirst(seven);
		System.out.println(queue.removeLast());
	}
}