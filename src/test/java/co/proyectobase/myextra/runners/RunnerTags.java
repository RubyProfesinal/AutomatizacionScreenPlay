package co.proyectobase.myextra.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(			
		features="src/test/resources/features/HU_MyExtra.feature",
		tags= "@Caso01",
		glue="co.proyectobase.myextra.stepdefinitions",
		snippets=SnippetType.CAMELCASE	)
public class RunnerTags {

}
