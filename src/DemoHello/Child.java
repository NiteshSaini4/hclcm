package DemoHello;

public class Child extends Parent
{
	void m1()
	{
		System.out.println("child");
	}
	void m2()
	{
		this.m1();
	}
	public static void main(String[] args) {
		Child c1=new Child();
		c1.m2();
	}
	
}//parent int a,,child int a---------super.a,this.a
//parent void m1(),  child void m1().....super.m1();,this.m1();
//parent parent(),......child child();.....super();,,,,this();
