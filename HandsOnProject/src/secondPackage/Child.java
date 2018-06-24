package secondPackage;

public class Child extends Parent {
	
	public Child() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	void print()
	{
		System.out.println(super.i);
	}
	
	public static void main(String[] arg)
	{
		Child obj = new Child();
		obj.print();
		
	}
	
}
