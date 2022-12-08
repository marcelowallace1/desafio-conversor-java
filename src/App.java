
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        // String moeda = JOptionPane.showInputDialog("teste");
        String[] choices = {"Conversor de moeda", "Conversor de Temperatura",};

        String input = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao: ", "menu", JOptionPane.QUESTION_MESSAGE, null, 
        choices,
        choices[0]
        );
        System.out.println(input);
        

        String[] moedasConverte = {"de Real a dolar", "de Reais a Euros", "De Reais a Libras", "de Reais a peso argentino", "de Reais a peso chileno"};

        String moedasInput = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja converter seu dinheiro", 
        "Moedas", JOptionPane.QUESTION_MESSAGE, null,
        moedasConverte,
        moedasConverte[0]
        );
        System.out.println(moedasInput);
    }
}
