package properties;

import java.io.IOException;

public class FileReaderManager {
	
	public FileReaderManager() {
		
		
	}
	
	public static FileReaderManager getInstanceFRM() {
		
		FileReaderManager frm = new FileReaderManager();
		
		return frm;
	}
	
	public ConfigurationManager getInstanceCR() throws IOException {
		
		
		ConfigurationManager cr = new ConfigurationManager();
		
		return cr;
		
	}

}
