package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 배열명 arr 선언, 생성 숫자 1, 2, 3, 4, 5를 담아라
        int arr [] = {1, 2, 3, 4, 5};

        // 기존 배열의 arr 크기의 2배를 가지는 새로운 배열 생성
        int tem[] = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tem[i] = arr[i];
        }
        
        int tem2[] = new int[arr.length * 2];
        System.arraycopy(arr, 0, tem2, 5, arr.length);
        System.out.println(Arrays.toString(tem2));
        
    }
    
}
