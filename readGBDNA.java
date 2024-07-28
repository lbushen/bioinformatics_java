/*
Class Name: BIFS 618
File name: readFastaDNA.java

*/

import org.biojava.bio.BioException;
import org.biojavax.bio.seq.RichSequence;
import org.biojavax.bio.seq.RichSequenceIterator;
import org.biojavax.bio.seq.RichSequence.IOTools;

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class readGBDNA{

    private static JFileChooser ourChooser = new JFileChooser(".");

    /**
    * Open a file through a FileChooser
    */
    public static BufferedReader openFile(){
        int retval = ourChooser.showOpenDialog(null);
        BufferedReader br = null;

        if (retval == JFileChooser.APPROVE_OPTION){
            File file = ourChooser.getSelectedFile();
            try {
              br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
              System.out.println("trouble reading "+file.getName());
              e.printStackTrace();
            }
        }   
        return br;
    }


    public static void main(String[] args) throws BioException{
        BufferedReader br = openFile();

        RichSequenceIterator it =  IOTools.readFastaDNA(br, null);

        int count = 0;

        while (it.hasNext()){
            count++;
            RichSequence s = it.nextRichSequence();
            System.out.println("Accession: " + s.getAccession() + 
                              "\nLength: " + s.length());
            System.out.println("Sequence: \n" + s.seqString());
        }
       System.out.println("# sequences read: "+count);     
    }
}
