package exam;

public class GoodsStock {
    // 속성 - 상품코드(p1011), 재고수량(300)

    private String goodsCode;
    private String stockNum;

    // 생성자
    public GoodsStock() {
        // default 생성자
    }
    public GoodsStock(String goodsCode, String stockNum)
    {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }
    @Override
    public String toString() {
        return "GoodsStock [goodsCode=" + goodsCode + ", stockNum=" + stockNum + "]";
    }
    
}

