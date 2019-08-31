package com.github.luchadoresjaponeses.contentcomparator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(JUnitParamsRunner.class)
public class FileContentComparatorTest {

	@Test
	@TestCaseName("saraza")
	@Parameters({
			"Same File case, someFile.txt, someFile.txt, true",
			"Different File case, someFile.txt, anotherFile.txt, false",
			"Different File extension same content case, someFile.txt, someFile.in, true",
			"Same File content with IN extension, someFile.in, someFile.in, true",
			"Same File content with diferent extensions, someFile.in, someFile.txt, true",
			"Different File content with diferent extensions, someFile.in, anotherFile.txt, false"})
	public void test(String testCase, String fileNameA, String fileNameB, boolean expected) throws IOException {
		FileContentComparator fileContentComparator = new FileContentComparator();

		File fileA = getFile(fileNameA);
		File fileB = getFile(fileNameB);

		boolean actual = fileContentComparator.compareFiles(fileA, fileB);

		Assert.assertEquals(expected, actual);
	}

	private File getFile(String fileName) {
		return new File("src/test/resources/fileContentParameter/" + fileName);
	}
}
