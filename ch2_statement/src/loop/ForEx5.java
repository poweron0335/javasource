package loop;

public class ForEx5 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        // ******
        for(int j = 1; j < 6; j++)
            {
                for(int i = 1; i <= j; i++)
                    {
                        System.out.print("*");
                    }
                System.out.println();
            }
        
    }
    
}
