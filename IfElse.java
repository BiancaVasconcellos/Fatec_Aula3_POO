import java.util.*;
public class IfElse {

    public static void main (String[]args){

        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite a sua nota\n");
        int nota = leitor.nextInt();
        If (nota >= 6) {
            System.out.println("Parabéns!");
            System.out.println(
                "A nota %d lhe garante aprovação", 
                nota
            );
        
        }
        else {
            System.out.println(

            "Com %d você reprova, infelizmente\n",
               nota

            );
        leitor.close();    
        }
    }
    
}
