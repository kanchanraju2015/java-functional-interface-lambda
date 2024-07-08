package functionaliface;

class imp implements iface
{

	@Override
	public void call() 
	{
	System.out.println("from call");		
	}	
	/*
public	void show()
	{
		 System.out.println("from show in class");
	}
	*/
}

public class ex1
{
public static void main(String args[])
{
	System.out.println("****BY OBJECT OF THE CLASS*************");
imp i=new imp();
i.call();
i.show();//
iface.hello();// abstract method cannot be overrided 
System.out.println("*********INTERFACE REFERENCE***********");
iface a=new imp();// using interface reference valid working 
a.call();
a.show();
iface.hello();
System.out.println("******ANONYMOUS INNER CLASS **************");
iface b=new imp()
{
	public void call()
	{
		System.out.println("from call here ");
	}
	public void show()
	{
		System.out.println("from show here");
	}
};
b.call();
b.show();
iface.hello();
iface n=new iface() // this is also valid runs fine 
{
	public void call()
	{
		System.out.println("from interface ");
	}
	public void show()
	{
		System.out.println("from interface");
	}
};
System.out.println("*********BY INTERFACE OBJECT****************");
n.call();
n.show();
iface.hello();
System.out.println("***********LAMBDA EXPRESSION**************");
iface p=()->System.out.println("from call again here");
p.call();
iface q=()->System.out.println("from show again here");
q.show();
iface.hello();// static method cannot be overrided  i.e direct call
}
}
