package cofr;

public class EmailErrorHandler implements Receiver{
	private Receiver nextReceiver;

	@Override
	public boolean handleMessage(Message message) {
		
		if (message.text.contains("Eposta"))
		{
			System.out.println(" Eposta Hata Yakalayýcýsý Çalýþtý \n Öncelik:\t" +message.priority + "\t\t Konu: " + message.text + "\n----------");
			return true;
		}
		else
		{
			if(nextReceiver != null)
				nextReceiver.handleMessage(message);
		}
		
		return false;
	}

	@Override
	public void nextErrorHAndler(Receiver nextReceiver) {
		this.nextReceiver = nextReceiver;
		
	}	
}
