//Esdras Soares de Oliveira
//11-05-2022
//q negocio complicado meu Deus.

import javax.swing.*;

class Porgrama05 
{
	public static void main (String entrada[])
	{
		int n1, n2,p=1;
		char op = 0;
		String msg ="", msgEntr="Digite 1 para produto\ndigite 2 para produtoria\n";
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero interiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero interiro"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		//processamento

		switch(op)
		{
			case '1':
			{
				if (n1>0 && n1>0)
				{
					p = n1 * n2;
					msg = msg + "Produto de " + n1 + " por " + n2 + " = " + p + "\n\n";
				}
				break;
			}
			case '2':
			{
				for(int i=1; i<=n2; i=i+1)
				{
					p = p * n1;					
				}
				msg = msg + "Produto de " + n1 + ", " + n2 + " Vezes eh: " + p + "\n\n";
				break;
			}
			default: JOptionPane.showInputDialog(null, "opção invalida calculos não realizados");
		}
		//saida de dados
			if (op >= '1' && op <='3')
			{
				JOptionPane.showInputDialog(null, msg);
			}
			System.exit(0);
	}
}