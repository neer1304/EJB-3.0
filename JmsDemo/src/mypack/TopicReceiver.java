package mypack;

import javax.jms.*;
import javax.naming.InitialContext;

public class TopicReceiver {
	public static void main(String[] args) 
	{
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
TopicSubscriber subscriber=
	session.createSubscriber(t);
	subscriber.setMessageListener(
			new MyListener());
System.out.println(
 "Receiver is waiting for messages...");
		}catch(Exception ex)
			{
				System.out.println(ex);
				
			}
		}
}
