import javax.swing.JOptionPane;

public class Conversor {
    String[] moedasEscolhas = {"de Real a dolar", "de Reais a Euros", "de Reais a Libras", 
    "De Reais a pesos argentinos", "De Reais para Peso chileno", "de Dolar para Reais", "de Euro a Reais",
    "de Libras Esterlinas a Reais", "de peso argentino a Reais", "de Peso Chileno a Reais",


};
    String moedasInput = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja converter seu dinheiro", 
    "Conversor de moedas", JOptionPane.QUESTION_MESSAGE, null,
    moedasEscolhas,
    moedasEscolhas[0]
    );
}
