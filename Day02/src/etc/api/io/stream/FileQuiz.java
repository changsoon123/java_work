package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력해주세요: ");
		FileInputStream sso = null;
		FileOutputStream ssi = null;
		String sool = sc.next();
		
		try {
			sso = new FileInputStream("C:\\Work\\file\\"+sool);
			ssi = new FileOutputStream("C:\\Users\\ict03-01\\Desktop\\upload\\"+sool);
			
			byte[] arr = new byte[100];
			
			/* while((result = sso.read(arr)) != -1){
			 * 
			 * }
			 */
			while(true) {
				int result = sso.read(arr);
				if(result == -1) {
					break;
				}
				
				ssi.write(arr, 0 , result);
			}
		
			
		} catch(FileNotFoundException e) {
			System.out.println("파일명이 존재하지 않습니다. ");
			e.printStackTrace();
		}
		
			
		 catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sso.close();
				ssi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
