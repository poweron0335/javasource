package loop;

public class ForEx6 {
    public static void main(String[] args) {
        // 1~100 까지 숫자 중에서 3의 배수만 더하기
        int sum = 0;
        for(int i = 1; i < 101; i++)
        {
            if(i % 3 == 0)
            {
              sum += i;
            }
        }
        System.out.println("3의 배수의 합계는 " + sum);
        for (int i = 1; i < 101; i+=3)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    
    
}
