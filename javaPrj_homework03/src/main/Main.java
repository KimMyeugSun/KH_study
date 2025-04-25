package main;

import card.Card;
import card.CardManager;

public class Main {

	public static void main(String[] args) {
		/* 게임 진행 중 과정을 저장하고 실행하는 클래스
		 * 게임 방법
		 * 1. 베팅을 한 후 모든 플레이어와 딜러는 2장의 카드를 받음
		 * 2. 딜러는 자신의 카드 중 한 장을 오픈함
		 * 3. 딜러는 카드의 합이 17이 될 때까지 반드시 추가 카드를 뽑아야함
		 * 4. 플레이어는 카드의 합이 21이 넘지 않는 범위 내에서 hit, stay 할 수도 있음
		 */
		Card card = new Card();
		CardManager cardManager = new CardManager();
		cardManager.namePrint();
		
	}

}
