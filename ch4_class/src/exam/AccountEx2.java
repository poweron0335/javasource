package exam;

import java.util.Scanner;

public class AccountEx2 {
    public static void main(String[] args) {
        Account accountEx[] = new Account[3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < accountEx.length; i++) {
            accountEx[i] = new Account();
            System.out.println("Input Account : ");
            String accountNo = sc.nextLine();
            System.out.println("Input Name");
            String owner = sc.nextLine();
            System.out.println("Input money :");
            int balance = Integer.parseInt(sc.nextLine());


            accountEx[i] = new Account(accountNo, owner, balance);
        }

        for (Account account : accountEx) {    
            System.out.println(account.toString());
        }
    }    

}
