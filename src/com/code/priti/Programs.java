package com.code.priti;

public class Programs {
	
	public static void main(String[] args) {
		
		//program 1
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//program 2
		/*int i, j;
		for(i =1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		
		//program 3
		/*int i, j;
		for(i = 5; i >= 1; i--) {
			for(j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		
		//program 4
		/*int i, j;
		for(i = 5; i >=1; i--) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		//program 5
		/*int i, j;
		//for rows
		for(i = 1; i <= 5; i++) {
			//for column 
			for(j = 5; j >= 1; j--) {
				//for space 
				if(j > i) {
					System.out.print(" ");
				}
				//print * with one space 
				else {
					System.out.print(" *");
				}
			}
			//for next line
			System.out.println();
		}*/
		
		
		//program 6
		/*int i, j, k;
        for (i = 5; i >= 1; i--) {
            for (k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
		
		
		//program 7
		/*int i, j, k;
		//for rows
        for (i = 1; i <= 5; i++) {
        	//for column
            for (k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            //print * with one space
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //for next line
            System.out.println();
        }
        //for rows
        for (i = 5 - 1; i >= 1; i--) {
        	//for column
            for (k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
		
		
		//program 8 
		/*int n, i, j, k, count = 1;
        k = n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < k; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                System.out.print("*");
                if (i > 1 && count < i) {
                    System.out.print("A");
                    count++;
                }
            }
            System.out.println();
            k--;
            count = 1;
        }*/
		
		
		//program 9
		/*int i, j, k = 1;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k);
                ++k;
            }
            System.out.println();
        }*/
        
        
        //program 10
        /*int i, j, k;
        for(i = 5; i >= 1; i--){
            for(j = i; j <= 5; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i = 1; i <= 5; i++){
            for(j = i; j <= 5; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
		
		
		//program 11
		/*int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (k = i; k <= 5; k++) {
                System.out.print("  ");
            }
            int x = (i * 2) - 1;
            int z = i;
            boolean b = false;
            for (j = 1; j <= x; j++) {
                System.out.print(z + " ");
                if (z == x) {
                    b = true;
                }
                if (b == true)
                    z--;
                else
                    z++;
            }
            System.out.println();
        }*/
		
		
		//program 12
		/*int i,j;
		for(i=1;i<=5;i++){
		    for(j=1;j<=5;j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }*/
		
		
		//program 13
		/*int i, j, k;
		//for rows
        for (i = 1; i <= 5; i++) {
        	//for column
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for next line
            System.out.println();
        }*/
		
		
		//program 14
		/*int i, j, k;
        for (i = 5; i >= 1; i--) {
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
		
		
		//program 15
		/*int i, j, k;
		//for rows
        for (i = 1; i <= 5; i++) {
        	//for column
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 5 - 1; i >= 1; i--) {
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
		
		
		//program 16
		/*int i, j, k, n = 5;
        for (i = 1; i <= 5; i++) {
            for (k = 1; k <= n; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            n = n - 1;
        }*/
		
		
		//program 17
		/*int i, k;
        for (i = 1; i <= 5; i++) {
            for (k = 5; k >= 1; k--) {
                if (k <= i)
                    System.out.print(k);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/
		
		
		//program 18
		/*int i, k;
        //rows
        for (i = 1; i <= 5; i++) {
            //columns
            for (k = 1; k <= i; k++) {
                if(k <= i)
                    System.out.print(k);
                else
                    System.out.print(" ");
            }
            for (k = 5; k >= 1; k--) {
                if (k <= i)
                    System.out.print(k);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/
		
		
		//program 19
		/*int i,j,k=1;
		for(i=1;i<=5;i++){
		    k = i;
		    for(j=1;j<=i;j++){
	            System.out.print(k);
	            ++k;
	        }
	        System.out.println();
	    }*/
		
		
		//program 20
		/*int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = i; j > 1; j--)
                System.out.print(j);
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }*/
		
		
		//program 21
		/*int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j == 5 || j == 1 || i == 1 || i == 5)
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }*/
		
		
		//program 22
		/*int i, j, k;
		//for rows
        for (i = 1; i <= 5; i++) {
        	//for column
            for (k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //for rows
        for (i = 5 - 1; i >= 1; i--) {
        	//for column
            for (k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/
		
		
		//program 23
		/*int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }*/
		
		
		//program 24
		/*int i, j, k = 1;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++, k++)
                System.out.print(k);
            System.out.println();
        }*/
		
		
		//program 25
		/*int i, j;
        //for rows
        for(i=1;i<=8;i++){
            //for columns
        for(j=1;j<=8-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=8;j++){
            if(i==1 || i==8 || j==1 || j==8)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
      }*/
		
		
		//program 26
		/*int i, j, k;
	      for(i = 1; i <= 5; i++){
	         for(j = 1; j < i; j++){
                System.out.print(" ");
            }
	         for(k = i; k <=5; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }*/
		
		
		//program 27
		/*int i, j, k;
		  for(i = 5; i >= 1; i--){
	         for(j = 1; j < i; j++){
	             System.out.print(" ");
	         }
	         for(k = i; k <= 5; k++){
	             System.out.print(k+" ");
	         }
	         System.out.println();
	     }*/
		
		
		//program 28
		/*int i, j, k;
		//for rows
	     for(i = 1; i <= 5; i++){
	    	 //for column
	         for(j = 1; j < i; j++){
                System.out.print(" ");
            }
	         for(k = i; k <=5; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
	     //for rows
	     for(i = 5-1; i >= 1; i--){
	    	 //for column
	         for(j = 1; j < i; j++){
	             System.out.print(" ");
	         }
	         for(k = i; k <= 5; k++){
	             System.out.print(k+" ");
	         }
	         //for next line
	         System.out.println();
	     }*/
		
		
		//program 29
		/*int i, j;
        //for rows
        for(i = 1; i <=5; i++){
            //for column
            for(j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //for rows
        for (i = 5; i >= 1; i--) {
            //for columns
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //for next line
            System.out.println();
        }*/
	}

}
