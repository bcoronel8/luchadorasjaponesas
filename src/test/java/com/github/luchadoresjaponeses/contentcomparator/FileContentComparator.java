package com.github.luchadoresjaponeses.contentcomparator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileContentComparator {

	public boolean compareFiles(File fileA, File fileB) throws IOException {

		BufferedInputStream fileABis = new BufferedInputStream(new FileInputStream(fileA));
		BufferedInputStream fileBBis = new BufferedInputStream(new FileInputStream(fileB));

		int fileANextByte = 0;
		int fileBNextByte = 0;

		while (fileANextByte != -1 && fileBNextByte != -1) {
			fileANextByte = fileABis.read();
			fileBNextByte = fileBBis.read();
		}

		fileABis.close();
		fileBBis.close();

		return (fileANextByte == fileBNextByte);
	}
}
