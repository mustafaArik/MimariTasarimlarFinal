package cofr;

public interface Receiver {
	boolean handleMessage(Message message);
	void nextErrorHAndler(Receiver nextReceiver);
}
