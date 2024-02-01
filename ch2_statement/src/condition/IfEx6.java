package condition;

// Math.random() : 0.0 <= Math.random() < 1.0 이다.

public class IfEx6 {

    public static void main(String[] args) {
        // System.out.println((int) (Math.random() * 6) + 1); // 0 ~ 5 => 1 ~ 6
        int dice = (int) (Math.random() * 6) + 1;

        // 주사위 1 번 나옴

        if(dice == 1)
        {
            System.out.printf("주사위 %d 나옴\n", dice);
        }
        else if(dice == 2)
        {
            System.out.printf("주사위 %d 나옴\n", dice);
        }
        else if(dice == 3)
        {
            System.out.printf("주사위 %d 나옴\n", dice);
        }
        else if(dice == 4)
        {
            System.out.printf("주사위 %d 나옴\n", dice);
        }
        else if(dice == 5)
        {
            System.out.printf("주사위 %d 나옴\n", dice);
        }
        else
        {
            System.out.printf("주사위 %d 나옴\n", dice);
        }
    }
    
}
