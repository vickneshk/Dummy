package test.fillo;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fillo fillo = new Fillo ();
        Connection  connection = null;
        try {
			connection = fillo.getConnection("D:\\JNJ\\Validation\\Monitoring.xlsx");
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String strQuery="Insert into  Inbound_icsr(Sender,Receiver) Values('FDA','JNJ')";
        try {
			connection.executeUpdate(strQuery);
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        connection.close();
    }
}
