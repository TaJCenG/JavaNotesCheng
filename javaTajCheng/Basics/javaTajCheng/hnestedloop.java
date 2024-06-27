package javaTajCheng;

public class hnestedloop {

	public static void main(String[] args) {
	int n=5;
		for ( int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				System.out.print(" * ");
			}
			System.out.println();
		}System.out.println("************************************************************************************");

		for ( int j=0; j<n; j++) {
			for(int i=0; i<=j; i++) {
				System.out.print(" * ");
			}
			System.out.println();
		}System.out.println("************************************************************************************");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (i==0 || j==0 ) {
				//if (i==0 || i==n-1 || j==0 || j==n-1) {
					//if (i==0 || j==0 ||i==(n-1)/2 || j==n-1) {	
				//if (i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || i==(n-1)/2 || j==n-1 && i!=0) {
				
					System.out.print(" & ");
				}else System.out.print(" ");
			}System.out.println();
		}
	}

}
