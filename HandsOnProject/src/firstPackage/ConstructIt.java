package firstPackage;

public class ConstructIt {

	public static int i;
	protected String s = "QWERTY";
	public float f = 2.5f;
	double d = 55.55;
	
	
	public ConstructIt() {
		// TODO Auto-generated constructor stub
	}
	public ConstructIt(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	
	public ConstructIt(int i, String s) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.s=s;
	}
}
