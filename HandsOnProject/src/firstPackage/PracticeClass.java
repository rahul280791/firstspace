package firstPackage;

public class PracticeClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructIt con1 = new ConstructIt(25, "YTREWQ");
		ConstructIt con = new ConstructIt(5);
		
		System.out.println(con1.i);
		System.out.println(con.i);
		System.out.println(con.d);
		System.out.println(con.f);
		System.out.println(con.s);
		System.out.println(con1.s);
	}

}
