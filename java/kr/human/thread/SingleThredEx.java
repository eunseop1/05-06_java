package kr.human.thread;

import javax.swing.JOptionPane;

// 싱글스레드 : 프로세스 내에 실행 흐름이 1개인 프로그램!!!
public class SingleThredEx {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름이 뭐니?");
		JOptionPane.showMessageDialog(null, name + "씨, 반갑습니다!");
		
		for(int i=0;i<20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);// 0.5초 쉰다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
