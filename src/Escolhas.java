import javax.swing.JOptionPane;

public class Escolhas {
    String[] escolhas1 = {"Conversor de moeda", "Conversor de Temperatura"};    
    String input = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao: ", "menu", JOptionPane.QUESTION_MESSAGE, null, 
    escolhas1,
    escolhas1[0]
    );
}
