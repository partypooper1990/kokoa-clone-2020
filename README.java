package ex2_array_work;

import java.util.Scanner;

public class Ex1_work {
	
	public static void main(String[] args) {
		
		//배열의 길이 : 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이 : ");
		
		int n = sc.nextInt();
		char alpha = 'A';
		
		char[] c = new char[n];
		
		for(int i = 0; i < c.length; i++) {
			// c[i] = alpha++;
			// System.out.print(c[i]); 
			System.out.print( c[i] = alpha++ );
		}
		
		System.out.println();
		
		System.out.println("--- String배열의 초기값 ---");
		
		String[] sArr = new String[2];
		sArr[0] = null; // 아무것도 없는 상태
		sArr[1] = ""; // 빈 값을 넣은 상태
		
		System.out.println("null로 초기화 : " + sArr[0]);
		System.out.println("빈 값(\"\")으로 초기화 : " + sArr[1]);
		
		// 실무에서는 ""; 로 초기화
		
		String a = null; // String a = "";
		a += "안녕";
		System.out.println(a);
				
	}//main

}
