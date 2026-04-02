package utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

public class ScreenshotHelper {

public static void captureScreenshot(WebDriver driver, String testName) {

File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

String path = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timestamp + ".png";

try {
FileUtils.copyFile(src, new File(path));
System.out.println("Screenshot saved: " + path);
} catch (IOException e) {
e.printStackTrace();
}

}

}