package app;

import java.util.Scanner;



public class input {
	Scanner scan = new Scanner(System.in);
	
	public String input2(int mode) {
		String result = null;
		
		switch(mode) {
		
		case 1:
			while(true) {
				System.out.println("id를 입력하세요!");
				result = scan.nextLine(); //아이디 입력받음
				
				if(result.trim().isEmpty()) { //result값에 빈칸이입력되면, .trim() : 앞,뒤에 공백을 없애줌 , isempty() : 공백으로만 이루어져 있으면 true 아니면 false
					
					System.out.println("id는 공백을 허용하지 않습니다.");
				} else {
					break;
				}
			}
		}
	}
	
	
}
