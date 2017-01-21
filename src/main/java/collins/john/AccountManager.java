package collins.john;
//import static net.mindview.util.Print.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by johncollins on 1/17/17.
 */
public class AccountManager {


    int accountNumber = 0;

        //Account oneAccount = new Account;
        //oneAccount.getAccountNumber();
    //enum type {CHECKING, SAVING, IVESTMENT};
        ArrayList<Account> Bank = new ArrayList<Account>();
        //public Account currentBankAccount;


    public void OpenAccount() {

    //accountNumber;
    String type;
    Double balance;
    String name;
    Double rate;
    String status;
    boolean odp;
    String record;

        //ArrayList record = new ArrayList();

    Scanner scanInfo = new Scanner(System.in);

    System.out.println("enter account type: CHECK , SAVE , INVEST .");
    type = scanInfo.next();
        System.out.println(type);

    //System.out.println("enter account number");
    //String accountNumber = getNewAccountInfo.nextLine();
    accountNumber+=1;
        System.out.println("new account number: "+accountNumber);

    System.out.println("enter account balance");
    balance = scanInfo.nextDouble();
        System.out.println(Double.toString(balance));

    // Skip the newline
    scanInfo.nextLine();

    System.out.println("enter name");
    name = scanInfo.nextLine();
        System.out.println(name);

    System.out.println("enter account interest rate");
    rate = scanInfo.nextDouble();
        System.out.println(rate);

    // Skip the newline
    scanInfo.nextLine();

    System.out.println("enter account status: OPEN , CLOSED , OFAC .");
    status = scanInfo.nextLine();
        System.out.println(status);

    System.out.println("enter account overdraft protection status");
    odp = scanInfo.nextBoolean();
        System.out.println(Boolean.toString(odp));

    System.out.println("enter account record");
    record = scanInfo.next();
        System.out.println(record);

    //Account (accountNumber++) = new Account;

    //public void makeAccount:(){
    Account currentBankAccount = new Account(type,accountNumber,balance,name,rate,status,odp,record);
        System.out.println(currentBankAccount.getName()+Integer.toString(currentBankAccount.getAccountNumber()));
    Bank.add(currentBankAccount);
        System.out.println("account number test: "+accountNumber);
        ///Bank.get(0.getName());

    //Account bankAccount = new Account(type, accountNumber, balance, name, rate, status, odp, record);


    //System.out.println(bankAccount.getName());




return;

        }//end OpenAccount

public void viewAccountByNumber(){
    Scanner selectedAccountNumber = new Scanner(System.in);
    System.out.println("To view an account, enter the account number.");
    int g = selectedAccountNumber.nextInt();
    //return n;
    this.getAccount(g);
}//end select account number



 public void getAccount(int n){
        //Scanner askAccountNumber = new Scanner(System.in);
     //System.out.println("To view an account, enter the account number.");
     //int n = askAccountNumber.nextInt();
     for (Account i :Bank
          ) {
         //System.out.println(i.getAccountNumber());
         if (n == i.getAccountNumber()) {
            String viewAccountNumber = Integer.toString(i.getAccountNumber());
            String viewBalance = Double.toString(i.getBalance());
            String viewRate = Double.toString(i.getInterestRate());
            String viewODP = Boolean.toString(i.getOverdraftPrevention());
            String viewName = i.getName();
            String viewType = i.getType();
            String viewStatus = i.getStatus();
            String viewRecord = i.getRecord();
            System.out.println(viewAccountNumber+","+viewName+","+viewType+","+viewStatus+","+viewBalance+","+viewODP+","+viewRate+","+viewRecord);

         }
     }
 }//end ViewAccount


    public void viewAllAccounts(){
        for (int i = 0; i < Bank.size()+1; i++) {
            this.getAccount(i);
        }
    }// end View All Accounts







/*public void CloseAccount(int accountNumber){
    if(Account.getAccountNumber = accountNumber){
        String "closed" = bankAccount.setAccountStatus;
    }
    */
}




