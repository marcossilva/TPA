/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex8.documents;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class TextDocument implements Document {

    private Scanner in;
    private String lastRead;

    public TextDocument(String fileName) {
        in = new Scanner(fileName);
        lastRead = "";
    }

    @Override
    public String readLine() {
        return in.nextLine();
    }

    @Override
    public void setNewDoc(String fileName) {
        in.close();
        in = new Scanner(fileName);
    }

    @Override
    public void close() {
        in.close();
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(TextDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean hasNextLine() {
        return in.hasNextLine();
    }

    @Override
    public String readLine(int chars) {
        if (hasNextLine(chars)) {
            String temp = lastRead.substring(0, chars);
            lastRead = lastRead.substring(chars);
            return temp;
        } else {
            //Continua a leitura recursivamente ate o numero 
            //especificado de caracteres se alcançado
            lastRead += in.next();
            return this.readLine(chars);
        }
    }

    @Override
    public boolean hasNextLine(int chars) {
        if (lastRead.length() >= chars) {
            return true;
        } else {
            return false;
        }
    }

}
