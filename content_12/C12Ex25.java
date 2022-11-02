package content_12;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class C12Ex25 {
    public static void main(String[] args) throws Exception 
    {

        String[] nomeEquipe = new String[20];
        String pesqEquipe;
        Integer[] pontEquipe = new Integer[20];
        int cont = 0;


        for (int aux = 0; aux < nomeEquipe.length; aux++) 
        {
            nomeEquipe[aux] = JOptionPane.showInputDialog(null, 
            "Digite o nome da equipe: ",
            "Dados",
            JOptionPane.QUESTION_MESSAGE);

            pontEquipe[aux] = Integer.valueOf(JOptionPane.showInputDialog(null,
            "Digite a pontuação da equipe: ",
            "Dados",
            JOptionPane.QUESTION_MESSAGE));
        }

       Arrays.sort(pontEquipe, Collections.reverseOrder());

      pesqEquipe = JOptionPane.showInputDialog(null,
       "Digite o nome de uma equipe para verificar a posição: ",
       "Dados",
       JOptionPane.QUESTION_MESSAGE);

       int pos = -1;

       for (int aux = 0; aux < nomeEquipe.length; aux++) 
       {
        pos = aux;
        if (Objects.equals(nomeEquipe[aux], pesqEquipe))
        {
        JOptionPane.showMessageDialog(null, 
            "A equipe "+nomeEquipe[aux]+" ficou na posição "+(pos + 1),
            "Resultado Pesquisa",
            JOptionPane.INFORMATION_MESSAGE);
            cont++;
        }
       }
       if (cont > 0) 
       {
        JOptionPane.showMessageDialog(null, 
        "A equipe não foi encontrada",
        "Dados",
        JOptionPane.WARNING_MESSAGE);
       }
    }
}
