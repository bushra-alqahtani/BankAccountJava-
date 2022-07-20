public class BankAccount {
  //The class should have the following attributes: (double) checking balance, (double) savings balance.
  //Create a class member (static) that has the number of accounts created thus far
  //Create a class member (static) that tracks the total amount of money stored in every account created.
    private double checking_balance;
    private double savings_balance;
    private static int number_of_accounts = 0;
    private static double total_amount_of_money;

   

//In the constructor, be sure to increment the account count.
    public BankAccount(){
        number_of_accounts++;
    }
//Create a getter method for the user's checking account balance.

    public void setChecking_balance(double checking_balance) {
        this.checking_balance = checking_balance;
 
    }
    public double getChecking_balance() {
        return checking_balance;
    }

    
//Create a getter method for the user's saving account balance.
    public void setSavings_balance(double savings_balance) {
        this.savings_balance = savings_balance;
    }


    public double getSavings_balance() {
        return savings_balance;
    }
//Create a method that will allow a user to deposit money into either
// the checking or saving, be sure to add to total amount stored.
    public void deposit(String account_name,double amount){
        if(account_name.equalsIgnoreCase("checking")){ //ignoring lower case and upper case differences.
            checking_balance += amount;
            display();
        }else if(account_name.equalsIgnoreCase("savings")){
            savings_balance += amount;
            display();
        }
    }
//Create a method to withdraw money from one balance. 
//Do not allow them to withdraw money if there are insufficient funds.
//NINJA BONUS: Add the the following class attribute: account number. The type is up to you, can be a String or a Long or another type.
    public void withdraw(String account_name,double amount){
        if(account_name.equalsIgnoreCase("checking") && checking_balance >= amount){
            checking_balance -= amount;
            display();
        }else if(account_name.equalsIgnoreCase("savings") && savings_balance >= amount){
            savings_balance -= amount;
            display();
        }else{
            System.out.println(" there are insufficient funds !");
            display();
        }
    }
//Create a method to see the total money from the checking and saving.
    public void totalMoney(){
        System.out.printf("Your total Mony are %f \n",checking_balance+savings_balance);
    } 
    public static double getTotal_amount_of_money(){
        return total_amount_of_money;
    }




    public static int getNumber_of_accounts(){
        return number_of_accounts;
    }

    public void display(){
        System.out.printf("Your Checking Account Balance is : %f\n",checking_balance);
        System.out.printf("Your Savings Account Balance is : %f\n",savings_balance);
    }

}

