package dk.ihedge.document;

import java.util.Iterator;
import java.util.Map;
import com.lowagie.text.pdf.PdfReader;


public class PDFMetadataReader {
  public String readMetadata(String relativeFilePath) throws Exception {
    PdfReader reader = new PdfReader(relativeFilePath);
    String metadata = null;

    if (reader.getMetadata() == null) {
      System.out.println("No XML Metadata.");
    } 
    else {
      byte[] metadataBytes = reader.getMetadata();
      metadata = new String(reader.getMetadata());
    }

    return metadata;
  }
}
