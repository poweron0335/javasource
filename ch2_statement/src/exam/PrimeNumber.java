package exam;

public class PrimeNumber {
    public static void main(String[] args) {
        // 1~100 숫자 중에서 소수 찾아서 출력, 소수의 개수 출력
        // 소수 : 1보다 큰 자연수 중에서


   

        int count = 0, total = 0;
        for(int i = 2; i <= 100; i++)        // i가 2부터 100까지 증가하면서 반복
        {
            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0) 
                {
                // 나누어 떨어지는 숫자 개수
                    count++;
                } 
                // j가 1부터 i까지 증가하면서 i 가 j 로 나누어 떨어지는 걸 
                // 확인하고 떨어지면 count++
            }
            if(count == 2) // count가 2인 경우 해당 숫자는 소수이다
            {
                System.out.print(i + "\t");
                total++;
            }
            count = 0;  // count를 0으로 초기화 하고 다음 숫자로 진행
        }
        System.out.println();
        System.out.println("1~100사이의 소수의 개수는 " + total);
    }
    
}
