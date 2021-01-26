package cofr_ornek2;

public class BankaKarti implements OdemeYontemi {
	private OdemeYontemi sonrakiYontem; 
	@Override
	public boolean odemeIsleyici(OdemeYap odeme) {
		if (odeme.yontemSec.equals(Yontemler.BANKA_KARTI))
		{
			System.out.println(odeme.ucret + " TL - BANKA Kart�yla (DEBIT CARD) �deme ��lemi AL�nd�");
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
