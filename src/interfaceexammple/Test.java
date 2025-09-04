package interfaceexammple;

public class Test implements Abc,Mno{

	@Override
	public void dis1() {
		System.out.println("Abc interface method");
		
	}
	@Override
	public void dis2() {
	System.out.println("Mno interface method");
	}
	
	@Override
	public void dis() {
		System.out.println("Common logic for Abc and Mno interface method");
		System.out.println(A);
		System.out.println(B);
		System.out.println(Abc.N+" "+Mno.N);
		
	}
}