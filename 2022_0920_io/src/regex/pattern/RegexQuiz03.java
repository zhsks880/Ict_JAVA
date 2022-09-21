package regex.pattern;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
	       1. day, store, grade[], detail(µî±Ş¿¡¼­ °¡°İ»çÀÌ), price¸¦ ¸â¹ö·Î °®´Â 
	       Product Å¬·¡½º¸¦ ¼±¾ğÇÕ´Ï´Ù.
	       2. Àº´Ğ(Ä¸½¶È­)À» ÀÌ¿ëÇØ¼­ Å¬·¡½º¸¦ µğÀÚÀÎÇÕ´Ï´Ù.
	       3. MainClass¿¡ Product Å¸ÀÔÀ» °®´Â ArrayList¸¦ »ı¼ºÇÕ´Ï´Ù.
	       4. BufferedReader¸¦ ÅëÇØ¼­ °Ç´ã.txtÆÄÀÏÀ» ÀĞ¾îµéÀÌ¼¼¿ä.
	       (ÀÎÄÚµù ¹æ½Ä -> UTF-8)
	       5. while¹® ¾È¿¡¼­´Â readLine()¸Ş¼­µå¸¦ ÀÌ¿ëÇØ¼­ 
	        ÇÑ ÁÙ¾¿ ÀĞµµ·Ï Ã³¸®ÇÕ´Ï´Ù.
	       6. ³¯Â¥, ÁöÁ¡, µî±Ş, »ó¼¼, °¡°İ ÆĞÅÏ ºĞ¼®À» ÅëÇØ¼­ 
	        Product¿¡ ÀúÀåÈÄ ¸®½ºÆ®¿¡ Ãß°¡ÇÕ´Ï´Ù.
	        »ó¼¼ °°Àº °æ¿ì¿¡´Â Á¤±Ô Ç¥Çö½Ä ÆĞÅÏÀ¸·Î ±¸ºĞÇÏ±â ¾î·Á¿ï ¼ö ÀÖ±â ¶§¹®¿¡
	        µî±ŞÆĞÅÏÀÇ ³¡ÁöÁ¡ ~ °¡°İÆĞÅÏÀÇ ½ÃÀÛÁöÁ¡ ¹Ì¸¸±îÁö ºÎºĞÃßÃâ ÇÏ½Ã´Â °ÍÀ»
	        ÃßÃµµå¸³´Ï´Ù. (substring(begin, end))
	        
	        ÃßÃâ ¿Ï·á ÈÄ °´Ã¼¸¦ ¸®½ºÆ®¿¡ ´ã±â°¡ ¿Ï·áµÈ ÈÄ¿¡
	        °¢ °´Ã¼ÀÇ »ó¼¼ ³»¿ëÀ» Ãâ·ÂÇØ ÁÖ¼¼¿ä.
	        (ProductÀÇ toStringÀ» ÀÌ¿ëÇØ¼­ °£´ÜÇÏ°Ô Ãâ·ÂÇØ ÁÖ¼¼¿ä)
	        
	       7. ¿ÜºÎ ¶óÀÌºê·¯¸®¸¦ »ç¿ëÇØ¼­ ºĞ¼®ÇÑ ÆĞÅÏÀ» xlsx ¿¢¼¿ ÆÄÀÏ·Î
	        ÃßÃâÇÏ½Ã¸é µË´Ï´Ù.
	        ¿¢¼¿ÆÄÀÏ°´Ã¼ »ı¼º ÈÄ¿¡ FileOutputStreamÀ» »ç¿ëÇÏ¿© 
	        ÆÄÀÏÀ» ÀÛ¼ºÇÏ½Ã¸é µË´Ï´Ù. (È®ÀåÀÚ´Â xlsx)
	       */
		//substring(begin, end)
		//matcher¸¦ ÀÌ¿ëÇØ¼­ Á¤±ÔÇ¥Çö½Ä ½ÃÀÛ°ú ³¡À» ÇØ¼­ µî±Ş³¡³ª´Â°÷+1 ½ÃÀÛÇØ¼­ °¡°İÀÇÁ¤±Ô½Ä ½ÃÀÛ Àü-1±îÁö
		
		//¸®½ºÆ® ¼±¾ğ
		List<Product> list = new ArrayList<>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/Work/°Ç´ã.txt"),"UTF-8"));
			
			String line;
			
			//5¹ø¹®Á¦ ÇØ´çÇÏ´Â°ÍÀ¸·Î while ¹® ¾È¿¡ ½ÄÀ» Ã¤¿î ´ÙÀ½¿¡ whileÀ» ¾º¿ì´Â Çü½ÄÀ¸·Î Ã³¸®
			while((line = br.readLine()) != null) {
				//Á¤±ÔÇ¥Çö½Ä
				String pattern1 = "\\d{8}-\\d{2}-\\d{12,13}"; 	//³¯Â¥ ÆĞÅÏ
				String pattern2 = "[°¡-ÆR]+ [°¡-ÆR]+";			//°¡°Ô ÆĞÅÏ
				String pattern3 = "\\[[A-Z°¡-ÆR]*\\]";			//µî±Ş ÆĞÅÏ
				String pattern4 = "\\d+,*\\d+¿ø";				//°¡°İ ÆĞÅÏ
				
				Matcher m1 = Pattern.compile(pattern1).matcher(line);
				Matcher m2 = Pattern.compile(pattern2).matcher(line);
				Matcher m3 = Pattern.compile(pattern3).matcher(line);
				Matcher m4 = Pattern.compile(pattern4).matcher(line);
				
				if(m1.find() && m2.find() && m3.find() && m4.find()) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					//µî±ŞÆĞÅÏÀÇ ³¡ÁöÁ¡+1~°¡°İÆĞÅÏÀÇ ½ÃÀÛÁöÁ¡-1
					String detail = line.substring(m3.end() + 1, m4.start() -1);	//detail ÆĞÅÏ
					String price = m4.group();
					
					//Product °´Ã¼¸¦ »ç¿ëÇØ¼­ Æ÷ÀåÇÏ±â
					Product p = new Product(day, store, grade, detail, price);
					list.add(p);
					
					//À§¿Í °°Áö¸¸ º¯¼ö ¼±¾ğ ¾ÈÇÏ°í ÇÏ´Â ¹æ¹ı
//					list.add(new Product(
//							m1.group(), 
//							m2.group(), 
//							m3.group(), 
//							line.substring(m3.end() + 1, m4.start() -1), 
//							m4.group()));
					
				}
			}	//end while
			
			//for¹®À¸·Î Ãâ·ÂÇØº¸±â
