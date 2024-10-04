package numpy;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelsheetHandling {
	
	public static void WriteExcel() throws IOException {
		
		XSSFWorkbook workBook=new XSSFWorkbook();
		XSSFSheet worksheet= workBook.createSheet("Sheet1");
		
		int rowNumber =0;
		for(int i=1;i<=10;i++) {
			Row row = worksheet.createRow(rowNumber++);
			int colNumber=0;
			for(int j=1;j<=10;j++){
				Cell cell=row.createCell(colNumber++);	
				cell.setCellValue("row" +i + "column" +j );
			}
		}
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		
		System.out.println(path);
		File excelfile =new File(path)	;	
		FileOutputStream Fos=null;	
		try {
			Fos =new FileOutputStream(excelfile);
			workBook.write(Fos);
			workBook.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}finally
		{
			Fos.close();
		}
		
	}
	
	public static void readExcel() throws IOException {
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		
		System.out.println(path);
		File excelfile =new File(path)	;
		FileInputStream Fis =new FileInputStream(excelfile);
		
		XSSFWorkbook workBook=new XSSFWorkbook(Fis);
		XSSFSheet worksheet= workBook.createSheet("Sheet1");
		
		Iterator<Row> row = worksheet.rowIterator();
		
		while(row.hasNext()) {
			Row currRow =row.next();
			Iterator<Cell> cell=currRow.cellIterator();
			while (cell.hasNext()) {
				Cell currcell=cell.next();
				System.out.print(currcell.getStringCellValue()+"~");
			}
			System.out.println();
			}
		Row newRow =worksheet.createRow(12);
		Cell newCell =newRow.createCell(13);
		FileOutputStream Fos =new FileOutputStream(excelfile);
		workBook.write(Fos);
		workBook.close();
		}		
		

	
	public static void main(String args[]) throws IOException
	{
		WriteExcel();
		readExcel();
	}

}
