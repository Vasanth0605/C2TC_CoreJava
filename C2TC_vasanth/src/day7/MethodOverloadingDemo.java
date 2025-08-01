package day7;

public class MethodOverloadingDemo {

	public static void main(String[]args) {
		
		Addition a=new Addition();
		a.add();
		System.out.println(a.add(6));
		System.out.println(a.add(6));
		System.out.println(a.add(6));
	}
}
