package cofr_ornek2;

public class OdemeYontemiBulucu {
	
	public OdemeYontemi ilkOdemeYontemiBelirle;
	
	public void IlkOdemeYontemiBelirleyici(OdemeYontemi ilkYontem)
	{
		this.ilkOdemeYontemiBelirle = ilkYontem;
	}
	
	public void OdemeyiAl(OdemeYap odeme)
	{
		if (ilkOdemeYontemiBelirle != null)
			ilkOdemeYontemiBelirle.odemeIsleyici(odeme);
	}
}
