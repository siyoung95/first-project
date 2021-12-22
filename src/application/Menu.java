package application;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
	Scanner scanner = new Scanner(System.in);
	static ArrayList<Product> cart = new ArrayList<Product>();

	public static void Mainmenu() {
		Scanner scanner = new Scanner(System.in);

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

	public static void Order() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------       ------------------       ----------------------");
			System.out.println("=== 1.Hamburger  ===       ===   2.Side   ===       ===   3.Beverage   ===");
			System.out.println("--------------------       ------------------       ----------------------");
			System.out.println("             -------------------");
			System.out.println("             ===    4.Cart   ===");
			System.out.println("             -------------------");
			

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
				} else {
					System.out.println("없는 메뉴입니다.");
				}
				break;
			}
			
		}
	}
	public static void checkCart() {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		for (Product each : cart) {
           total = total + each.getPrice();
        }
		
		for (Product each : cart) {
            System.out.printf("[장바구니] 음식 : %s, 가격 : %d\n", each.getName(), each.getPrice());
        }
		System.out.println("총 결제금액은" + total + "입니다.");
		System.out.print("결제하시곘습니까? ('y' or 'n')");
		String click3 = scanner.nextLine();
		if(click3 == "y") {
			System.out.println("결제방식을 선택하세요>>");
			int click4 = scanner.nextInt();
			System.out.println("1.카드결제");
			System.out.println("2.현금결제");
			
			if(click4 == 1) {
				System.out.println("카드를 꽂아주세요.");
			} else if (click4 == 2) {
				System.out.println("현금을 넣어주세요.");
			} else {
				System.out.println("없는 선택지 입니다.");
			}
		} else if(click3 == "n") {
			
		} else {
			System.out.println("없는 선택지 입니다.");
		}
	}

}
