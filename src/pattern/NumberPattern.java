package pattern;

public class NumberPattern {

	 int even=0;
	 int odd=1;
	
		public void evenOddTriange(int size) {
		 for(int i=1;i<=size;i++) {
			 for(int j=1;j<=i;j++) {
				 if(i%2==0) {
					 even=even+2;System.out.print(even+" ");}
				 else {
					 System.out.print(odd+" ");
					 odd=odd+2;}
				}
			 System.out.println();
		 }
		
	}
		

}
