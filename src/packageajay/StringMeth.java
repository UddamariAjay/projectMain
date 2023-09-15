package packageajay;

public class StringMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Welcome To Hyderabad";
		System.out.println(s1.length());
		
        boolean b=s1.equals("welcome ");
        System.out.println(b);
        //System.out.println(s1.equals(s1));
        
        System.out.println(s1.equalsIgnoreCase("welcome to hyderabad"));
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        System.out.println(s1.startsWith("Welcome"));
        System.out.println(s1.endsWith("hyderabad"));
        
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("o"));
        
        System.out.println(s1.charAt(3));
        
        System.out.println(s1.replace("Hyderabad", "kachapur"));
        
        System.out.println(s1.contains("kachapur"));
        
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 10));
        
        System.out.println(s1.isEmpty());
        
        //spilt - used to devide the string
        String[] st = s1.split(" ");
        for(int i=0; i<st.length; i++) {
        	System.out.println(st[i]);
        	
        	String s2 = "   welcome";
        	System.out.println(s2.trim());
        	
        	String firstName = "uddamari";
        	String lastName = "ajay";
        	System.out.println(firstName.concat(lastName));
        	
        }
        
        
        
	}

}
