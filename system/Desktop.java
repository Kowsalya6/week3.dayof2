package org.system;

public class Desktop extends Computer{

	public void desktopSize()
		{
			System.out.println("desktop size is too large");
		
		}
	public static void main(String[] args) 
	{
		Desktop d= new Desktop();
		d.computerModel();
		d.desktopSize();
}
	}
