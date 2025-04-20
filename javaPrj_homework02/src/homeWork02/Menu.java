package homeWork02;

import java.util.Scanner;

public class Menu {
	
	/*
	 *  메뉴 부분
	 *  1. 메뉴판 출력 기능
	 *  2. 장바구니에 원하는 상품을 담고 상품을 다 고르면 총 가격을 계산
	 *  메뉴와 가격 추가, 수정 하는 기능은 아직
	 */
	Scanner sc = new Scanner(System.in);
	
	
	String[] sigM = {"1. 433-10 카페라떼","2. 메리골드티파티   ","3. 쓴거          ","4. 너부리가데이로   ",};
	String[] destM = {"1. 요거시 홍시       ","2. 아스테룸 티그레    ","3. 아스테룸 버터바    ","4. 아스테룸 플라워파운드","5. 플레이브라우니     "};
	String[] p_sigM = {"1. 잠기돌 싱글 오리진  ","2. 피지크 휜 쉐이크   ","3. 당도 최고 핑쪼에이드","4. 차가운 늑대 라떼   ","5. 바이너리 블랙     "};
	String[][] menuGuide = {sigM, destM, p_sigM};
	String[] menuGuideName = {"십카페 시그니처 ", "디저트", "플레이브 시그니처"};
	int[] sigP = {6000, 6000, 4000, 6000};
	int[] destP = {9000, 4500, 5000, 4500, 10000};
	int[] P_sigP = {5000, 6500, 6500, 6500, 5000};
	int[][] menuP = {sigP, destP, P_sigP};
	String[] orderList = new String[10];
	int[] orderPrice = new int[10];
	int menuC = 0;
	int OLIdx = 0;
	int OPIdx = 0;
	
	int firstC;
	
	public void menuInfo() {
		System.out.println("메뉴를 안내드릴께요 ;)");
		while(true) {
			System.out.printf("1. 십카페 시그니처, 2. 디저트, 3.플레이브 시그니처 중 몇 번째 메뉴를 선택하시겠습니까? : ");
			this.firstC = sc.nextInt() - 1;// 입력받는 숫자를 -1하여  인덱스로 사용
			sc.nextLine();
			System.out.printf("%s 메뉴를 선택하셨습니다. 메뉴 안내를 드릴께요!\n", menuGuideName[firstC]);
			if(firstC == 0 || firstC == 1 || firstC == 2) {
				System.out.println("============================================");
				for(int i = 0; i < menuGuide[firstC].length; i++) {
					System.out.printf("  %s      :       %d원   \n", menuGuide[firstC][i], menuP[firstC][i]);
				}
				System.out.println("============================================");
			}else if(firstC == 8) {
				System.out.println("주문을 취소하셨습니다");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 한 번 입력해주세요 : ");
				continue;
			}
			this.myMenu();
			break;
		}
			
	}
	
	//메뉴를 선택하여 장바구니에 담기
	public void myMenu() {
		while(true) {
			this.menuC = 0;
			System.out.print("장바구니에 담을 메뉴의 번호를 입력해주세요!(이전 메뉴로 돌아가시려면 9를 입력해주세요) : ");
			menuC = sc.nextInt() - 1; // 입력받는 숫자를 -1하여 인덱스로 사용
			sc.nextLine();
			if(menuC >= 0 && menuC < menuGuide[firstC].length) {
				orderList[OLIdx] = this.choiceM(menuC);
				orderPrice[OPIdx] = this.choiceP(menuC);
				OLIdx++;
				OPIdx++;
				System.out.printf("%s메뉴를 선택하셨습니다!\n", orderList[OLIdx-1]);
			}else if(menuC == 8) { // 사용자 입력 9 일 때 -1이 되기 때문에 menuC = 8로 설정
				this.menuInfo();
				break;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
			if (againC() == true) {
				continue;
			}else {
				this.pay();
				break;
			}
		}
	}
	public boolean againC() {
	    System.out.printf("다른 메뉴를 더 선택하시려면 1, 계산을 원하시면 0을 입력해주세요!\n");
	    int againOrNot = sc.nextInt();
	    sc.nextLine();
	    if(againOrNot == 1) {return true;}
	    else {return false;}
	}
	
	public String choiceM(int p) {
		return menuGuide[firstC][p];
	}
	
	public int choiceP(int p) {
		return menuP[firstC][p];
	}
	//가격 계산
	public int pay() {
		int money = 0;
		for(int i = 0; i < OPIdx + 1; i++) {
			money +=  orderPrice[i];
		}
		return money;
	}
	
	
}//class
