package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 학생 10 명의 점수 관리 프로그램
        int score [] = {79, 88, 91, 33, 100, 45, 55, 89, 25, 74};

        // 최고 점수 / 최저 점수 받은 학생 확인하고 싶음
        // 총합 / 평균
        int max = score[0];
        int min = score[0];
        int total = score[0];


        for (int i = 1; i < score.length; i++) {
            if(max < score[i])
            {
                max = score[i];
            }
            System.out.println(score[i]);
        }
        System.out.printf("최고 점수는 : %d\n", max);

        for (int i = 1; i < score.length; i++) {
            if(min > score[i])
            {
                min = score[i];
            }
            System.out.println(score[i]);
        }
        System.out.printf("최저 점수는 : %d\n", min);

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        System.out.printf("총합은 : %d\n", total);
        
        double avg = total / (double)score.length;
        System.out.printf("점수 평균 %2f\n", avg);
        

    }
    
}
