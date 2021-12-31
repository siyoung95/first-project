package application;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Product> cart = new ArrayList<Product>(); //
	ArrayList<Integer> orderlist = new ArrayList<Integer>();
	
	int waitingNum = 0;

	public void Mainmenu() {

		System.out.println("자바버거에 오신것을 환영합니다^^");
		System.out.println();
		System.out.println("무엇을 도와드릴까요?");
		System.out.println("1. 주문하기");
		System.out.println("2. 나가기");
		System.out.print(">>");
		int click = scanner.nextInt();

		if (click == 1) {
			Order();
		} else {
			System.out.println("프로그램종료");
		}
	}

	public void Order() {
		while (true) {
			System.out.println("--------------------       ------------------       ----------------------");
			System.out.println("=== 1.Hamburger  ===       ===   2.Side   ===       ===   3.Beverage   ===");
			System.out.println("--------------------       ------------------       ----------------------");
			System.out.println("--------------------       -------------------      ---------------------");
			System.out.println("===    4.Cart    ===       ===  5.Pick Up  ===      ===     6.Exit    ===");
			System.out.println("--------------------       -------------------      ---------------------");
			

			System.out.print("메뉴보기 >>");
			int click = scanner.nextInt();
			while (true) {
				if (click == 1) {
					System.out.println("====================== Menu ============================");
					System.out.println("1. 불고기버거  2000원  2. 새우버거  2200원  3. 치킨버거  2500원  ");
					System.out.println("========================================================");
					System.out.println("                                             4. 뒤로가기🔙");
					System.out.println("메뉴를 선택해주세요 >>");
					int click2 = scanner.nextInt();

					switch (click2) {
					case 1:
						Hamburger Bulgogi = new Hamburger("불고기버거", 2000);
						System.out.println("불고기버거가 장바구니에 추가되었습니다.");
						cart.add(Bulgogi);
						break;
					case 2:
						Hamburger Shirimp = new Hamburger("새우버거", 2200);
						System.out.println("새우버거가 장바구니에 추가되었습니다.");
						cart.add(Shirimp);
						break;
					case 3:
						Hamburger Chicken = new Hamburger("치킨버거", 2500);
						System.out.println("새우버거가 장바구니에 추가되었습니다.");
						cart.add(Chicken);
						break;
					case 4:
						break;
					default:
						System.out.println("없는 메뉴입니다.");
						break;
					}
					break;
				} else if (click == 2) {
					System.out.println("====================== Side ============================");
					System.out.println("1. 감자튀김  1500원   2. 치즈스틱  1800원   3. 맥너겟  2300원  ");
					System.out.println("========================================================");
					System.out.println("                                             4. 뒤로가기🔙");
					System.out.println("메뉴를 선택해주세요 >>");
					int click2 = scanner.nextInt();

					switch (click2) {
					case 1:
						Side Frenchfries = new Side("감자튀김", 1500);
						System.out.println("감자튀김이 장바구니에 추가되었습니다.");
						cart.add(Frenchfries);
						break;
					case 2:
						Side CheeseStick = new Side("치즈스틱", 1800);
						System.out.println("치즈스틱이 장바구니에 추가되었습니다.");
						cart.add(CheeseStick);
						break;
					case 3:
						Side MacNugget = new Side("맥너겟", 2300);
						System.out.println("맥너겟이 장바구니에 추가되었습니다.");
						cart.add(MacNugget);
						break;
					case 4:
						break;
					default:
						System.out.println("없는 메뉴입니다.");
						break;
					}
					break;
				} else if (click == 3) {
					System.out.println("====================== Beverage ========================");
					System.out.println("1. 콜라  1000원      2. 사이다  1000원    3. 커피  1300원     ");
					System.out.println("========================================================");
					System.out.println("                                             4. 뒤로가기🔙");
					System.out.println("메뉴를 선택해주세요 >>");
					int click2 = scanner.nextInt();

					switch (click2) {
					case 1:
						Beverage Coke = new Beverage("콜라", 1000);
						System.out.println("콜라가 장바구니에 추가되었습니다.");
						cart.add(Coke);
						break;
					case 2:
						Beverage Cider = new Beverage("사이다", 1000);
						System.out.println("사이다가 장바구니에 추가되었습니다.");
						cart.add(Cider);
						break;
					case 3:
						Beverage Coffee = new Beverage("커피", 1300);
						System.out.println("커피가 장바구니에 추가되었습니다.");
						cart.add(Coffee);
						break;
					case 4:
						break;
					default:
						System.out.println("없는 메뉴입니다.");
						break;
					}
					break;
				} else if (click == 4) {
					checkCart();
				} else if (click == 5) {
					pickUp();
				} else if(click == 6) {
					exit();
				} else {
					System.out.println("없는 메뉴입니다.");
				}
				break;
			}
			
		}
	}
	public void checkCart() {
		int total = 0;
		
		for (Product each : cart) { //cart라는 배열객체를 Product 타입의 배열을 하나씩 모두 출력하는 each 반복문
           total = total + each.getPrice();
        }
		
		for (Product each : cart) {
            System.out.printf("[장바구니] 음식 : %s, 가격 : %d\n", each.getName(), each.getPrice());
        }
		while(true) { //
			System.out.println("총 결제금액은 " + total + "입니다.");
			System.out.print("결제하시곘습니까? (y/n)");
			scanner.nextLine();
			String click3 = scanner.nextLine();
			if(click3.equals("y")) {
				while(true) {
					System.out.print("결제할 금액을 입력하세요>>");
					int click4 = scanner.nextInt();
					
					if(click4 == total) {
						System.out.println("결제가 완료되었습니다.");
						waitingNum++;
						orderlist.add(waitingNum);
						receipt();
						break;
					} else {
						System.out.println("금액이 맞지않습니다.");
					} 
				}
			} else if(click3.equals("n")) {
				Order();  
			} else {
				System.out.println("없는 선택지 입니다.");
			} break;
		}	
	}
	
	public void receipt() {
		System.out.println("대기번호 : " + waitingNum);
	}
	
	public void pickUp() {
		System.out.print("대기번호가 몇번이세요?");
		int numcheck = scanner.nextInt();
		int numcheck2 = numcheck -1;
		
		if(numcheck == orderlist.get(numcheck2)) {
			System.out.println("대기번호 " + orderlist.get(numcheck2) + "번 고객님 주문하신 음식나왔습니다.");
			} else if(numcheck != orderlist.get(numcheck2)){
				System.out.println("대기번호를 확인해주세요.");
			} else{
				System.out.println("주문된 음식이 없습니다.");
				Order();
			}
			
		// Q. Arraylist cart에 저장한 배열의 인덱스 0,1,2 찾기 (정확히는 cart에 담겨진 Product 클래스의 name만 빼내오고 싶음)
		
		// 1. Arraylist 에서 하나의 인덱스 가져오기
		// cart.get(0); > 해당 객체의 0번 인덱스의 주소값을 가져옴  //String cartname = cart.get(0).toString();
		// cart.get(0).toString(); > 해당 객체의 0번 인덱스의 주소값을 문자로 변환시켜 가져옴 but, 객체의 class에서 override로 toString()메서드를 정의해서 어떤 값으로 가져올지 정해줘야 cart.get(0).toString();같은 형태로 사용가능
		
		// 2. Arraylist 에서 저장되어 있는 모든 인덱스 가져오기 > foreach문, 람다식 사용
		// foreach문의 선언 : for (데이터타입 for문이름 : 객체이름) { 출력구간 } 
		// 람다식 선언 : 객체이름.foreach(for문이름 -> System.out.println(for문이름)); > 람다식 사용이유 : for 반복문을 하나의 변수에 집어넣고 변수로 출력하기 위해서
		
		} 
	public void exit() {
		System.out.println("손님, 안녕히가세요");
		System.exit(0);
	}
}
	


