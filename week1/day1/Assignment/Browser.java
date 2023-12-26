package week1.day1.Assignment;

public class Browser 
{
	public static void main(String[] args) 
	{
		System.out.println("This in my Browser");
        Chrome chromeBrowser = new Chrome();

        // Call the methods from the chrome class using the object reference
        chromeBrowser.getname();
        chromeBrowser.printname();
    }

}


