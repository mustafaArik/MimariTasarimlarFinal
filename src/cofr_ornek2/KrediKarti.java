package cofr_ornek2;

public class KrediKarti implements OdemeYontemi {
	private OdemeYontemi sonrakiYontem; 
	@Override
	public boolean odemeIsleyici(OdemeYap odeme) {
		if (odeme.yontemSec.equals(Yontemler.KREDI_KARTI))
		{
			System.out.println(odeme.ucret + " TL - Kredi Kartýyla Ödeme Ýþlemi Alýndý");
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
