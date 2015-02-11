package mypack;

import java.util.Scanner;
import javax.jms.*;
import javax.naming.*;

public class QSender {

public static void main(String[] args) {
	try
	{
InitialContext ctx=new InitialContext();
QueueConnectionFactory f=
(QueueConnectionFactory) ctx.lookup(
		"myQueueFactory");
QueueConnection con=
	f.createQueueConnection();
	con.start();
QueueSession session=con.createQueueSession(
		false, Session.AUTO_ACKNOWLEDGE);
Queue q=(Queue)ctx.lookup("myQueue");
QueueSender sender=session.createSender(q);
TextMessage msg=session.createTextMessage();
Scanner in=new Scanner(System.in);
System.out.println("Enter message:");
String str=in.nextLine();
msg.setText(str);
sender.send(msg);
System.out.println("Message sent.");
con.close();
		}catch(Exception ex)
		{
			System.out.println(ex);
			
		}
	}

}
