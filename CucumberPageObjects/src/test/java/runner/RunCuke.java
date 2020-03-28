package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		plugin= {"json:target/RunCuke/cucumber.json","pretty",
		"html:target/positive/cucumber.html",
		"com.cucumber.listener.ExtentCucumberformatter"},
		features = "E:\\projectttt\\CucumberPageObjects\\src\\test\\resources\\features\\Searchcars.feature",
		glue="steps",
		tags= {"@Search-Cars", "@Search-Cars-positive"}
		    )

public class RunCuke extends AbstractTestNGCucumberTests {
	
		@BeforeClass
		public static void  setUp()
		{
//initiate the extent report and generate the output in the output/run <unique time stamp>/report.html file by default
			SimpleDateFormat sdf=new SimpleDateFormat("ddmmyyyy_hhmmss");
			Date curDate=new Date();
			String strDate=sdf.format(curDate);
			String fileName=System.getProperty("user.dir")+"\\target\\Extent_Reports\\"+strDate+".html";
			File newFile=new File(fileName);
			
			 ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);

			//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("C:\\Users\\ADMIN\\Downloads\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
	        // Loads the extent config xml to customize on the report.
	        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

	        // User can add the system information as follows
	        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
	        ExtentCucumberFormatter.addSystemInfo("Browser version", "v79.0");
	        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.141.59");

	        // Also you can add system information using a hash map
	        Map<String, String> systemInfo = new HashMap<String, String>();
	        systemInfo.put("Cucumber version", "v1.2.3");
	        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
	        ExtentCucumberFormatter.addSystemInfo(systemInfo);
		}
	
	
	
	
	
	
	
}
