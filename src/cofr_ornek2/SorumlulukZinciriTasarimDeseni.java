package cofr_ornek2;

public class SorumlulukZinciriTasarimDeseni {

	public static void main(String[] args) {
		System.out.println("*** �deme y�nteminin hangisi oldu�unu SORUMLULUK Z�NC�R� ile bulal�m. ***");
		
		OdemeYontemi krediKartiylaOde = new KrediKarti();
		OdemeYontemi bankaKartiylaOde = new BankaKarti();
		OdemeYontemi bkmExpressleOde = new BkmExpress();
		OdemeYontemi kapidaOde = new KapidaOde();
		
		OdemeYontemiBulucu odemeYontemiBul = new OdemeYontemiBulucu();
		
		// Sorumluluk zinciri halkalar� burada birbirine ba�lan�yor
		// �stenirse s�ra de�i�tirilebilir. 
		odemeYontemiBul.IlkOdemeYontemiBelirleyici(krediKartiylaOde);
		krediKartiylaOde.sonrakiYontem(bankaKartiylaOde);
		bankaKartiylaOde.sonrakiYontem(bkmExpressleOde);
		bkmExpressleOde.sonrakiYontem(kapidaOde);
		kapidaOde.sonrakiYontem(null);
		
		
		OdemeYap odeme1 = new OdemeYap(17.50, Yontemler.KAPIDA_ODE);
		OdemeYap odeme2 = new OdemeYap(25.90, Yontemler.BKM_EXPRESS);
		OdemeYap odeme3 = new OdemeYap(88.00, Yontemler.BANKA_KARTI);
		OdemeYap odeme4 = new OdemeYap(124.75, Yontemler.KREDI_KARTI);
		
		odemeYontemiBul.OdemeyiAl(odeme1);
		odemeYontemiBul.OdemeyiAl(odeme2);
		odemeYontemiBul.OdemeyiAl(odeme3);
		odemeYontemiBul.OdemeyiAl(odeme4);
		
		

	}

}
