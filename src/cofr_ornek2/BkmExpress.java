package cofr_ornek2;

public class BkmExpress implements OdemeYontemi {
	private OdemeYontemi sonrakiYontem; 
	@Override
	public boolean odemeIsleyici(OdemeYap odeme) {
		if (odeme.yontemSec.equals(Yontemler.BKM_EXPRESS))
		{
			System.out.println(odeme.ucret + " TL - BkmExpress �zerinden �deme ��lemi Al�nd�");
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
