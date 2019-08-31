package useCases;

import com.github.luchadoresjaponeses.Main;
import com.github.luchadoresjaponeses.contentcomparator.FileContentComparator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class UseCasesTest {
	private final String OUTPUT_FILE_LOCATION_NAME = "src\\test\\resources\\useCases\\output.out";

	@Before
	public void cleanOutput() {
		File fileForDelete = new File(OUTPUT_FILE_LOCATION_NAME);

		boolean ignored = fileForDelete.delete();
	}

	/**
	 *
	 */
	@Test
	@Ignore
	@Parameters(method = "dataSet")
	public void test(String testCase, String inputFileName, String expectedOutputFileName) throws IOException {
		File fileInput = getFile(inputFileName);
		File fileOutputExpected = getFile(expectedOutputFileName);

		String fileInputPath = fileInput.getPath();

		Main.main(new String[]{fileInputPath, OUTPUT_FILE_LOCATION_NAME});

		File actual = new File(OUTPUT_FILE_LOCATION_NAME);

		Assert.assertTrue(actual.exists());

		boolean sameFilesContent = new FileContentComparator().compareFiles(fileOutputExpected, actual);

		Assert.assertTrue(sameFilesContent);
	}

	public Object[] dataSet() {
		return new Object[]{
				$("Dos luchadores donde uno de ellos gana en altura pero pierde en peso y el otro al reves", "test01", "test01")
		};
	}

	private File getFile(String fileName) {
		return new File("src/test/resources/useCases/" + fileName);
	}
}