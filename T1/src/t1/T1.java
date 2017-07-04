/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import t1.ast.Train;


/**
 *
 * @author igorc
 */
public class T1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException  {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf(">>> ");
        String expr = rd.readLine();
        ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
        t1Lexer lexer = new t1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        t1Parser parser = new t1Parser(tokens);
        t1Parser.ProgContext ans = parser.prog();
        System.out.printf(">>> ");
    }
}
