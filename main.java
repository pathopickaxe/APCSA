package main; /*package*/	import java.util.Random;	import java.util.Scanner; //imports
public class main {		public static Random rand = new Random();	public static Scanner in = new Scanner(System.in); //class and global objects
	public static String getCombo(String a, String b) {  //declare method
		int[][] nums = {	rand.ints(3,0,a.length()).sorted().distinct().toArray()	, 	rand.ints(3,0,b.length()).sorted().distinct().toArray()	}; //creates 2d array of random sorted int arrays
		return a.substring(nums[0][0], nums[0][  nums[0].length-1  ] ) /* regardless of items in list nums, gets largest*/ + b.substring(nums[1][0], nums[1][  nums[1].length-1  ] );/* returns combined substring*/		} //end getCombo
	public static void main(String[] args) { System.out.println("enter Mother's name followed by the Father's name."); //lets user know what to do
		System.out.println(getCombo(in.nextLine(), in.nextLine()));	/*does the thing*/	}	/*end main*/ } //end class main
