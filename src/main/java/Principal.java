import com.manoelcampos.retornoboleto.ProcessarBoletos;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Executa a aplicação para ler um arquivo de
 * retorno de boleto e imprimir no terminal.
 * @author manoelcampos
 */
public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBancoBrasil);
        ProcessarBoletos processador2 = new ProcessarBoletos(ProcessarBoletos::lerBancoBradesco);
        URI caminhoArquivo = Principal.class.getResource("banco-brasil-1.csv").toURI();
        URI caminhoArquivo2 = Principal.class.getResource("bradesco-1.csv").toURI();
        processador.processar(caminhoArquivo);
        processador2.processar(caminhoArquivo2);
    }
}
