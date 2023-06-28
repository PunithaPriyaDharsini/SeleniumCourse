package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("I have 30 inches Monitor");
	}
	public static void main(String[] args) {
//Single Inheritance
Desktop obj=new Desktop();
obj.computerModel();
obj.desktopSize();

	}

}
