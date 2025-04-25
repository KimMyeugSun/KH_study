package card;

public class CardManager {
/*
 *  1회 게임 시 모든 카드를 세팅하고 관리하기 위한 클래스
 *  각 카드 객체 배열에 무늬와, 숫자가 담겨있음
 */
	
	Card[] cardArr = new Card[56];
	Card card = new Card();
	
	public void setCardName() {
		int index = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 14; j++) {
				cardArr[index] = new Card(card.patterns[i], card.cardNums[j]);
				index++;
			}
		}
	}
	public int cardScore() {
		for(int i = 0; i < card.cardNums.length; i++) {
			if(card.cardNums[i].equals("K") || card.cardNums[i].equals("Q")|| card.cardNums[i].equals("J")) {
				card.score = 10;
			}else {
				card.score = i;
			}
		}
		return card.score;
	}
	public void setCardScore() {
		for(int i = 0; i < 56; i++) {
			if(cardArr[i].cardNum)
		}
	}

	public void scorePrint() {
		for(int i = 0; i < cardArr.length; i++) { 
			System.out.print(cardArr[i].Pattern + " ");
			System.out.print(cardArr[i].cardNum + " ");
			System.out.print(cardArr[i].score + "\n");
		}
	}

}
