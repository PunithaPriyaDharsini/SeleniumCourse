package org.system;

public class Students {
//Overloading
	
	public void getStudentInfo(int id)
	{
		System.out.println("id is "+id);
	}
	public void getStudentInfo(int id,String Name)
	{
		System.out.println("Student Id and Name"+id+"  "+Name);
	}
	public void getStudentInfo(String email,double phno)
	{
		System.out.println("Student Email and PhoneNo"+email+"  "+phno);
	}
	public static void main(String[] args) {

Students obj=new Students();
obj.getStudentInfo(123);
obj.getStudentInfo(123, "Punitha");
obj.getStudentInfo("pun@gmail.com", 99999999);

	}

}
