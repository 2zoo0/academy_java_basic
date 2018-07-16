package io.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

/**
 * 객체 생성 후 객체의 데이터 필드 (멤버변수)를 출력
 * ---------------------------------------
 * -- 입력 --
 * 1. product 객체 생성
 * 
 * -- 출력 --
 * 2. node stream (파일에 출력: FileOutputStream)
 * 3. filter stream (data 단위 출력 : DataOutputStream)
 * 4. write 작업 : filter stream 의 메소드로 출력
 * 
 * -- 정리 --
 * 5. 출력 filter stream 닫기
 * 
 * @author PC38207
 *
 */
public class WriteProductData{

	public static void main(String[] args) throws IOException{
		// 1. 입력대신 객체 생성
		Product adidas = new Product(null, "슈퍼스타", 87200, 5);
		
		// 2. 출력 node stream
		FileOutputStream fos = new FileOutputStream("adidas.txt");
		
		// 3. 출력 filter stream
		DataOutputStream out = new DataOutputStream(fos);
		
		// 4. write : filter stream 의 메소드 사용
		//    데이터 타입별로 출력 메소드를 지원

		if (adidas.getProdCode() != null) {
			out.writeUTF(adidas.getProdCode());
			out.writeUTF(adidas.getProdName());
			out.writeInt(adidas.getPrice());
			out.writeInt(adidas.getQuantity());
			System.out.println("adidas.data 파일이 생성되었습니다.");
			
		} else {
			System.out.println("adidas.data 파일이 생성에 실패했습니다.");
			throw new IOException();
		}
		
		
		
		// 5. output filter stream 닫기
		out.close();
		
		
		
		
	}

}
