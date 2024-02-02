package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        int score[] = new int[5]; // 길이가 5인 int 배열(인덱스는 0부터 시작한다.) + 초기값은 0이다.

        // 배열의 초기값 변경
        score[0] = 98;
        score[1] = 88;
        score[2] = 78;
        score[3] = 68;
        score[4] = 58;

        // 배열 값 확인
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println(score.length);

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        System.out.println();

        for (int i : score) {
            System.out.println(i);
        }
        
    }
    
}
