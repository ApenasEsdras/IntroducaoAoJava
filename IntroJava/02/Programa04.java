//Esdras Soares 
//11-05-2022

import javax.swing.*;


class Programa04
{
	public static void main (String entrada[])
	{
		//declaração de variaveis
		int n1,n2,div;
		double pot;

		String msg = "";
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero interio"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Numero"));
		//processamneto
		div = (int)n1 / (int)n2;
		pot = Math.pow(n1,n2);
		
		//saida de resultados
		msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
		msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
		JOptionPane.showInputDialog(null, msg);
		System.exit(0);
	}
}