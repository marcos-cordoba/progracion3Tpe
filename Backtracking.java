package TPE;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
	
	private ArrayList<Maquina> maquinas;
	private ArrayList<Maquina> maquinaOptima;
	private int piezas;
	private int estadosGenerados = 0;
	
	public Backtracking(ArrayList<Maquina> maquinas, int piezas) {
		this.maquinas = maquinas;
		this.piezas = piezas;
		this.maquinaOptima = new ArrayList<Maquina>();
	}
	
	public void resolver() {
		backtracking(new ArrayList<>(), 0);
		System.out.println("Estados generados: " + estadosGenerados);
	}
	
	public void backtracking(List<Maquina> actual, int total) {
		//System.out.println("total de piezas");
		//System.out.println(actual);
		//System.out.println(maquinaOptima);
		estadosGenerados++;
		if(total == piezas) {
			
			if(maquinaOptima.isEmpty() || actual.size() > maquinaOptima.size()) {
				maquinaOptima = new ArrayList<Maquina>(actual);
				//System.out.println("secuencias mas optimas");
				//System.out.println(maquinaOptima);
				this.imprimirMejorSecuencias();
			}
		}
		else {
			if(total < piezas) {
				for(Maquina maquina : this.maquinas) {
					actual.add(maquina);
					backtracking(actual, total + maquina.getPieza());
					actual.remove(actual.size() - 1);
				}
			}
		}
	}
	
	public void imprimirMejorSecuencias() {
		System.out.println(maquinaOptima);
		if(!maquinaOptima.isEmpty()) {
			for(Maquina maquina : maquinaOptima) {
				System.out.println(maquina);
			}
			System.out.println("\n");
		} else {
			System.out.println("No hay combinacion posible.");
		}
	}
}
