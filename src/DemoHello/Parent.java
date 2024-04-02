package DemoHello;

class Parent 
{
	Parent ()
	{
		
	 System.out.println("Parent 0-arg Constructor");
	}

}
class Child extends Parent
{
 Child()
 {
	 super();
 }
 public static void main(String[] xyz) {
 
 new Child ();
 }
}


