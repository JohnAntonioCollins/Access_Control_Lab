package collins.john;

/**
 * Created by johncollins on 1/17/17.
 */
public class Account {

    private String type;
    private int accountNumber;
    private Double balance;
    private String name;
    private Double rate;
    private String status;
    private boolean odp;
    //private ArrayList record;
    private String record;


    public Account(String type, int accountNumber, Double balance, String name, Double rate, String status, boolean odp, String record) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.name = name;
        this.rate = rate;
        this.status = status;
        this.odp = odp;
        this.record = record;
        this.balance = balance;


    }//end of public Account first constructor

    public Account(){
        this.accountNumber = accountNumber;
    }// end of public Account second connstructor, for testing purposes.


    //Setters

    //private void setAccountType(final String type) {this.type = type;}

    //private void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setInterestRate(Double rate) {
        this.rate = rate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOverdraftPrevention(boolean odp) {
        this.odp = odp;
    }

    public void setRecord(String record) {
        this.record = record;
    }


    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getType() {return type;}

    public Double getBalance() {

        if(this.type != "ofac"){
            return balance;
        }
        else{return 9999999.9999999;}
    }

    public String getName() {return name;}

    public Double getInterestRate() {return rate;}

    public String getStatus() {
        return status;
    }

    public boolean getOverdraftPrevention() {
        return odp;
    }

    public String getRecord() {
        return record;
    }

    public String viewAccount(){

        String viewAccountNumber = Integer.toString(this.getAccountNumber());
        String viewBalance = Double.toString(this.getBalance());
        String viewRate = Double.toString(this.getInterestRate());
        String viewODP = Boolean.toString(this.getOverdraftPrevention());
        String viewName = this.getName();
        String viewType = this.getType();
        String viewStatus = this.getStatus();
        String viewRecord = this.getRecord();
        return viewAccountNumber+","+viewName+","+viewType+","+viewStatus+","+viewBalance+","+viewODP+","+viewRate+","+viewRecord;
    }// end of ViewAccount


}


