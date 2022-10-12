package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonach {
	public static final int MAX_LENGTH = 10000;//余裕を持たせた最大の配列の長さ
	public static final int MIN = 1;
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			while(true) {
				try {
					System.out.println("正数を入力してください");
					int number = Integer.parseInt(br.readLine());
					if(number >= MIN) {
						System.out.println("1以上の数字を入力してください");
						continue;
					}
				}catch(NumberFormatException e) {
					System.out.println("数字を入力して下さい");
				}
			}
			
			
			
			
		}catch(IOException e) {
			System.out.println("入力エラーが発生しました。");
		}
	}
}
