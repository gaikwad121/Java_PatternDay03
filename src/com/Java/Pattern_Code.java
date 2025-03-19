package com.Java;

public class Pattern_Code {

	public static void main(String[] args) {
		
 Pascales();
 NumPattern(6);
 rev();
 AlphaRev();
 KthPattern(5);
 sandGlass(6);
 Alphabate(4);
 patternChar(4);
 revAlpha(5);
 PasclsTriangle(4);
	}
 /* Pascale's Triangle
	*
	**
	***
	****
	*****
	******
	*****
	****
	***
	**
	*

	*/

	static void Pascales(){
		int num=6;
	for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
	System.out.print("*");
	}
	System.out.println();
	}
	for(int i=num-1;i>=1;i--) {
	for(int j=1;j<=i;j++) {
	System.out.print("*");
	}
	System.out.println();
	}
	}
	/*
1
12
123
1234
12345
123456
	 */
	static void NumPattern(int n) {
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
	System.out.print(j);
	}
	System.out.println();
	}
	}
	/*
4
43
432
4321
	 */
	static void rev() {
	for(int i=4;i>=1;i--) {
	for(int j=4;j>=i;j--) {
	System.out.print(j);
	}
	System.out.println();
	}
	}
	/*
A B C D 
A B C 
A B 
A 
	 */
	static void AlphaRev() {
	int num=4;
	int ch=65;
	for(int i=num;i>=1;i--) {
		
	for(int j=1;j<=i;j++) {
	System.out.print((char)ch+" ");
	}
	ch++;
	
	System.out.println();
	}
	}
	/*
*****
****
***
**
*
*
**
***
****
*****
	 */
	static void KthPattern(int num) {
	for(int i=num;i>=1;i--) {
	for(int j=1;j<=i;j++) {
	System.out.print("*");
	}
	System.out.println();
	}
	for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
	System.out.print("*");
	}
	  System.out.println();
	}
	}
	/*
	* * * * * * 
	 * * * * * 
	  * * * * 
	   * * * 
	    * * 
	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * 
	* * * * * * 
	*/
	static void sandGlass(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
			}
	for(int i=2;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
}
	/*  Alphabate K
	 * 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 

	 */
	static void Alphabate(int n) {
		for(int i=n;i>=1;i--) {
			int ch=65;
		for(int j=1;j<=i;j++) {
		System.out.print((char)ch+" ");	
		ch++;
		}
		System.out.println();
		}
		for(int i=1;i<=n;i++) {
			int ch=65;
		for(int j=1;j<=i;j++) {
			System.out.print((char)ch+" ");
		
		ch++;
		}
		System.out.println();
		}
	}
	/*
   A  
  A  B  
 A  B  C  
A  B  C  D  

	 */
	static void patternChar(int n) {
	for(int i=1;i<=n;i++) {
	int ch=65;
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
	System.out.print((char)ch+"  ");
	
	ch++;
	}
	System.out.println();
	}
	}
	/*
	A  B  C  D  
	A B C D E 
	 A B C D 
	  A B C 
	   A B 
	    A 
	    */
	static void revAlpha(int n) {
	for(int i=n;i>=1;i--) {
	int ch=65;
	for(int j=1;j<=n-i;j++) {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print((char)(ch)+" ");
	
	ch++;
	}
	System.out.println();
	}
	}
	/*
A 
A B 
A B C 
A B C D 
A B C 
A B 
A 

	 */
	static void PasclsTriangle(int n) {
	for(int i=1;i<=n;i++) {
	int ch=65;
	for(int j=1;j<=i;j++) {
	System.out.print((char)ch+" ");
	ch++;
	}
	System.out.println();
	}
	for(int i=n-1;i>=1;i--) {
	int ch=65;
	for(int j=1;j<=i;j++) {
	System.out.print((char)ch+" ");
	ch++;
	}
	System.out.println();
	}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
