package train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;

/**
 *
 * @author igorc
 */
public class train {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf(">>> ");
        String expr = rd.readLine();
        ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
        trainLexer lexer = new trainLexer(input);
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        trainParser parser = new trainParser(tokens);
        trainParser.ProgContext ans = parser.prog();
        System.out.printf(">>> ");
    }
    
}
