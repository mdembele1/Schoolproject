package Org.perscholas.methodsweek3;

public class TwoDimensionsArrays {

	public static void main(String[] args) {
	int [][] arr2d= {
			{1,2,3},
			{4,5,6},
			{7,8,9,},
			{10,11,12},
		};
	
	System.out.println(arr2d.length);
	
	
	for (int i=0; i<arr2d.length;i++) {
		for(int j=0; j<3; j++) {
			System.out.println(arr2d[i][j]);
		}
	}
	for (int [] i : arr2d) {
		for(int j : i) {
	
	System.out.println(j);
		}
	}
	}

}
