package card;

public class CardManager {
// 1회 게임 시 모든 카드를 세팅하고 관리하기 위한 클래스
	Card[] cardArr = new Card[56];
	Card card = new Card();
	
	public void setCard() {
		int index = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 14; j++) {
				cardArr[index] = new Card(card.patterns[i], card.cardNums[j]);
				index++;
			}
		}
	}
	
	// 카드가 맞게 입력이 되었는지 확인하기 위한 임시 메서드
	public void namePrint() {
		for(int i = 0; i < cardArr.length; i++) {
			System.out.println(cardArr[i]);
		}
	}
	

	


}
