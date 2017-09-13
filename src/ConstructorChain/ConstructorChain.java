package ConstructorChain;
/*
 * program to demonstrate Constructor Chaining. 
 * Between the same class and between the child and parent class.
 */
class MyConstructorChainParent
{
	String name;
    public MyConstructorChainParent() // Constructor 1
    {
        System.out.println("Parent class no-args constructor called");
    }
    public MyConstructorChainParent(String name) // Constructor 2
    {
    	this.name=name;
        System.out.println("Parent class Parameterized constructor called by "+name);
    }
}
public class ConstructorChain extends MyConstructorChainParent
{
	public ConstructorChain() // Constructor 3
	{
		// TODO Auto-generated constructor stub
		this("Hello");
        System.out.println("Child class no-args constructor called");
	}
	public ConstructorChain(String name) // Constructor 4
	{
		super("Hello"); //invokes Parent Class Constructor 2
        System.out.println("Child class Parameterized constructor called by "+name);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ConstructorChain c = new ConstructorChain();//Calls Parameterized Constructor 3
	}
}

