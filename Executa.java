package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.Browser;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@executa",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
		
		)

public class Executa extends Browser{
	
	@AfterClass
	public static void fecharPgina() {
		adriver().quit();
		System.out.println("---------Teste Finalizado---------");
	}
	
	

}
