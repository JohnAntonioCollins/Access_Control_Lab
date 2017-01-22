package collins.john;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

/**
 * Created by johncollins on 1/22/17.
 */
public class Tests {

    @Test
    public void testMethod1(){

        AccountManager testAccountManager = new AccountManager();
        ArrayList<Account> Bank = new ArrayList<Account>();
        for(int i = 0; i < 10; i++){
            Account testBankAccount = new Account();
            Bank.add(testBankAccount);
        }

        Assert.assertEquals(Bank.get(4), testAccountManager.getAccount(4));


    }
}
