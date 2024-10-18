package AcheBuilder.Runner;

import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary", "com.epam.reportportal.cucumber.ScenarioReporter"},
        features = ".",
        glue={"."},
        tags= "@teste"
)
public class RunCucumberTest {

    //TODO: mapear melhor forma do PO se envolver e escrever cenários sem precisar de git/ide
    //TODO: disponibilizar a execução da automação para quem quiser

}