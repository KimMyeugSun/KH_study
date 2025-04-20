package homeWork02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*	
		 * 	- 카페 운영 중
		 *  1. 카페 입장 시 안내
		 *  2. 메뉴 판 안내
		 *  4. 메뉴를 선택하고 총 가격을 알려줌
		 *  5. 손님이 인스타 계정을 팔로우하고 있으면 총 가격에서 5퍼 할인
		 *  6. 확인 후 계산으로 넘어가고 카페 이용 안내문 출력
		 * - 카페관리 중
		 * 1. 오늘의 매출 안내
		 */
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Cla cla = new Cla();
		Cafe cafe = new Cafe();
		
		//카페 운영시작인지 영업종료인지
		System.out.println("아침이 밝았습니다. 오늘도 십카페 오픈 준비를 하면서 하루를 시작해요:)");
		cafe.whatTimeNow();
		System.out.println("첫 손님이 오셨어요! 어서오세요!!");
		//메뉴를 선택하여 장바구니에 담기
		menu.menuInfo();
		
		// 장바구니에 담긴 메뉴의 가격을 더해 결제가격 안내
		System.out.printf("선택하신 메뉴의 총 가격은 %d원 입니다.\n "
				+ "인스타 계정을 팔로우 하셨으면 5%% 할인이 됩니다\n"
				+ "팔로우를 하셨으면 본인의 생년월일을 입력해주시고 할인을 원하지 않으면 0을 입력해주세요",menu.pay());
		// cla class에 저장된 사람이면 5%할인
		int birth = sc.nextInt();
		sc.nextLine();
		cla.getCla(birth);
		if(cla.insFollow) {
			System.out.println("총 결제 금액은 " + menu.pay() * 0.95 + "원 입니다");
		}else {
			System.out.println("총 결제 금액은 " + menu.pay() + "원 입니다");
		}
		cafe.sales(cafe.todayVisit, menu.pay());
		System.out.println("결제 되셨습니다. 맛있게 드세요!");
		System.out.print("지금 시간이 어떻게 되나요? 혹시 벌써 마감시간이 됐나?(시계를 본다)");
		cafe.whatTimeNow();
		System.out.println("=========시간이 흘렀다==========");
		System.out.println("오늘 손님이 많이 왔네!");
		cafe.whatTimeNow();
		System.out.println("오늘의 총 매출을 정리해보자!");
		cafe.dailySales(cafe.sales);
	}//main

}//class
