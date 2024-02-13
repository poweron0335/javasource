package poly;

public class BuyerEx {
    public static void main(String[] args) {
        // 물건(Product, Tv, Computer) 구매
        Buyer buyer = new Buyer();

        // tv 구매
        buyer.buy(new Tv(300));
        // computer 구매
        buyer.buy(new Computer(200));

        System.out.println("현재 남은 금액 " + buyer.money);
        System.out.println("현재 보너스 포인트는 " + buyer.bonusPoint);

    }

}
