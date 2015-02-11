package mypack;

import javax.ejb.*;
import javax.jms.*;
import java.sql.*;

@MessageDriven(name="myMdb",
		activationConfig={
	@ActivationConfigProperty(
	propertyName="connectionFactoryJndiName",
		propertyValue="myQueueFactory"),
	@ActivationConfigProperty(
		propertyName="destinationType",
		propertyValue="javax.jms.Queue"),
	@ActivationConfigProperty(
	    propertyName="destinationName",
		propertyValue="myQueue")},
		mappedName="myQueue")
public class MessageSaverBean implements 
MessageListener {

	public void onMessage(Message msg) {
		
		try{
			TextMessage m=(TextMessage)msg;
			saveMessage(m.getText());
			
		}catch(Exception ex)
		{
			System.out.println(ex);
			
		}
	}
	private void saveMessage(String msg)
	{
	try
	{
Class.forName("oracle.jdbc.driver.OracleDriver");
java.sql.Connection con=
	DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:1521:xe",
	"system","oracle");
		PreparedStatement stmt=
		con.prepareStatement(
"insert into messageInfo (message) values(?)");
		stmt.setString(1,msg);
		stmt.executeUpdate();
		con.close();
	}catch(Exception ex)
	{
		System.out.println(ex);
		
	}
	}
}
