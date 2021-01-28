import java.util.*;
class SingletonInheritanceCheck{ 
	private static SingletonInheritanceCheck i=null;
    int spec = 0;
	private SingletonInheritanceCheck()
	{
	  int spec = 50;
	}
	public static SingletonInheritanceCheck getInstance()
	{
		if (i == null) 
		{
           i = new SingletonInheritanceCheck(); 
		}
           return i; 
	}
}

public class Assignment2Q1 {
	public static void main(String args[]) 
	{}
}