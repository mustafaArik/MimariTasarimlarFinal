package cofr_ornek2;

public class KapidaOde implements OdemeYontemi {
	private OdemeYontemi sonrakiYontem; 
	@Override
	public boolean odemeIsleyici(OdemeYap odeme) {
		if (odeme.yontemSec.equals(Yontemler.KAPIDA_ODE))
		{
			System.out.println(" Ödeme Kapýda Yapýlacak");
			return true;
		}
		else
		{
			if(sonrakiYontem != null)
				sonrakiYontem.odemeIsleyici(odeme);
		}
		
		return false;
	}

	@Override
	public void sonrakiYontem(OdemeYontemi yontem) {
		this.sonrakiYontem = yontem;
		
	}
}
