package input_output_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_Input_Output {
	
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("D:\\vikas\\PopularHashTags.txt");
		FileOutputStream os=new FileOutputStream("D:\\vikas\\PopularHashTagsfile.txt");
		int i=0;
		while((i=fi.read())!=-1)
		{
			os.write(i);
		}
			System.out.println("file has been created succesfully");
			
			FileInputStream fi1=new FileInputStream("D:\\vikas\\PopularHashTagsfile.txt");
			InputStreamReader ir=new InputStreamReader(fi1);
			BufferedReader br=new BufferedReader(ir);
			String line;
			while((line=br.readLine())!=null)
			{
				String str[]=line.split("\\s");
				for (String string : str) 
				{
					if(string.startsWith("#"))
					{
						System.out.println(string);
					}
					
				}
			}
			br.close();
			ir.close();
			fi.close();
			os.close();
	}

}
