package section12.access2;

public class HouseCat implements Cat, Playable {

	@Override
	public void eat() {
		System.out.println("경계하며 먹어요.");
	}
	@Override
	public void sleep() {
		System.out.println("밤에 잠을 안자요!");
	}
	@Override
	public void hunt() {
		System.out.println("쥐를 사냥해요, 집사에게 선물해요!");
	}
	@Override
	public void play() {
		System.out.println("쥐를 가지고 놀아요~");
		
	}

}
