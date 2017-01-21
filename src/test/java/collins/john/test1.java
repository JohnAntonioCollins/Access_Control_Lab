package collins.john;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by johncollins on 1/20/17.
 */

public class test1 {
            ArrayList<Account> TestBank = new ArrayList<Account>();

            /*for(int i = 0; i < 100; i++)

            {
                Account testAccount = new Account();
             TestBank.add(testAccount);
            }

            int n;

            for(int k = 0; k < 100; k++){
                int n = k;}
*/
 int n = 56;
    @Test
    public void getAccountTest(){
        for (Account i :TestBank
                ) {
            if (n == i.getAccountNumber()) {
                String viewAccountNumber = Integer.toString(i.getAccountNumber());
                String viewBalance = Double.toString(i.getBalance());
                String viewRate = Double.toString(i.getInterestRate());
                String viewODP = Boolean.toString(i.getOverdraftPrevention());
                String viewName = i.getName();
                String viewType = i.getType();
                String viewStatus = i.getStatus();
                String viewRecord = i.getRecord();
                //System.out.println(viewAccountNumber+","+viewName+","+viewType+","+viewStatus+","+viewBalance+","+viewODP+","+viewRate+","+viewRecord);

            }
        }
    }//end ViewAccount Test
}


