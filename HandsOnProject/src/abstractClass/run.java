package abstractClass;

public class run extends abstractClass implements FirstInterface {

	static
	{
		int l = 10;
		System.out.println(l);
//		abstractClass ab = new run();
//		ab.A();
//		ab.B();
//		System.out.println(ab.q);
//		System.out.println(abstractClass.e);
//		System.out.println(abstractClass.w);
//		System.out.println(FirstInterface.a);
	}
	
	public static void main(String[] args) {
		abstractClass ab = new run();
		ab.A();
		ab.B();
		System.out.println(ab.q);
		System.out.println(abstractClass.e);
		System.out.println(abstractClass.w);
		System.out.println(FirstInterface.a);
		
	}

	@Override
	public void A() {
		// TODO Auto-generated method stub
		
		System.out.println("Childs A");
		
	}

}
