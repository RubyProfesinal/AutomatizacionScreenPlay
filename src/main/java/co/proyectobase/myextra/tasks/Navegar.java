package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.Tecla;
import co.proyectobase.myextra.userinterface.MenuPage;
import co.proyectobase.myextra.userinterface.SQLPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Navegar implements Task{


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Escribir.elTexto("1").en(MenuPage.AMBIENTE_PRUEBAS));
		actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
		actor.attemptsTo(Escribir.elTexto("1").en(MenuPage.CONFIRMACION_AMBIENTE_PRUEBAS));
		actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
		actor.attemptsTo(Escribir.elTexto("1").en(MenuPage.SQL));
		actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
		actor.attemptsTo(Ir.hastaVerTexto("SQL").en(SQLPage.TITULO_SQL_PAGE));
		
	}
	
	public static Navegar unMenu() {
		
		return Tasks.instrumented(Navegar.class);
	}

}
