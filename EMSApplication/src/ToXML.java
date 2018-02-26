import java.io.*;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;


public class ToXML {
	
	  BufferedReader in;
	  StreamResult out;

	  Document xmldoc;
	  Element root;

	  public static void main (String args[]) {
	      new ToXML().doit();
	  }
	  
	  
	  public void doit () {
		    try{
		      in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology2/src/Sample.mydsl"));
		      out = new StreamResult("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology2/src/data.xml"); 
		      initXML();
		      String str;
		      while ((str = in.readLine()) != null) {
		         process(str);
		      }
		      in.close();
		      writeXML();
		     //System.out.println(format("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
		    }
		    catch (Exception e) { e.printStackTrace(); }
		  }
	  
	  
	  public void initXML() throws ParserConfigurationException{
		    
		    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    DOMImplementation impl = builder.getDOMImplementation();

		    xmldoc = impl.createDocument(null, "Schelling_Model", null);
		    root = xmldoc.getDocumentElement();
		  }

		  public void process(String s) {
		    
		    String [] elements = s.trim().split("\\{");
		    String elements2[] = elements;
		    if(!(elements[0].startsWith("experimentDesc")) && !(elements[0].startsWith("factorLevels")) && !(elements[0].startsWith("Description"))){
		    elements2 = elements[0].split(" ");
		    }
		    else{
		    	elements2 = elements[0].split("\\r?\\n");
		    }
		    if(elements2.length >1){
		    Element e0 = xmldoc.createElement(elements2[0].trim());
		    Node n;
		    if(elements2.length > 1){
		    	n = xmldoc.createTextNode(elements2[1]);
		    }
		    else{
		    	n = xmldoc.createTextNode("");
		    }
		    e0.appendChild(n);

		   
		    root.appendChild(e0);
		    }
		    else if (elements2.length == 1 && (elements[0].startsWith("experimentDesc")) || (elements[0].startsWith("factorLevels")) || (elements[0].startsWith("Description"))){
		    	String elements3 = "";
		    	if(elements2[0].startsWith("experimentDesc")) {
		    	    elements3 = "experimentDesc";
		    	}
		    	else if (elements2[0].startsWith("factorLevels")){
		    		elements3 = "factorLevels";
		    	}
		    	else if(elements2[0].startsWith("Description")){
		    		elements3 = "Desscription";
		    	}
		    	else elements3 = elements2[0].trim();
		    	    Element e0 = xmldoc.createElement(elements3);
				    Node n;
				    if(!(elements3.equals(""))){
				    	n = xmldoc.createTextNode(elements2[0].substring(elements3.length()).trim());
				    }
				    else{
				    	n = xmldoc.createTextNode("");
				    }
				    e0.appendChild(n);

				   
				    root.appendChild(e0);
		    	
		    }
		  }
		  
		  
		  
		  public void writeXML() throws TransformerConfigurationException,
          TransformerException {
			  DOMSource domSource = new DOMSource(xmldoc);
			  TransformerFactory tf = TransformerFactory.newInstance();
			  tf.setAttribute("indent-number", 2);
			  Transformer transformer = tf.newTransformer();
			  transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			  transformer.transform(domSource, out);
			   
  }
		  
		  


}
