package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {

		System.out.println("시작 !");
		
		StringBuilder text = new StringBuilder();
		
		for(int i=0; i<=1000000; i++) {
			text.append(i + "안녕하세요\n");
		}
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		long start = System.currentTimeMillis();
		try {
			fos = new FileOutputStream("C:\\Work\\file\\ssout.txt");
			bos = new BufferedOutputStream(fos);
			
			byte[] data = new String(text).getBytes();
			
			for(byte b:data) {
				bos.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				fos.close();
				bos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("소요 시간: " + (end-start)*0.001 + "초");
		
		
	}

}
