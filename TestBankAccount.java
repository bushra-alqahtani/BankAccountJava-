public class TestBankAccount{

public static void main ( String[] args){



        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setSavings_balance(14000);
        account1.display();
        account1.totalMoney();
        account1.deposit("savings",700);
        System.out.println("Total Bank Accounts: " + BankAccount.getNumber_of_accounts());

        System.out.println("_________________________________");

        account2.setChecking_balance(500);
        account2.setSavings_balance(1277);
        account2.display();
        account2.withdraw("Savings",100);
        System.out.println("Total Money in Bank Accounts: " + BankAccount.getTotal_amount_of_money());
    }
}