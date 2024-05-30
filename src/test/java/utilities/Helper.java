package utilities;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void Capturescreenshot(WebDriver driver, String screenshotname) {
		//function to get the path of screenshots folder
		Path dest=Paths.get("./Screenshots",screenshotname+".png");
		try {
			Files.createDirectories(dest.getParent());
			FileOutputStream out=new FileOutputStream(dest.toString());
			//takescreenshot da interface by7wl el screenshot l bytes
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			System.out.println("Exception while taking screenshots"+e.getMessage());
		}
	}

}
