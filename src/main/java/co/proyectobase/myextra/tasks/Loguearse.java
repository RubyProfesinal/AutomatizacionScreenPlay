package co.proyectobase.myextra.tasks;

import java.util.List;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.Credenciales;
import co.proyectobase.myextra.model.Tecla;
import co.proyectobase.myextra.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Loguearse implements Task {

	private List<Credenciales> datos;

	public Loguearse(List<Credenciales> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Escribir.elTexto(datos.get(0).getUsuario()).en(LoginPage.USUARIO));
		actor.attemptsTo(Escribir.elTexto(datos.get(0).getContrasena()).en(LoginPage.PASSWORD));
		actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
		//actor.attemptsTo(Ir.hastaVerTexto(datos.get(0).getTexto()).en(LoginPage.UBICACION));
	}

	public static Loguearse enMyExtra(List<Credenciales> datos) {

		return Tasks.instrumented(Loguearse.class, datos);
	}

}
