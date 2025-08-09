package arrays;

public class SumOfUpperDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]ar= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int sum=0;
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				
				if (i<=0) {
					
					sum+=ar[i][j];
				}
			}
		}
		System.out.println(sum);

	}

}
