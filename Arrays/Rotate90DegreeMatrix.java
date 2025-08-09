package arrays;

import java.util.Arrays;

public class Rotate90DegreeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][]ch= {
				{'a','b','c','d'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'},
		};
		
            for (int i = 0; i < ch.length; i++) {
			
			char temp;
			for (int j = i; j < ch[i].length; j++) {
				
				if (j>i) {
					temp=ch[i][j];
					ch[i][j]=ch[j][i];
					ch[j][i]=temp;
				}
			}
		}
            
            for (int i = 0; i < ch.length; i++) {
				
            	int j=0;
            	int k=ch[0].length-1;
            	
            	while (j<k) {
					
            		char temp=ch[i][j];
            		ch[i][j]=ch[i][k];
            		ch[i][k]=temp;
            		j++;
            		k--;
			}
	   }
            
            for (int i = 0; i < ch.length; i++) {
    			System.out.println(Arrays.toString(ch[i]));
    		}
	  }

}
