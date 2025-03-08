package pattern;

public class StarPattern {
	
	public void rightPyramid(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}			
			System.out.println();		
		}
	}

	public void leftPyramid(int size) {
		for(int i=1;i<=size;i++) {	
			for(int j=1;j<=size;j++) {
				if(j<=size-i) {System.out.print(" ");}
				else 
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
/*			****
			 ***
			   *
*/
	public void reverseRightPyramid(int size) {
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(j<i) {System.out.print(" ");}
				else { System.out.print("*");}
			}
			System.out.println();
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		StarPattern star=new StarPattern();
		star.reverseRightPyramid(5);
	}
		
}
