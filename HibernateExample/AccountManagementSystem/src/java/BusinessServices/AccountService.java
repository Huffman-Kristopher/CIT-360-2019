/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessServices;
import org.hibernate.Transaction;
import org.hibernate.Session;
import Model.TblAccount;
import Util.NewHibernateUtil;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;
import org.hibernate.Query;
/**
 *
 * @author Kristopher Huffman
 */
public class AccountService {
 
    public String addAccount(TblAccount acc)
    {
         String message=null;
        Session s=null;
        try
        {
            s=NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr=s.getTransaction();
           tr.begin();
          s.save(acc);
          tr.commit();
                message="Saved Data";  
           return message; 
        }
        catch (Exception e)
        {
            return (e.getMessage());
        }
        finally 
                {
                    s.close();
                }
 
 
    }
    public TblAccount searchAccount(String pi_Id)
    {
          String message=null;
        Session session=null;
       Transaction tx = null;
	 TblAccount account = null;
	 try {
                 session=NewHibernateUtil.getSessionFactory().openSession();
		 tx = session.getTransaction();
		 tx.begin();
		 Query query = session.createQuery("from TblAccount where accountId='"+pi_Id+"'");
		 account = (TblAccount)query.uniqueResult();
		 tx.commit();
	 } catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }
	 return account;
    }
}
