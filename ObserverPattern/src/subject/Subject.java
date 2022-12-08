package subject;

import message.Message;
import observer.Observer;

public interface Subject {
	void attach(Observer o);
	void detach(Observer o);
	void notifyUpdate(Message m);
}
