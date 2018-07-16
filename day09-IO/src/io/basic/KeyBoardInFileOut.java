package io.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 표준 입력인 키보드 입력ㅇ을 받아서
 * 입력된 내용을 팡리로 출력하는 클래스
 * -------------------------
 * -- 입력 --
 * 1. node stream (키보드 = System.in : inputStream)
 * 2. filter stream (stream -> reader : InputStreamReader)
 * 3. filter stream ( reader -> reader : Buffered Reader)
 * 4. 3의 filter stream 을 통하여 1줄 단위의 String 입력으로 처리하는 메소드 readLine() 을 사용
 * 
 * -- 출력 --
 * 5. node stream (파일 = 문자 저장(writer) : FileWriter )
 * 6. filter stream (writer -> writer : PrintWriter)
 *    1줄 단위 출력을 지원하는 메소드 println() 을 사용
 * 
 * -- 정리 --
 * 8. 입력에서 마지막으로 사용된 filter stream 닫기
 * 9. 출력에서 마지막으로 사용된 filter stream 닫기
 * 
 * @author PC38207
 *
 */
public class KeyBoardInFileOut {

	public static void main(String[] args) throws IOException {
		
		// 1. Input node stream : System.in
		InputStream in = System.in;
		
		// 2. node stream -> filter steam -> inputStream -> reader
		InputStreamReader ir = new InputStreamReader(in); 
		
		// 3. filter -> filter : 1줄 단위 입력
		BufferedReader br = new BufferedReader(ir);
		
		// ====== 입력 객체에 대한 선언 끝
				
		// 5. output node stream
		FileWriter fw = new FileWriter("out.txt");
		
		// 6. node -> filter : 1줄 단위 출력
		PrintWriter pw = new PrintWriter(fw);
		
		// ====== 출력 객체에 대한 선언, 초기화 끝
		
		// 4. 읽기 filter stream 에서 읽기
		System.out.println("값을 입력하세요 (ctrl + z 입력시 중단)");
		String input = null;
		
		while ((input = br.readLine()) != null) {
			// 7. 출력 filter stream 에 쓰기
			//    파일 쓰기
			pw.println(input);
			// 화면에도 같이 출력 (확인을 위한 목적)
			System.out.println("읽은 데이터 : FileWriter" + input);
		}
		
		// 8. 입력 filter stream 닫기
		br.close();
		
		// 9. 출력 filter steam 닫기
		pw.close();
		
		
		
		
		
	}

}
