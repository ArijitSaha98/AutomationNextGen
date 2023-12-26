package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.io.File;
import java.io.IOException;

public class RenameTool {

	public static void main(String[] argv) throws IOException
	{
		// Path of folder where files are located
		String folder_path = "D:\\CANON 200D II PHOTOS\\HARIDWAR\\New folder";

		// creating new folder
		File myfolder = new File(folder_path);

		File[] file_array = myfolder.listFiles();
		for (int i = 0; i < file_array.length; i++)
		{

			if (file_array[i].isFile())
			{

				File myfile = new File(folder_path +"\\" + file_array[i].getName());
				String long_file_name = file_array[i].getName();
				if(long_file_name.contains("MVI"))
				{String[] tokens = long_file_name.split("MVI");
				//System.out.println(tokens[1]);
				// String new_file_name = tokens[1];
				//System.out.println(long_file_name);
				//System.out.println(i+1+". "+long_file_name);
			myfile.renameTo(new File(folder_path +"\\" +"MVI_"+tokens[1]));
			System.out.println("Updated "+tokens[1]);


				// file name format: "Snapshot 11 (12-05-2017 11-57).png"
				// To Shorten it to "11.png", get the substring which
				// starts after the first space character in the long
				// _file_name.
				//	                myfile.renameTo(new File(folder_path +
				//	                             "\\" + new_file_name + ".png"));
				}
			}
		}
	}


}