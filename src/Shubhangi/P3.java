// 1
// 2 4 
// 3 5 7 
// 4 6 8 10

package Shubhangi;

public class P3 {

public static void main(String[] args) {
		
		for(int i = 1; i<=4;i++) {
			
			for (int j = 1; j<=i; j++) {// when i value is one I want to print 1 * and when i 
				
				int v = 0;
				
				if(j==1) {
					System.out.print(i+" ");
					
				}else {
					v = i +(j-1)*2;
					System.out.print(v+" ");
				}
			}
			System.out.println();
		}
	}
	
}
