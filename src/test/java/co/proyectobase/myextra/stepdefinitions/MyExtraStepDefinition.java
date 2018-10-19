package co.proyectobase.myextra.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.proyectobase.myextra.model.Credenciales;
import co.proyectobase.myextra.questions.LaRespuesta;
import co.proyectobase.myextra.tasks.Abrir;
import co.proyectobase.myextra.tasks.Loguearse;
import co.proyectobase.myextra.tasks.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MyExtraStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver SuNavegador;
	private Actor rafa = Actor.named("Rafa");

	@Before
	public void setup() {
		rafa.can(BrowseTheWeb.with(SuNavegador));
	}

	@Given("^Rafa desea realizar consultas en AS400, Rafa abre MyExtra$")
	public void rafaDeseaRealizarConsultasEnASRafaAbreMyExtra() {
		rafa.attemptsTo(Abrir.myExtra());
	}

	@When("^el ingresa sus credenciales$")
	public void elIngresaSusCredenciales(List<Credenciales> datos) {
		rafa.attemptsTo(Loguearse.enMyExtra(datos));
	}

	@When("^navega en un menu$")
	public void navegaEnUnMenu() {
		rafa.attemptsTo(Navegar.unMenu());

	}

	@Then("^verifica que inicio sesion correctamente$")
	public void verificaQueInicioSesionCorrectamente() {
		rafa.should(seeThat(LaRespuesta.es(), equalTo("Introducir sentencias SQL")));

	}
}
