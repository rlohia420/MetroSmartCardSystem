package com.mscs.daos;

public class MyClass implements Interface1 , Interface2{
	public static void test(MyClass my) {
		System.out.println(my.getClass().getName());
	}
	
	public static void main(String args[]) {

	int y =7;
		int x = (y+1)/2;
		for(int i=0;i<=x;i++) {
			for(int k =0 ;k< i;k++) {
				System.out.print("-");
			}
			for(int j = i;j<x;j++) {
				System.out.print("*"); 
			}
			//if(i<x) {
			for(int m=1;m<x-1;m++) {
				for(int l=x-1;l>=m;l--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
}
}