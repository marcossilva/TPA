/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex8;

import lista2.ex8.profiles.Profile;
import java.util.List;
import lista2.ex8.documents.Document;

/**
 *
 * @author marcos
 */
public class Profiler {
    List<Document> docs;

    public Profiler(List<Document> docs) {
        this.docs = docs;
    }
    public int[][] similarity(Profile k){
        int[][] mat = new int[this.docs.size()][this.docs.size()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat.length; j++) {
                mat[i][j] = k.compare(docs.get(i), docs.get(j));
            }
        }
    }
}
