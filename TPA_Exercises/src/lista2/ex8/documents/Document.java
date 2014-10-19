/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex8.documents;

/**
 *
 * @author marcos
 */
public interface Document {
    public String readLine();
    public boolean hasNextLine();
    public void setNewDoc(String fileName);
    public void close();    
}
