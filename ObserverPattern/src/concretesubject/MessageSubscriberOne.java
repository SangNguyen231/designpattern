package concretesubject;

import message.Message;
import observer.Observer;

public class MessageSubscriberOne implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
