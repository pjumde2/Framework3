package programmpractise;

import java.io.FileInputStream;

public class ReadXLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream File= new FileInputStream(Filepath);
		HSSFWorkbook wb=new HSSFWorkbook(File);

		HSSFSheet sheet=wb.getSheet(Sheetname);
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("Rows are: "+rows);
		HSSFRow row=sheet.getRow(1);
		int columns=row.getPhysicalNumberOfCells();
		System.out.println("No. of Columns are: "+columns);
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				row=sheet.getRow(i);
				HSSFCell cell=row.getCell(j);
				String value=cell.toString();
				System.out.println("Cell Value is: "+value);
			}
		}

	}

}
