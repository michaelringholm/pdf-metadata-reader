package dk.ihedge.document;

import java.util.Iterator;
import java.util.Map;


public class PDFMetadataReaderConsole {
  public static void main(String[] args) throws Exception {
    System.out.println("Started....");
    String metadata = new PDFMetadataReader().readMetadata();
    System.out.println(metadata);
    System.out.println("Ended!");
  }
}