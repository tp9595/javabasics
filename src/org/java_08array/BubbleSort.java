package org.java_08array;

public class BubbleSort {

	public static void bubble(int ar[]) {
		System.out.println("Befor Sorting");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		for (int i =0;i<ar.length;i++) {
			for(int j = 1;j<ar.length-i;j++) {
				if(ar[j-1]<ar[j]) {//6
					int temp = ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}if(i==0) {
				System.out.println("smallest number="+ar[ar.length-1]);
			}
		}System.out.println("After Descending Sorting");
		for(int i=0;i<ar.length;i++) {

			System.out.println(ar[i]);
		}

		for (int i =0;i<ar.length;i++) {
			for(int j = 1;j<ar.length-i;j++) {
				if(ar[j-1]>ar[j]) {
					int temp = ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==0) {
				System.out.println("largest="+ar[ar.length-1]);
			}
		} System.out.println("After Ascending Sorting");
		for (int i=0; i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}

	public static void main (String[] args) {
		int ar[]= {70,85,56,21,96,32,98};
		String str []= {null,"Rohit"};//null is allowed in 
		for(String str1:str) {
			System.out.println(str1);
		}
		BubbleSort.bubble(ar);
	}

}
