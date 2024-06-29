package String;

public class StringInterview {
	public static void main(String [] args) {

		//  TO COPY ONE STRING TO ANOTHER
		System.out.println("TO COPY ONE STRING TO ANOTHER");	
		String a = "Taj";
		String b = "";
		for(int i=0; i<a.length(); i++) {
			b = b+a.charAt(i);
		}System.out.println(b);
		
		
		System.out.println("==============================================================");			
		
		System.out.println("LOWE TO UPPER WITHOUT INBUILT");	
		String st = "taj";
		String sr = "";
		for(int i=0; i<st.length(); i++) {
			sr = sr+(char)(st.charAt(i)-32);
		}
		System.out.println(sr);
		System.out.println(st);
		System.out.println("==============================================================");			
		
		System.out.println("Reverse String");	
		String st1 = "taj";
		String sr1 = "";
		for(int i=st1.length()-1; i>=0; i--) {
			sr1 = sr1+st1.charAt(i);
		}			
		System.out.println(sr1);
		System.out.println(st1);
System.out.println("==============================================================");			
		
		System.out.println("Split");	
		String z = "Taj Cheng";
		String x = " ";
		String a1[] = z.split(" ");
		for(int i=a1.length-1; i>=0; i--) {
			x = x+a1[i]+ " ";
		}System.out.println(x);
		System.out.println("==============================================================");			
		
		System.out.println("PALINDROME ::");
		String p = "Java";
		String s = "";
		for(int i=p.length()-1;i>=0;i--) {
			s = s+p.charAt(i);
		}if(s.equals(p)) {
			System.out.println("palindrome");
		}else
			System.out.println("Not palindrome");
		
		
		
	}

}
