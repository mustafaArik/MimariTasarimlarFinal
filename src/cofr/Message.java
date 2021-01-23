package cofr;

public class Message {
	public String text;
	public MessagePriority priority;
	
	public Message(String msg, MessagePriority p)
	{
		// Constructor
		text = msg;
		this.priority = p;
	}
}
