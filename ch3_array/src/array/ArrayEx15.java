package array;

public class ArrayEx15 {
    public static void main(String[] args) {
        int [][] score = {
            {100, 95, 98},
            {20,20,18},
            {30,30,38},
            {40,55,45},
            {50,48,67}
        };

        // 학생들의 점수 총점과 평균 출력
        // 번호  국어  영어  수학  총점  평균
        //  1    100   95    98   
        
        int korTotal = 0;
        int engTotal = 0;
        int mathTotal = 0;



    
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d\t", (i+1));

            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
                sum += score[i][j];
                avg /= score[i][j];
            }
            avg = sum / (float)score[i].length;
            System.out.printf("%5d  %5.1f\n", sum, avg);
            }
            System.out.println("====================================");
            System.out.printf("\t총점 %3d %4d %4d", korTotal, engTotal, mathTotal);
        }
    }
    