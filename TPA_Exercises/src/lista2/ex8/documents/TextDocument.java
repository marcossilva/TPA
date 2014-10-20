/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.ex8.documents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    private String fileName;
    public TextDocument(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.in = new Scanner(new FileReader(fileName));
        this.lastRead = "";
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
        if (lastRead.length() >= chars) {
            String temp = lastRead.substring(0, chars);
            this.lastRead = lastRead.substring(chars);
            return temp;
        } else {
            //Continua a leitura recursivamente ate o numero 
            //especificado de caracteres se alcançado
            if (in.hasNext()) {
                this.lastRead += in.next();
                return this.readLine(chars);
            } else {
                return this.lastRead;
            }            
        }
    }

    @Override
    public boolean hasNextLine(int chars) {
        if (in.hasNext()) {
            return true;
        } else if (lastRead.length() >= chars) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void reset() {
        this.in.close();
        try {
            this.in = new Scanner(new FileInputStream(fileName));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lastRead = "";
    }

}
