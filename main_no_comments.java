package main;	import java.util.Random;	import java.util.Scanner;
public class main {		public static Random rand = new Random();	public static Scanner in = new Scanner(System.in); 
	public static String getCombo(String a, String b) {  
		int[][] nums = {	rand.ints(3,0,a.length()).sorted().distinct().toArray()	, 	rand.ints(3,0,b.length()).sorted().distinct().toArray()	}; 
		return a.substring(nums[0][0], nums[0][  nums[0].length-1  ] ) + b.substring(nums[1][0], nums[1][  nums[1].length-1  ] );	} 
	public static void main(String[] args) { System.out.println("enter Mother's name followed by the Father's name."); 
		System.out.println(getCombo(in.nextLine(), in.nextLine()));		}	 } 