//$Id$
package test.main;

public class TestMain {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5};

		for(int xy : arr){//test conflict
			System.out.println("Newest Data:"+xy);
		}
		System.out.println("Welcome!");
	}
}