//			for(Product p : list) {
//				System.out.println("------------------------------");
//				System.out.println(p);
//			}
			
			//À§¿Í °°Àº°Å ¶÷´Ù½ÄÀ¸·Î º¯Çü
			list.stream().forEach((data) -> {
				System.out.println("------------------------------");
				System.out.println(data);
			});
			
			excel(list);			//¿¢¼¿ ¸Ş¼­µå¸¦ È£ÃâÇØ¼­ ¿¢¼¿ ÆÄÀÏÀ» »ı¼º. 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		

	}	//end main
	
	//¿¢¼¿ Ãâ·Â ¸Ş¼­µå(¿¢¼¿ Ãâ·Â½Ã ¶÷´Ù½Ä Àú°Å ÁÖ¼® Ã³¸® ÇØ¾ßÇÔ)
	public static void excel(List<Product> list) {
		//¿öÅ©ºÏ »ı¼º
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//¿öÅ©½ÃÆ® »ı¼º
		XSSFSheet sheet = wb.createSheet("°Ç´ã");
		
		//Çà »ı¼º
		XSSFRow row = sheet.createRow(0);
		
		//¼¿ »ı¼º
		XSSFCell cell;
		
		//Çì´õ Á¤º¸ ±¸¼º
		cell = row.createCell(0);
		cell.setCellValue("³¯Â¥");
		
		cell = row.createCell(1);
		cell.setCellValue("ÁöÁ¡");
		
		cell = row.createCell(2);
		cell.setCellValue("µî±Ş");
		
		cell = row.createCell(3);
		cell.setCellValue("»ó¼¼");
		
		cell = row.createCell(4);
		cell.setCellValue("°¡°İ");
		
		//¸®½ºÆ®ÀÇ size ¸¸Å­ÀÇ row¸¦ »ı¼º
		Product vo;
		for(int i=0; i<list.size(); i++) {
			vo = list.get(i);
			//Çà»ı¼º
			row = sheet.createRow(i+1);
			//¼¿Ã¤¿ì±â
			cell = row.createCell(0);
			cell.setCellValue(vo.getDay());
			cell = row.createCell(1);
			cell.setCellValue(vo.getStore());
			cell = row.createCell(2);
			cell.setCellValue(vo.getGrade());
			cell = row.createCell(3);
			cell.setCellValue(vo.getDetail());
			cell = row.createCell(4);
			cell.setCellValue(vo.getPrice());
		}
		//ÆÄÀÏ ¾²±â
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/Work/°Ç´ã.xlsx");
			wb.write(fos);
			System.out.println("ÆÄÀÏÀÛ¼º ¿Ï·á");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
