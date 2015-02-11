package mypack;

import java.util.Scanner;

import javax.jms.*;
import javax.naming.InitialContext;

public class TopicSender {
	public static void main(String[] args) {
		try
		{
	InitialContext ctx=new InitialContext();
	TopicConnectionFactory f=
	(TopicConnectionFactory) ctx.lookup(
			"myTopicFactory");
	TopicConnection con=
		f.createTopicConnection();
		con.start();
	TopicSession session=con.createTopicSession(
			false, Session.AUTO_ACKNOWLEDGE);
	Topic t=(Topic)ctx.lookup("myTopic");
	TopicPublisher publisher=session.createPublisher(t);
	TextMessage msg=session.createTextMessage();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter message:");
	String str=in.nextLine();
	msg.setText(str);
    publisher.publish(msg);
	System.out.println("Message sent.");
	con.close();
			}catch(Exception ex)
			{
				System.out.println(ex);
				
			}
		}

}
