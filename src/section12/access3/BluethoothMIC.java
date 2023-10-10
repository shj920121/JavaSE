package section12.access3;

public interface BluethoothMIC extends Microphone, Speaker { // 인터페이스간 상속시에는 extends

	public abstract void connect();
	
}
