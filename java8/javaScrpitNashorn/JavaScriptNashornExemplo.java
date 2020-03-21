package javaScrpitNashorn;

import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptNashornExemplo {
	
	public static void main(String[] args) {
		
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		Bindings bind = se.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("goodbye", " Ate logo");
		
		try {
			se.eval(new FileReader("olamundo.js"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
