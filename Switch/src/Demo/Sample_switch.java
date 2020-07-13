package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample_switch {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("Config/Nasco.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		
		datePicker(prop, "DMY");
	}

	public static void datePicker(Properties prop,String pass) throws InterruptedException {

		
		String DMYText = prop.getProperty(pass);
		String[] DMY = DMYText.split("-");

		System.out.println(DMY.length);

		for (int i = 0; i < DMY.length; i++) {
			System.out.println(DMY[i]);
		}
	}
}
