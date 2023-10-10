package section12;

import section12.access3.BluethoothMIC;
import section12.access3.Microphone;
import section12.access3.Speaker;
import section12.access3.TJmic;

public class InterfaceClass02 {
	public static void main(String[] args) {
		System.out.println("---TJmic 객체---");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		//이렇게 형변환 가능
		System.out.println("---BluethoothMIC로 타입변환---");
		BluethoothMIC bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		
		System.out.println("---Microphone으로 타입변환---");
		Microphone mic = tj;
//		mic.connect(); // 에러
//		mic.music();   // 에러
		mic.sing();
		
		System.out.println("---Speaker로 타입변환---");
		Speaker sp = tj;
//		sp.connect();
		sp.music();
//		sp.sing();
		
		
		
	}
}
