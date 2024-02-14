package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private Customer customers[] = new Customer[5];
    private Product products[] = new Product[5];
    private String title;
    private int customerNo;
    // 장바구니
    private Product carts[] = new Product[5]; // CellPhone과 SmartTv 둘다 담아야 하기 때문에

    Scanner sc = new Scanner(System.in);

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 고객 생성
        Customer customer = new Customer();
        customer.setName("홍길동");
        customer.setPayType(PayType.CARD);
        customers[0] = customer;
        customer = new Customer();
        customer.setName("이춘향");
        customer.setPayType(PayType.CARD);
        customers[1] = customer;
        customer = new Customer();
        customer.setName("김철수");
        customer.setPayType(PayType.CASH);
        customers[2] = customer;
        customer = new Customer();
        customer.setName("김길동");
        customer.setPayType(PayType.CASH);
        customers[3] = customer;
        customer = new Customer();
        customer.setName("김수지");
        customer.setPayType(PayType.CARD);
        customers[4] = customer;
    }

    @Override
    public void genProduct() {
        // 제품 생성
        CellPhone phone = new CellPhone("갤럭시노트", 1000000, "U+");
        products[0] = phone;
        phone = new CellPhone("갤럭시23", 1000000, "SKT");
        products[1] = phone;
        phone = new CellPhone("갤럭시24", 2000000, "KT");
        products[2] = phone;
        SmartTV tv = new SmartTV("삼성티비", 3000000, "8K");
        products[3] = tv;
        tv = new SmartTV("엘지티비", 2000000, "4K");
        products[4] = tv;
    }

    @Override
    public void start() {
        System.out.println(title + " : " + " 메인화면 " + " 계정선택");
        System.out.println("==========================================");

        for (int i = 0; i < customers.length; i++) {
            System.out.printf("[%d] %s(%s)\n", i, customers[i].getName(), customers[i].getPayType());
        }
        System.out.println("[x] 종료");

        // 사용자로에게 고객번호 입력받기
        System.out.println("고객 번호 입력하십시오 : ");
        String cNo = sc.nextLine();
        System.out.println("\n### " + cNo + " 고객 선택 ###");

        customerNo = Integer.parseInt(cNo);

        if (cNo.equals("x")) {
            System.exit(0); // 프로그램 강제종료
        } else { // 0~4이 들어오면
            productList();
        }
    }

    public void productList() {
        // 상품 목록 출력
        System.out.println("\n");
        System.out.println(title + " : " + " 상품목록 " + " 상품선택 ");
        System.out.println("============================");

        for (int i = 0; i < products.length; i++) {
            System.out.printf("[%d]", i);
            products[i].printDetail();
        }
        System.out.println("[h] 메인 화면");
        System.out.println("[c] 체크 아웃");

        System.out.println("상품 번호 입력하십시오 : ");
        String menu = sc.nextLine();

        switch (menu) {
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;
            default: // 0 ~ 4에 해당하는 제품을 장바구니에 추가
                for (int i = 0; i < carts.length; i++) {
                    if (carts[i] == null) {
                        carts[i] = products[Integer.parseInt(menu)];
                        break;
                    }
                }
                productList();
        }

    }

    public void checkOut() {
        int i = 0, total = 0;
        System.out.println(title + " : " + "체크아웃");
        System.out.println("========================");

        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s %d\n", i, product.getPname(), product.getPrice());
            }
            total += product.getPrice();
        }
        System.out.println("========================");
        System.out.println("합계 : " + total);
        System.out.println("결제방법 : " + customers[customerNo].getPayType());
        System.out.println("[p] 이전");
        System.out.println("[q] 결제");
        String menu = sc.nextLine();

        switch (menu) {
            case "p":
                productList();
                break;
            case "q":
                System.out.println("결제가 완료 되었습니다. 종료합니다.");
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
