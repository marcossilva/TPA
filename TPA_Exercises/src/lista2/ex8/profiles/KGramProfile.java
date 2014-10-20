package lista2.ex8.profiles;

import java.util.ArrayList;
import java.util.List;
import lista2.ex8.documents.Document;

/**
 *
 * @author marcos
 * @time 7:41:24 PM
 */
public class KGramProfile implements Profile {

    private int l;

    public KGramProfile(int l) {
        this.l = l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public double compare(Document a, Document b) {
        String docA, docB;
        List<Integer> hashA = new ArrayList<>();
        List<Integer> hashB = new ArrayList<>();
        while (a.hasNextLine(l) || b.hasNextLine(l)) {
            if (a.hasNextLine(l)) {
                docA = a.readLine(l);
            } else {
                docA = "";
            }
            if (b.hasNextLine(l)) {
                docB = b.readLine(l);
            } else {
                docB = "";
            }
            hashA.add(docA.hashCode());
            System.out.println(docA.hashCode());
            System.out.println(docB.hashCode());
            System.out.println("");
            hashB.add(docB.hashCode());
        }
        //Calcular distancia vetorial entre hashA e hashB
        double distVet = 0;
        for (int i = 0; i < hashA.size(); i++) {
            distVet += Math.pow(hashA.get(i) - hashB.get(i), 2);
        }
        return Math.sqrt(distVet);
    }

}
