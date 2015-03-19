package controllers.ejb;

import javax.inject.Inject;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

public class Transactions {
    @Inject UserTransaction ut;
    
    public void m(){
        try {
            ut.begin();
            //...
            try {
                ut.commit();
            } catch (SecurityException | IllegalStateException | RollbackException
                    | HeuristicMixedException | HeuristicRollbackException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (NotSupportedException | SystemException e) {
            try {
                ut.rollback();
            } catch (IllegalStateException | SecurityException | SystemException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
