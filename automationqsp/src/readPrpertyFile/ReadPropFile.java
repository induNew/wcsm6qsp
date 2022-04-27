package readPrpertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./data/config.properties");
		prop.load(fis);
		String value = prop.getProperty("browser");
		System.out.println(value);
	}

}
