package ex;

import java.util.Scanner;

public class TVMain {
	public static void main(String[] args) {
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		
		tv.powerOnOff();
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.muteOnOff();
		tv.muteOnOff();
		tv.muteOnOff();
		tv.muteOnOff();
		for(int i=0; i<15; i++) {
			tv.volumeDown();
		}
		
		while(true) {
			//메뉴 출력
			System.out.println("1. TV 전원 ON/OFF");
			System.out.println("2. 채널 UP");
			System.out.println("3. 채널 DOWN");
			System.out.println("4. 음량 UP");
			System.out.println("5. 음량 DOWN");
			System.out.println("6. 음소거 ON/OFF");
			System.out.println("7. 타이머 설정");
			System.out.println("0. 프로그램 설정");
			System.out.println("원하시는 번호를 입력하세요 : ");
			
			int no = sc.nextInt();
			if (no == 0) break;
			tv.remote(no);
		
		
		
		
		
		
		
	}
}