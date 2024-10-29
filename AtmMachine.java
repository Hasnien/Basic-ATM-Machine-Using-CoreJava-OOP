package ATMMachine;

import java.sql.SQLOutput;
import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if (entered_pin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1.Check A/C Balance: ");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int choice_option = sc.nextInt();

        if (choice_option == 1){
            checkBalance();
        } else if (choice_option== 2) {
            withdrawMoney();
        } else if (choice_option==3) {
            depositMoney();
        } else if (choice_option == 4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice...");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Balance ");
        }
        else{
            Balance = Balance - amount ;
            System.out.println("Money Withdrawn Successfully!");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }

}


public class AtmMachine {
    public static void main(String[] args){

        ATM obj = new ATM();
        obj.checkpin();

    }
}
