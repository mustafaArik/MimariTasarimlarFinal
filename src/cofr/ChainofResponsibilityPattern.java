package cofr;

public class ChainofResponsibilityPattern {

	public static void main(String[] args) {
		System.out.println("\n *** Chain of Responsibility Pattern DEMO ***\n");
		
		/* Zincir tan�mlan�yor as IssueRaiser -> FaxErrorhandler -> EmailErrorHAndler*/		
		Receiver faxHandler, emailHandler;
		
		// Zincirin halkalar�n� olu�turan nesneler.		
		IssueRaiser issueRaiser = new IssueRaiser();
		faxHandler = new FaxErrorHandler();
		emailHandler = new EmailErrorHandler();
		
		// Zirnir olu�turuluy�r.
		// ��lem ba�l�yor, issueRaiser nesnesi zincirin ilk halkas�n�n hangisi oldu�unu belirtiyor.
		
		issueRaiser.setFirstErrorHandler(faxHandler);
		 
		// �lk halkadan sonraki ikinci halka belirtiliyor.
		faxHandler.nextErrorHAndler(emailHandler);
		
		// Zincirin son halkas� olu�turuluyor, sonraki halka yok (null)
		emailHandler.nextErrorHAndler(null);
		
		Message m1 = new Message("Faks yavas gidiyor.", MessagePriority.NORMAL);
		Message m2 = new Message("Epostalar ulasmiyor.", MessagePriority.HIGH);
		Message m3 = new Message("Epostada, CC alani her zaman kapali.", MessagePriority.NORMAL);
		Message m4 = new Message("Faks hedefe ulasmiyor.", MessagePriority.HIGH);
		
		issueRaiser.raiseMessage(m1);
		issueRaiser.raiseMessage(m2);
		issueRaiser.raiseMessage(m3);
		issueRaiser.raiseMessage(m4);
		
	}
}
