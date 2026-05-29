package samplepackage;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Patterns {

	public static void main(String[] args) {
		int row = 5;

//.............................................................................................................

////		int row =5;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = row; j >= row + 1 - i; j--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

//		1
//		22
//		333
//		4444
//		55555
//.............................................................................................................
//
////		int row =5;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = row; j >= row + 1 - i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		5
//		54
//		543
//		5432
//		54321

//.............................................................................................................

////		int row =5;
//		for (int i = 5; i >= 1; i--) {
//			for (int j = row; j >= i; j--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		
//		5
//		44
//		333
//		2222
//		11111

//.............................................................................................................

//		int row =5;
//		for (int i = 5; i >= 1; i--) {
//			for (int j = row; j >= i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		5
//		54
//		543
//		5432
//		54321

//.............................................................................................................

		int x;
//		for (int i = 1; i <= 5; i++) {
//			x = 5;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(x + " ");
//				x++;
//			}
//			System.out.println();
//		}
//		5 
//		5 6 
//		5 6 7 
//		5 6 7 8 
//		5 6 7 8 9 

//.............................................................................................................

////				
//		for (int i = 1; i <= 5; i++) {
//			x = 5;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//
//		1
//		22
//		333
//		4444
//		55555

// .............................................................................................................

//		
//		for (int i = 1; i <= 5; i++) {
//			x = 5;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//
//		1
//		12
//		123
//		1234
//		12345

//.............................................................................................................

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 

//.............................................................................................................
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

//.............................................................................................................

//		for (int i = 1; i <= 5; i++) {
////			int y=1;
//			for (int j = i; j >= 1; j--) {
//				System.out.print(i);
////				y++;
//			}
//			System.out.println();
//		}

//.............................................................................................................
//
//		for (int i = 1; i <= 5; i++) {
////					int y=1;
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j);
////						y++;
//			}
//			System.out.println();
//		}

//.............................................................................................................
//
//		for (int i = 1; i <= 5; i++) {
////			int y=1;
//			for (int j = row + 1 - i; j <= row; j++) {
//				System.out.print(i);
////				y++;
//			}
//			System.out.println();
//		}

//		1
//		22
//		333
//		4444
//		55555

//.............................................................................................................
//
//		for (int i = 1; i <= 5; i++) {
////			int y=1;
//			for (int j = row; j >= row + 1 - i; j--) {
//				System.out.print(j);
////				y++;
//			}
//			System.out.println();
//		}

//		5
//		54
//		543
//		5432
//		54321

//.............................................................................................................
//		for (int i = 1; i <= 5; i++) {
////			int y=1;
//			for (int j = row + 1 - i; j <= row; j++) {
//				System.out.print(j);
////				y++;
//			}
//			System.out.println();
//		}

//		5
//		45
//		345
//		2345
//		12345

//.............................................................................................................
//
//		for (int i = 1; i <= 5; i++) {
////			int y=1;
//			for (int j = 1; j <= i; j++) {
//				System.out.print((char) (j + 64) + " ");
////				y++;
//			}
//			System.out.println();
//		}

//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E

//.............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*"+ " ");
//			}
//			System.out.println();
//		}

//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * *

//.............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//			
//		}
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 

//.............................................................................................................

//				for (int i = 1; i <= row; i++) {
//					int y;
//					
//					for (int j = 1; j <= row - i; j++) {
//						System.out.print(" " + " ");
//					}
//					y=i;
//					for (int j = 1; j <= i; j++) {
//						System.out.print(y + " ");
//						y--;
//					}
//					for (int j = 2; j <= i; j++) {
//						System.out.print(j+ " ");
//					}
//					System.out.println();
//					
//				}

//		          1 
//		        2 1 2 
//		      3 2 1 2 3 
//		    4 3 2 1 2 3 4 
//		  5 4 3 2 1 2 3 4 5 

//.............................................................................................................

//		System.out.println();
//		for (int i = 1; i <= row; i++) {
//			int y;
//
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print(j);
//			}
//			int k = 9;
//			for (int j = 1; j <= row - i + row - i + 1; j++) {
//				System.out.print(i);
//			}
//			y = i-1;
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print(y);
//				y--;
//			}
//			System.out.println();
//		}
////		 System.out.println("////////////////////////////////////////////////////////////");
//		for (int i = 1; i <= row-1; i++) {
//			row =4;
//			int y;
//			for(int j = 1; j<=4-i; j++ ) {
//				System.out.print(j);
//			}
//			y = row-i+1;
//			for(int j = 1; j<=i+i+1; j++ ) {
//				System.out.print(y);
//			}
//			y = row - i;
//			for (int j=1; j<=row-i; j++) {
//				System.out.print(y);
//				y--;
//			}
//			
//			System.out.println();
//		}

//.............................................................................................................

//		System.out.println();
//		for(int i=1; i<=row; i++) {
//			for(int j=1; j<=i-1; j++) {
//				System.out.print("+");
//			}
//			for(int j=1; j<=row-i+row-i+1; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<=i-1; j++) {
//				System.out.print("+");
//			}	
//			System.out.println();
//		}

//.............................................................................................................

//		System.out.println();
//		for (int i = 1; i <= row; i++) {
//			int y;
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = row; j >= row + 1 - i; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

//.............................................................................................................
//
//		System.out.println();
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = row + 1 - i; j <= row; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println(); 
//
//		}

//.............................................................................................................

//		System.out.println();
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//
//		}
////.............................................................................................................

//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(i==1 || i==9 || j==1 || j==9) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

//		* * * * * * * * * 
//		*               * 
//		*               * 
//		*               * 
//		*               * 
//		*               * 
//		*               * 
//		*               * 
//		* * * * * * * * * 
////.............................................................................................................

//DIAGONAL
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(i==1 || i==9 || j==1 || j==9 || i==j) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		
//
//* * * * * * * * * 
//* *             * 
//*   *           * 
//*     *         * 
//*       *       * 
//*         *     * 
//*           *   * 
//*             * * 
//* * * * * * * * * 

////.............................................................................................................

		// CROSS DIAGONAL or COMMON SUM DIAGONAL
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(i==1 || i==9 || j==1 || j==9 || i==j || i+j==10) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

//
//* * * * * * * * * 
//* *             * 
//*   *           * 
//*     *         * 
//*       *       * 
//*         *     * 
//*           *   * 
//*             * * 
//* * * * * * * * * 

////.............................................................................................................

		// CROSS DIAGONAL or COMMON SUM DIAGONAL
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(i==j || i==9 || j==1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		
//		*                 
//		* *               
//		*   *             
//		*     *           
//		*       *         
//		*         *       
//		*           *     
//		*             *   
//		* * * * * * * * * 

////.............................................................................................................

/// 		//CROSS DIAGONAL or COMMON SUM DIAGONAL
//		System.out.println();
//		for (int i = 1; i <= 7; i++) {
//			for (int j = 1; j <= 7; j++) {
//				if (i + j == 8 || i == 1 || j == 1) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

//* * * * * * * 
//*         *   
//*       *     
//*     *       
//*   *         
//* *           
//*             

////.............................................................................................................

//		/// //CROSS DIAGONAL or COMMON SUM DIAGONAL
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (i + j == 10 || i == 1 || i == 9 || i==j) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		
//
//* * * * * * * * * 
//  *           *   
//    *       *     
//      *   *       
//        *         
//      *   *       
//    *       *     
//  *           *   
//* * * * * * * * * 

/// .............................................................................................................
/// 
//		/// //CROSS DIAGONAL or COMMON SUM DIAGONAL
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (i + j == 10 || j == 1 || j == 9 || i==j) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

//		*               * 
//		* *           * * 
//		*   *       *   * 
//		*     *   *     * 
//		*       *       * 
//		*     *   *     * 
//		*   *       *   * 
//		* *           * * 
//		*               * 

/// .............................................................................................................

//		System.out.println();
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row+1-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<=i-1; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= row; i++) {
//		for(int j=1; j<=i+1; j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//		}
//		
//		*****
//		**** 
//		***  
//		**   
//		*    
//		**
//		***
//		****
//		*****
//		******

/// .............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <=i; j++) {
//				System.out.print(j);
//			}
//			for (int j = i-1; j >=1; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//	     1
//	    121
//	   12321
//	  1234321
//	 123454321

/// .............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j >=1; j--) {
//				System.out.print(j);
//			}
//			for (int j = 2; j <=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		    1
//		   212
//		  32123
//		 4321234
//		543212345

//		
//		for (int i =1; i<=row; i++) {
//			for (int j = 1; j <= row-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=row+1-i; j<=5; j++) {
//				System.out.print(j);
//			}
//			for(int j=4; j>=row+1-i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

/// .............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 5; j >= row + 1 - i; j--) {
//				System.out.print(j);
//			}
//			for (int j = row + 2 - i; j <= row; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//	     5
//	    545
//	   54345
//	  5432345
//	 543212345

/// .............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = row+1-i; j <= row; j++) {
//				System.out.print(j);
//			}
//			for (int j = 4; j >= row+1-i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//	     5
//	    454
//	   34543
//	  2345432
//	 123454321

/// .............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j);
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//	     1
//	    212
//	   32123
//	  4321234
//	 543212345

/// .............................................................................................................
//
//
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" "+" ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print("*"+" ");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		for (int i = row-1; i >= 1; i--) {
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" "+" ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print("*"+" ");
//			}
//			for (int j = 2; j <= i; j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 

/// .............................................................................................................

//		System.out.println();
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= row + 1 - i; j++) {
//				System.out.print("*" + " ");
//			}
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print(" " + " ");
//
//			}
//			for (int j = 1; j <= row + 1 - i; j++) {
//				System.out.print("*" + " ");
//			}
//
//			System.out.println();
//		}
//		for (int i = 2; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//			for (int j = 1; j <= row - i; j++) {
//				System.out.print(" " + " ");
//			}
//			for (int j = row - i; j >= 1; j--) {
//				System.out.print(" " + " ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}

////.............................................................................................................
//
//				for (int i = 1; i <= 5; i++) {
//					int y=i;
//					for (int j = row; j >= row + 1 - i; j--) {
//						System.out.print((char)(y+64));
//						y++;
//					}
//					System.out.println();
//				}
//				A
//				BC
//				CDE
//				DEFG
//				EFGHI

//.............................................................................................................

//		int y=1;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print((char)(y+64)+" ");
//				y++;
//			}
//			System.out.println();
//		}
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O 

//.............................................................................................................

//		int y=1;
//		for (int i = 1; i <= 5; i++) {
//			for (int j =1; j <=i; j++) {
//				System.out.print(y%2+"");
//				y++;
//			}
//			System.out.println();
//		}

//		1
//		01
//		010
//		1010
//		10101

//.............................................................................................................

//		for (int i = 1; i <= 4; i++) {
//		for (int j =1; j <=5; j++) {
//			if(i==1 || (j==1 && i==2) || (j==5 && i==2) || (j==2 && i==3) || (j==4 && i==3) || (j==3 && i==4)) {
//			System.out.print("*"+" ");
//			}
//			else {
//				System.out.print(" "+" ");
//			}
//		}
//		System.out.println();
//	}

//.............................................................................................................
//		int y=1;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(y + " ");
//				y++;
//			}
//			System.out.println();
//		}
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 

//.............................................................................................................
//		int y = 0;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				if(y==5) {
//					y=0;
//				}
//					System.out.print(y + " ");
//					y++;
//			}
//			System.out.println();
//		}
//
//		0 
//		1 2 
//		3 4 0 
//		1 2 3 4 
//		0 1 2 3 4 

//.............................................................................................................
//		int y = 0;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(y%5 + " ");
//					y++;
//			}
//			System.out.println();
//		}
//
//		0 
//		1 2 
//		3 4 0 
//		1 2 3 4 
//		0 1 2 3 4 

//.............................................................................................................
//		int y = 0;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print((i+j+1)%2+ " ");
////					y++;
//			}
//			System.out.println();
//		}
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
//		1 0 1 0 1 

//.............................................................................................................

//		int y = 1;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				if(y<0) {
//					y=1;
//				}
//					System.out.print(y + " ");
//					y--;
//			}
//			System.out.println();
//		}
//		1 
//		0 1 
//		0 1 0 
//		1 0 1 0 
//		1 0 1 0 1 

//.............................................................................................................

//		for (int i = 1; i <= row; i++) {
//		int y = i;
//			for (int j = 1; j <= i; j++) {
//					System.out.print(y%2+ " ");
//					y++;
//			}
//			System.out.println();
//		}
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
//		1 0 1 0 1 

//.............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			int y = i+1;
//				for (int j = 1; j <= i; j++) {
//						System.out.print(y%2+ " ");
//						y++;
//				}
//				System.out.println();
//			}
//		0 
//		1 0 
//		0 1 0 
//		1 0 1 0 
//		0 1 0 1 0 

//.............................................................................................................

//		for (int i = 1; i <= row; i++) {
//			int y = i+1;
//				for (int j = 1; j <= i; j++) {
//						System.out.print(y%2+ " ");
//						y++;
//				}
//				System.out.println();
//			}
//		0 
//		1 0 
//		0 1 0 
//		1 0 1 0 
//		0 1 0 1 0 

//.............................................................................................................

//		int y = 1;
//
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (y % 2 == 0) {
//					System.out.print((char) (y + 96) + " ");
//					y++;
//				} else {
//					System.out.print((char) (y + 64) + " ");
//					y++;
//				}
//			}
//			System.out.println();
//		}
//		A 
//		b C 
//		d E f 
//		G h I j 
//		K l M n O 

//.............................................................................................................
//		int rows=9;
//		System.out.println();
//		for(int i=1; i<=rows; i++) {
//			for(int j=1; j<=rows; j++) {
//				if(i==1 || i==9 || j==1 || j==9 || i==j  || rows+1-i==j || j==5 || i==5) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

//.............................................................................................................
//				int rows=5;
//				System.out.println();
//				for(int i=0; i<=rows; i++) {
//					for(int j=0; j<=rows+1; j++) {
//						if((i==1 && j%3==0) || (i==0 && j%3!=0) || i-j==2 || i+j==8) {
//							System.out.print("* ");
//						}
//						else if(i==2 && j==2) {
//							System.out.print("R"+" ");
//						}
//						else if(i==2 && j==3) {
//							System.out.print("C"+" ");
//						}
//						else if(i==2 && j==4) {
//							System.out.print("B"+" ");
//						}
//						else {
//							System.out.print("  ");
//						}
//					}
//					System.out.println();
//				}
//				
//				
//				for(int i=rows; i>=0; i--) {
//					for(int j=0; j<=rows+1; j++) {
//						if((i==1 && j%3==0) || (i==0 && j%3!=0) || i-j==2 || i+j==8) {
//							System.out.print("* ");
//						}
//						else if(i==2 && j==2) {
//							System.out.print("C"+" ");
//						}
//						else if(i==2 && j==3) {
//							System.out.print("S"+" ");
//						}
//						else if(i==2 && j==4) {
//							System.out.print("K"+" ");
//						}
//						else {
//							System.out.print("  ");
//						}
//					}
//					System.out.println();
//				}
//.............................................................................................................

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if ((j == 3 && i <= 3) || (j == 1 && i >= 3) || i % 2 == 1) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

		
		System.out.println("..................................");



		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if ((j == 3 && i <= 5) || i % 2 == 1) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if ((j == 1 && i <= 3) || (i == 3) || (j == 3 && i>=2)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

		
		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i%2==1 || (j==1 && i<=3 )|| (j==3 && i>=3)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i%2==1 || (j==1  )|| (j==3 && i>=3)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i==1 || j==3) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i==1 || (6-i==j)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i%2==1 || j==3 || j==1) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i==3 || i==1 || j==3 || ( i<=3 && j==1)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("..................................");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j==3) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			for (int j = 1; j <= 3; j++) {
				if (i==1 || i==5 || j==1 || j==3) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("..................................");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i==1 || i==4 || (i>=3 && j==4) || (j==1 && i<=4) || (i==3 && j==3)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
//		System.out.println("..................................");
//		
//
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i==1 && j<=3) || (i==1 && j<=6 && j>=3) || i==3 || (i==4 && j==3) ||j==1 || j==7 || (i==2 && j==1) || (i==2 && j==4) || (i==2 && j==7) || (i==5 && j<=3) || (i==5 && j==5)) {
					System.out.print("*" + " ");
				} 
//				else if(j==4){
//					System.out.println(" "+" ");
//				}
			else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
//		
	}

}
