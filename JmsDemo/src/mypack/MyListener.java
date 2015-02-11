package mypack;

import javax.jms.*;
public class MyListener implements 
MessageListener {

	public void onMessage(Message msg) {
		try{
		TextMessage m=(TextMessage)msg;
	System.out.println(
	"Following message is received: "
			+m.getText());
			
		}catch(Exception ex)
		{
			System.out.println(ex);
			
		}

	}

}
