import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by BennettIronYard on 10/8/15.
 */
public class ATM {
    public static void run()
            throws Exception {
        HashMap<String, Double> accounts = new HashMap();
        while (true) {
            System.out.println("Enter Your Name");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals(""))
                throw new Exception("Name Invalid");

            if (!accounts.containsKey(name)) {
                accounts.put("name ", 100.0);
            }

            System.out.println("Welcome," + name);

            System.out.println("What would you like to do," + name);
            System.out.println("[1.] Check my balance");
            System.out.println("[2.] Withdraw Funds");
            System.out.println("[3.] Cancel");
            System.out.println("[4.] Remove your bank account");

            double balance = accounts.get(name);

            String task = scanner.nextLine();
            int taskNum = Integer.valueOf(task);
            if (taskNum == 1) {
                System.out.println("Balance");
            } else if (taskNum == 2) {
                System.out.println("How much would you like to withdraw?");
                String withdraw = scanner.nextLine();
                int withdrawNum = Integer.valueOf(withdraw);
                if (withdrawNum > balance)
                    throw new Exception("Over your Limit");
                else
                    System.out.println("Please take your cash " + name);
            } else if (taskNum == 3) {
                System.out.println("Thank you and please come again.");
                System.exit(0);
            } else {
                throw new Exception("Select a Task");
            }

        }
    }

}