package cofr_ornek2;

public class OdemeYontemiBulucu {
	
	public OdemeYontemi ilkOdemeYontemi;
	
	public void IlkOdemeYontemiBelirleyici(OdemeYontemi ilkYontem)
	{
		this.ilkOdemeYontemi = ilkYontem;
	}
	
	public void OdemeyiAl(OdemeYap odeme)
	{
		if (ilkOdemeYontemi != null)
			ilkOdemeYontemi.odemeIsleyici(odeme);
	}
}
