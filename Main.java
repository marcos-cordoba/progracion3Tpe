package TPE;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Maquina> maquinas = new ArrayList<Maquina>();
		Maquina m1 = new Maquina("M1", 7);
		Maquina m2 = new Maquina("M2", 3);
		Maquina m3 = new Maquina("M3", 4);
		Maquina m4 = new Maquina("M4", 1);
		
		maquinas.add(m1);		
		maquinas.add(m2);
		maquinas.add(m3);
		maquinas.add(m4);
		//System.out.println("arreglo de maquinas");
		//System.out.println(maquinas);
		
        Backtracking pb = new Backtracking(maquinas, 12);
        System.out.println("Backtracking");
        System.out.println("Solución obtenida: secuencia de máquinas");
        pb.resolver();

	}

}
