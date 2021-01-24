package cofr;

public class FaxErrorHandler implements Receiver{
	private Receiver nextReceiver;
	@Override
	public void nextErrorHAndler(Receiver nextReceiver)
	{
		this.nextReceiver = nextReceiver;
	}
	
	@Override
	public boolean handleMessage(Message message)
	{
		if (message.text.contains("Faks"))
		{
			System.out.println(" Faks Hata Yakalayýcýsý Çalýþtý \n Öncelik:\t" +message.priority + "\t\t Konu: " + message.text + "\n----------");
			return true;
		}
		else
		{
			if(nextReceiver != null)
				nextReceiver.handleMessage(message);
		}
		
		return false;
	}

}
