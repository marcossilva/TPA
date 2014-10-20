package lista2.ex8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lista2.ex8.documents.Document;
import lista2.ex8.documents.TextDocument;
import lista2.ex8.profiles.KGramProfile;

/**
 *
 * @author marcos
 * @time 2:26:06 AM
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File t = new File("/media/marcos/88A48BFAA48BE950/Users/Marcos/Documents/NetBeansProjects/TPA/TPA_Exercises/textsEx8/");        
        List<Document> o = new ArrayList<>();        
        String[] files = t.list();
        for (String file : files) {
            o.add(new TextDocument(t.getAbsolutePath() + File.separator + file));
        }
        Profiler p = new Profiler(o);
        double[][] mat = p.similarity(new KGramProfile(500));
        for (int i = 0; i < mat.length; i++) {            
            for (int j = 0; j < mat.length; j++) {                
                System.out.printf("%.4f ",(mat[i][j]/10000000000.0));
            }
            System.out.println("");
        }
        /**
         * a) Caso sejam necessários outros documentos para a comparação basta
         * inicializar novos documentos na lista passado para o Profiler;
         * b) Caso seja necessário trabalhar com outros documentos basta criar
         * uma nova classe que siga a interface Document que esse novo tipo de
         * documento poderá ser usado no programa;
         * c) Caso novas métricas sejam necessárias basta implementar uma nova
         * classe de métricas que sigam a interface Profile;
         * d) Os dados da comparação dados pelo Profiler são uma matriz de double
         * impressa na tela pela função principal, daí basta alterar a forma de
         * impressão na mesma;
         * e) As configurações podem ser feitas em tempo de execução se os
         * devidos objetos forem criados e passados através das chamadas do Profile.
         *
         */
//        Profiler p = new Profiler(null);
        /**
         * a) Caso sejam necessários outros documentos para a comparação basta
         * inicializar novos documentos na lista passado para o Profiler;
         * b) Caso seja necessário trabalhar com outros documentos basta criar
         * uma nova classe que siga a interface Document que esse novo tipo de
         * documento poderá ser usado no programa;
         * c) Caso novas métricas sejam necessárias basta implementar uma nova 
         * classe de métricas que sigam a interface Profile;
         * d) Os dados da comparação dados pelo Profiler são uma matriz de double
         * impressa na tela pela função principal, daí basta alterar a forma de 
         * impressão na mesma;
         * e) As configurações podem ser feitas em tempo de execução se os 
         * devidos objetos forem criados e passados através das chamadas do Profile.
         * 
         */
    }
}
