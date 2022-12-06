package br.ce.barriga.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/resumo.feature",
        glue = "br.ce.barriga.steps",
        plugin = {"pretty", "html:target/report-html","json:target/report.json"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class RunnerResumo {
}
