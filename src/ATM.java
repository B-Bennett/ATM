import java.util.Scanner;

/**
 * Created by BennettIronYard on 10/8/15.
 */
public class ATM {
    public static void run()
            throws Exception {
        System.out.println("Enter Your Name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals(""))
            throw new Exception("Name Invalid");

        System.out.println("Welcome," + name);

        System.out.println("What would you like to do," + name);
        System.out.println("[1.] Check my balance");
        System.out.println("[2.] Withdraw Funds");
        System.out.println("[3.] Cancel");

        String task = scanner.nextLine();
        int taskNum = Integer.valueOf(task);
        if (taskNum == 1) {
            System.out.println("100");
        }else if (taskNum == 2) {
            System.out.println("How much would you like to withdraw?");
            String withdraw = scanner.nextLine();
            int withdrawNum = Integer.valueOf(withdraw);
            if (withdrawNum > 100)
                throw new Exception("Over your Limit");
            else
                System.out.println("Please take your cash");
        }else if (taskNum == 3) {
            System.out.println("Thank you and please come again.");
        }else {
            throw new Exception("Select a Task");
        }

    }


}