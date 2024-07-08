
package functionaliface;


@FunctionalInterface

public interface iface 
{
void call();  // abstract method must override 
public default void show()  // overrided
{
	System.out.println("from default show method");
}
public static void hello()// statis methods cannot be overrided
{
	System.out.println("from static hello");
}
}
