package co.proyectobase.myextra.interactions;

import co.proyectobase.myextra.util.myextra.MyExtra_init;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Digitar implements Interaction{

	private String key;
	public _System sSystem = null;
	public Screen screen = null;
	public _Session Sess0 = null;
	public int g_HostSettleTime = 3000;
	
	
	public Digitar(String key) {
		this.key = key;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		sSystem = MyExtra_init.crearSistema();
		Sess0 = MyExtra_init.crearSesion(sSystem);
		screen = MyExtra_init.crearPantalla(Sess0);
		
		screen.sendKeys("<"+key.toString()+">");
		screen.waitHostQuiet(g_HostSettleTime);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	public static Digitar laTecla(String key) {
		
		return new Digitar(key);
	}
	
	

}
