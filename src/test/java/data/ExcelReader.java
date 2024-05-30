package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static FileInputStream fis=null;
	//To transform the Excel file into stream
	/*private FileInputStream getFileInputStream() {
		String filepath = System.getProperty("user.dir")+"/src/test/java/data/Userdata.xlsx";
		File srcfile=new File(filepath);
		try {
			fis = new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			System.out.println("Error occured in user data Please check the path of file :"+e.getMessage());
		}
return fis;
	}*/
	
//	public Object [][] getExcelData() throws IOException{
	public Object [][] getExcelData(String filePath,String sheet) throws IOException{
		File srcfile=new File(filePath);
		fis = new FileInputStream(srcfile);
		//fis=getFileInputStream();
		//To read Excel file ,you should download POI library
		//add poi apache dependency to pom file [OOXML Schemas]
		//WO da object mn workbook thats mean the all excel sheets
		XSSFWorkbook WO=new XSSFWorkbook(fis);
		//that is mean :Read the first sheet in excel
		XSSFSheet sheetname=WO.getSheet(sheet);
		//Identify rows& coloumns
		int totalnumberofrows = (sheetname.getLastRowNum()+1);
		//int totalnumberofcoloumns = 9 ;
		int totalnumberofcoloumns=sheetname.getRow(0).getLastCellNum();
		String[][] arrayexceldata=new String[totalnumberofrows][totalnumberofcoloumns];
		for (int i=0; i < totalnumberofrows ;i++){
			for(int j=0 ; j<totalnumberofcoloumns ;j++){
				XSSFRow row=sheetname.getRow(i);
				arrayexceldata[i][j]=row.getCell(j).toString();
			}
		}
		//To close the stream
		WO.close();
		return arrayexceldata;
	}

}
