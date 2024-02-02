package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int numArr [] = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));

        // 무작위로 숫자의 위치 변경
        for (int i = 0; i < 100; i++) {
            // 0 ~ 9 임의의 숫자 추출
            int pos = (int) (Math.random() * 10); 
            int temp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
    
}
