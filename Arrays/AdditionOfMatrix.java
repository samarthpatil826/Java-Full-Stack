package arrays;

import java.util.Arrays;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]a= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int [][]b= {
				{11,12,13},
				{14,15,16},
				{17,18,19},
		};
		
		if (a.length==b.length) {
			
			int i=0;
			for (i = 0; i < a.length; i++) {
				
				if (a[i].length != b[i].length) {
					
					break;
				}
				
			}
			
			if (i==a.length) {
				
				int [][]c=new int[a.length][a[0].length];
				
				for (int j = 0; j < a.length; j++) {
					
					for (int j2 = 0; j2 < c.length; j2++) {
						
						c[j][j2]=a[j][j2]+b[j][j2];
					}
				}
				for (int j = 0; j < c.length; j++) {
					
					System.out.println(Arrays.toString(c[j]));
				}
			}
		}

	}

}
