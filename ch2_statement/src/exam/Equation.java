package exam;

public class Equation {
    public static void main(String[] args) {
        // 이중 for 문, if 문
        // 4 x + 5y = 60 모든 해 구하기
        // 단, x,y 10 이하의 자연수

        
        for(int x = 1; x <= 10; x++)
        {
            for(int y = 1; y <= 10; y++)
            {
                if(4 * x + 5 * y == 60)
                {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
    
}
