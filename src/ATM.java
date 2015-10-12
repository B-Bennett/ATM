import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by BennettIronYard on 10/8/15.
 */
public class ATM {
    public static void main(String [] args)
            throws Exception {
        HashMap<String, Double> accounts = new HashMap();
        while (true) {
            System.out.println("Enter Your Name");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals(""))
                throw new Exception("Name Invalid");

            if (!accounts.containsKey(name)) {
                System.out.println("Account not found");
                System.out.println("Would you like to create an account? [y] Yes[n] No");
                String selection = scanner.nextLine();
                if (selection.equals("y")) {
                    accounts.put(name, 100.0);
                } else if (selection.equals("n")) {
                    System.out.println("Account not created, thank you.");
                    System.exit(0);
                }

            }

            System.out.println("Welcome," + name);

            double balance = accounts.get(name);

            System.out.println("What would you like to do," + name);
            System.out.println("[1.] Check my balance");
            System.out.println("[2.] Withdraw Funds");
            System.out.println("[3.] Cancel");
            System.out.println("[4.] Remove your bank account");


            String task = scanner.nextLine();
            int taskNum = Integer.valueOf(task);
            if (taskNum == 1) {
                System.out.println(balance);
            } else if (taskNum == 2) {
                System.out.println("Withdraw How Much?");
                String withdraw = scanner.nextLine();
                int withdrawNum = Integer.valueOf(withdraw);
                accounts.replace(name, balance, balance - (double) withdrawNum);

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