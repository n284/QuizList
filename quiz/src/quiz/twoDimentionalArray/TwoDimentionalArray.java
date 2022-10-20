package quiz.twoDimentionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimentionalArray {
	/*
	 * 行列の積を計算するプログラムを作成してください。
	 *
	 * 条件
	 * 整数が来ることを前提にしてよい
	 * 入力メソッドは以下をconvertCSVtoArrayを使用する
	 * 配列の出力メソッドはprintArrayメソッドを使用する
	 *
1,2,3
4,5,6
7,8,9
9,8,7
6,5,4
3,2,1


	 */

	public static int ROW_NUMBER = 3;
	public static int COLUMN_NUMBER = 3;
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int [][] leftArray;
		int [][] rightArray;
		int [][] answerArray;

		try{
			leftArray = convertCSVtoArray();
			rightArray = convertCSVtoArray();
			answerArray = new int[ROW_NUMBER][COLUMN_NUMBER];

			for(int i = 0; i < ROW_NUMBER; i++) {
				for(int j = 0; j < COLUMN_NUMBER; j++) {
					int value = 0;
					for(int k = 0; k < COLUMN_NUMBER; k++) {
						value += leftArray[i][k]*rightArray[k][j];
					}
					answerArray[i][j] = value;
				}
			}

			printArray(answerArray);

		}catch (IOException e) {
			System.out.println("入力エラーが発生しました");
		}
	}

	public static int[][] convertCSVtoArray() throws IOException{
		int [][] array = new int[ROW_NUMBER][COLUMN_NUMBER];
		for(int i = 0; i < array.length; i++) {
			String[] inputLine = br.readLine().split(",");
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = Integer.parseInt(inputLine[j]);
			}
		}
		return array;
	}

	public static void printArray(int[][] array) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				sb.append(array[i][j]).append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
