package genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

public class utilitymethods {
	public String readingthedatafromthepropertyfile(String Path, String key) throws IOException {
		File file = new File(Path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty(key);
		return url;

	}

}
