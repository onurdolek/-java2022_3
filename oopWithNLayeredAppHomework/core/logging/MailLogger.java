package oopWithNLayeredAppHomework.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Mail ile loglandı " + data);
	}

}
