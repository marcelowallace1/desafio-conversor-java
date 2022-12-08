
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Converter moedasDisp = new Converter();
        // escolha o tipo de conversor
        Escolhas escolhas = new Escolhas();

        if (escolhas.input == escolhas.escolhas1[0]) {

            Conversor conversor = new Conversor();
            // de real para dolar
            if (conversor.moedasInput == conversor.moedasEscolhas[0]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.real = Double.parseDouble(numero);
                double resultado = moedasDisp.real * moedasDisp.dolar;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + resultado);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[1]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.real = Double.parseDouble(numero);
                double resultado = moedasDisp.real * moedasDisp.euro;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + resultado);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[2]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.real = Double.parseDouble(numero);
                double resultado = moedasDisp.real * moedasDisp.libras;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + resultado);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[3]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.real = Double.parseDouble(numero);
                double resultado = moedasDisp.real * moedasDisp.pesoArg;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + resultado);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[4]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.real = Double.parseDouble(numero);
                double resultado = moedasDisp.real * moedasDisp.pesoChileno;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + resultado);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[5]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.dolar = Double.parseDouble(numero) * 5.24 ;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + moedasDisp.dolar);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[6]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.euro = Double.parseDouble(numero) * 5.52;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + moedasDisp.euro);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[7]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.libras = Double.parseDouble(numero) * 6.39;
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + moedasDisp.libras);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[8]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.pesoArg = Double.parseDouble(numero) * 0.031;     
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + moedasDisp.pesoArg);
            }
            if (conversor.moedasInput == conversor.moedasEscolhas[9]) {
                String numero = JOptionPane.showInputDialog("Digite um valor");
                moedasDisp.pesoChileno = Double.parseDouble(numero) * 0.0061;
                
                JOptionPane.showMessageDialog(null, "O valor da conversao e de: " + moedasDisp.pesoChileno);
            }
        
        
        
        }

    }
}
