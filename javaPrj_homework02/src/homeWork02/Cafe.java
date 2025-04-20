package homeWork02;

import java.util.Scanner;

public class Cafe {

	Scanner sc = new Scanner(System.in);
	// 시간에 따라 설정한 코드가 실행됨
	int timeNow;
	public void whatTimeNow() {
		System.out.print("지금이 몇시지? (시계를 보며) : ");
		int timeNow = sc.nextInt();
		sc.nextLine();
		if(timeNow == 10) {
			System.out.println("오픈 시간이네요! 가게 문을 열고 영업을 시작합니다!");
		}else if(timeNow <= 10 ||timeNow >= 20){
			System.out.println("마감 시간이다!!하루가 끝났네요. 오늘도 고생했습니다 :)");
			System.exit(0);
		}else {
			System.out.println("아직도 마감 전이네....손님이 더 오겠어...");
		}
	}
	
	// 판매 수치를 누적
	int[] sales = new int[5];
	int todayVisit = 0;
	
	public void sales(int index, int m) {
	    sales[index] += m;
	    this.todayVisit++;
	}
	
	// 영업 종료 시 하루 매출액 계산
	public void dailySales(int[] s) {
		int moeny = 0;
		for(int i = 0; i < s.length; i++) {
			moeny += s[i];
		}
		System.out.printf("오늘의 총 매출액은 %s원 이네요. 많이 벌었어요ㅎㅎ 내일도 행복한 하루를 보내요! 안녕~~", moeny);
	}
	
}
