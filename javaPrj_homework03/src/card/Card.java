package card;

public class Card {
	/*
	 * 카드를 세팅하기 위한 클래스
	 * 카드는 4개 무늬, 각 A부터 K까지 14개, 총 56개의 카드가 있음
	 */
	public Card(String name, String num) {
		this.Pattern = name;
		this.cardNum = num;
	} 
	public Card() {
		
	}	
	String[] patterns = {"diamond", "spade", "heart", "club"};
	String[] cardNums = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
	int score = 0;
	String Pattern;
	String cardNum;
	public int cardScore() {
		int score = 0;
		for(int i = 0; i < cardNums.length; i++) {
			if(cardNums[i].equals("K") || cardNums[i].equals("Q")|| cardNums[i].equals("J")) {
				score = 10;
				break;
			}else {
				score = i;
				break;
			}
		}
		return score;
	}
	
	
}
