package LangPackage;


public class StringExamples {

	public static void main(String[] args) {
//		String str1 = "Welcome to Java";
//		String str2 = new String("Welcome to Java");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.substring(3));
//		System.out.println(str1.substring(3,7));
//		String name1 = "Raj";	// first memory created. 
//		String name2 = "Raj";	// same memory with 2 reference. 
//		String name3 = new String("Raj");	// new memory 
//		String name4 = new String("Raj");	// new memory 
//		if(name1.equals(name4)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("not Equal");
//		}
		String name  = "Raj Deep";
		System.out.println(name);
			System.out.println(name.toUpperCase());
		System.out.println(name);
		String updatedString = name.toLowerCase();
		System.out.println(updatedString);
		
		System.out.println("-----------------");
		StringBuffer sb = new StringBuffer("Raj Deep");
		System.out.println(sb);
		System.out.println(sb.append(" Patel"));
		System.out.println(sb);
		sb.insert(4, "Bangalore ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
