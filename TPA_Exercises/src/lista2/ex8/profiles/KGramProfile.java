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
    public int compare(Document a, Document b) {
        String docA, docB;
        List<Integer> hashA = new ArrayList<>();
        List<Integer> hashB = new ArrayList<>();
        while (a.hasNextLine() || b.hasNextLine()) {
            if (a.hasNextLine()) {
                docA = a.readLine();
            } else {
                docA = "";
            }
            if (b.hasNextLine()) {
                docB = b.readLine();
            } else {
                docB = "";
            }
            hashA.add(docA.hashCode());
            hashB.add(docB.hashCode());
        }
        //Calcular distancia vetorial entre hashA e hashB
        int distVet = 0;
        return distVet;
    }

}
