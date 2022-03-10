import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

public class ifSimples {
    public static void main (String []args) {
        JOptionPane.showInputDialog("Digite Algo");
        //variável referência
        Scanner.leitor
        //isso constrói um objeto do tipo Scanner
        //new é semelhante ao malloc da linguagem C
        //temos em funcionamento o Garbage Collector
        leitor = new Scanner ();
        double nota;
        System.out.println("Digite a sua nota");
        nota = leitor.nextDouble(); 
        if(nota >=6){
           System.out.println("Parabéns!");
        System.out.println("Aprovado");
        leitor.close();
    }
    }
    
    }
