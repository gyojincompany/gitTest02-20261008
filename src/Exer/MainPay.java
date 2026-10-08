package Exer;

public class MainPay {

	public static void main(String[] args) {
		
		//Payment pay = new Card();
		//pay = new Cash();
		
		int a = 10;
		a = 100;
		
		Payment pay; //인터페이스는 인스턴스화가 불가능하므로 객체 변수만 선언
		Card card = new Card(); //카드 객체를 인스턴스 화->메모리에 card 객체가 생성됨
		Cash cash = new Cash(); //현금 객체를 인스턴스 화->메모리에 cash 객체가 생성됨
		
		pay = card; //부모는 자식의 모든 것을 받아준다
		pay.pay(50000);
		pay = cash; //부모는 자식의 모든 것을 받아준다
		pay.pay(50000);
		
		int price = 170000; //구입하려는 물건의 가격
		
		if(price >= 100000) {
			pay = card;
		} else {
			pay = cash;
		}
		
		pay.pay(price); //업 캐스팅
		
	}

}
