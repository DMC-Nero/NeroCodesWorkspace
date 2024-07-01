package qedge_adv_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {

	public static void main(String[] args) {
		File file = new File("//Users//natrajvemula//git//NeroCodesWorkspace//NeroCodesQedge//db-info.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
		}
		
		
	}

}
