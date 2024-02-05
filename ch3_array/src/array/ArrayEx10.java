package array;

import java.util.Arrays;

// 알고리즘 - 정렬
//           선택정렬, 버블정렬, 힙정렬...etc.
// 핵심 포인트는 "큰 값이 뒤로 이동한다."
public class ArrayEx10 {
    public static void main(String[] args) {
        int arr[] = {25, 85, 55, 65, 5, 3};
        
        // 자바가 제공하는 sort 방법
        Arrays.sort(arr);

        // 직접 알고리즘 풀어보기
        // int temp = 0;
        // for (int i = 0; i < arr.length; i++) {  // i는 현재 정렬할 범위 시작 인덱스
        //                                         // i가 증가함에 따라 정렬된 부분이 늘어난다.
        //     for (int j = 0; j < arr.length; j++) {    // j는 현재 비교할 요소의 인덱스
        //                                               // j가 증가함에 따라 정렬 범위 내에서 모든 요소를 비교한다.
        //         if(arr[i] < arr[j])   // arr[i]가 arr[j]보다 작으면 두 요소의 위치를 교환
        //         {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        System.out.println(Arrays.toString(arr));
        }




    }
    

