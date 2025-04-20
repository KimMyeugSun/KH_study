package homeWork02;

public class Cla {
	
	/*
	 *  손님 부분
	 *  1. 인스타 계정을 팔로우 하고 있는 지 확인하기 위한 클래스
	 *  2. 인스타를 팔로우한 손님은 임시로 배열 생성
	 *  3. 아스테룸에 있는 십카페는 5명 밖에 방문을 하지 않는다
	 */
	String[] insCla = {"예준","노아","봉구","은호","하민"};
	int[] insClaBirth = {912, 210, 715, 524, 1101};
	boolean insFollow;
	
	public boolean getCla(int b) {
		for(int i = 0; i < insClaBirth.length; i++) {
			if(insClaBirth[i] == b) {
				System.out.printf("안녕하세요! %s님 5%% 할인 가격으로 안내드릴께요!",insCla[i]);
				return this.insFollow = true;
			}
		}return false;
	}
	
}
