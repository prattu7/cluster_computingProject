package ClusterComputingTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_from_Excel {

	public static void main(String[] args) throws IOException {


		String excelFilePath="C:\\Users\\piyush\\eclipse-workspace\\ClucterComputing\\newdata\\EXCELFILE.xlsx";

		FileInputStream inputstream=new FileInputStream(excelFilePath);


		XSSFWorkbook Workbook=new XSSFWorkbook(inputstream);

		XSSFSheet sheet=Workbook.getSheet("Sheet1");
		
		//XSSFSheet sheet=Workbook.getSheetAt(0);


		//Using for loop

		int rows=sheet.getLastRowNum();

		int cols=sheet.getRow(1).getLastCellNum();


		for(int r=0; r<=rows; r++)

		{

		XSSFRow row=sheet.getRow(r);


		for(int c=0; c<cols; c++)

		{

		XSSFCell Cell=row.getCell(c);


		switch(Cell.getCellType())
 
		{

		case STRING: System.out.print(Cell.getStringCellValue()); break;

		case NUMERIC: System.out.print(Cell.getNumericCellValue()); break;

		case BOOLEAN: System.out.print(Cell.getBooleanCellValue()); break;

		}

		System.out.print(" | ");

		}

		System.out.println();

		}




		//Iterator

		/*Iterator iterator=sheet.iterator();

		while(iterator.hasNext())

		{

		XSSFRow row=(XSSFRow) iterator.next();


		Iterator cellIterator=row.cellIterator();


		while(cellIterator.hasNext())

		{

		XSSFCell cell=(XSSFCell) cellIterator.next();

		switch(cell.getCellType())

		{

		case STRING: System.out.print(cell.getStringCellValue()); break;

		case NUMERIC: System.out.print(cell.getNumericCellValue()); break;

		case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;

		}

		System.out.print(" | ");

		}

		System.out.println();

		}*/

		}

		}
