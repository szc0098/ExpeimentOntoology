import java.io.BufferedReader;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class batchXMLGenerator {
	  BufferedReader in;
	  StreamResult out;

	  Document xmldoc;
	  Element root;
	  Element e0;
	  String str;
	  String first = "";
	  String last = "";
	  int step = 0;
	  int flag = 0;

	  public static void main (String args[]) {
	      new batchXMLGenerator().doit();
	  }
	  
	  public void doit () {
		    try{
		      in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
		      out = new StreamResult("C:/RepastSimphony-2.2/models/Schelling/batch/batch_params.xml");
		      initXML();
		      
		      e0 = xmldoc.createElement("sweep");
		      xmldoc.appendChild(e0);
		      Attr e0Attr = xmldoc.createAttribute("runs");
		      e0Attr.setValue("1");
			  e0.setAttributeNode(e0Attr); 
		      
		      
		      if ((str = in.readLine()) != null) {
		         process(str);
		      }
		      in.close();
		      writeXML();
		       }
		    catch (Exception e) { e.printStackTrace(); }
		  }
	  
	  public void initXML() throws ParserConfigurationException{
		    
		    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    DOMImplementation impl = builder.getDOMImplementation();

		    //xmldoc = impl.createDocument(null, "Schelling_Model", null);
		    xmldoc = builder.newDocument();
		    root = xmldoc.getDocumentElement();
		  }
	  
	  public void process(String s) {
		  try{
		  while ((str = in.readLine()) != null) {
		      
		  String [] elements = str.trim().split(">");
		  String elements2[] = elements; 
		  if (elements2.length > 1 && (elements[1].startsWith("percentLikeNeighbor"))){
		  
		  String nodeValue ="";
		  String value = in.readLine();
		  String []value1 = value.trim().split(">");
		  while(value1.length >=1){
		  if(value1.length > 1 && (value1[0].startsWith("<valueRange"))){
			  String []temp = value1[1].split("<");
			  nodeValue = temp[0];
			  break;
		  }
		  else 
			  value = in.readLine();
		      value1 = value.trim().split(">");
		  }
		  
		  Element e1 = xmldoc.createElement("parameter");
		  e0.appendChild(e1);
		  Attr e1Attr1 =xmldoc.createAttribute("valueRange");
		  e1Attr1.setNodeValue(nodeValue);
		  e1.setAttributeNode(e1Attr1);
		  Attr e1Attr2 =xmldoc.createAttribute("type");
		  e1Attr2.setNodeValue("constant");
		  e1.setAttributeNode(e1Attr2);
		  Attr e1Attr3 =xmldoc.createAttribute("constant_type");
		  e1Attr3.setNodeValue("double");
		  e1.setAttributeNode(e1Attr3);
		  Attr e1Attr4 =xmldoc.createAttribute("name");
		  e1Attr4.setNodeValue("percentLikeNeighbors");
		  e1.setAttributeNode(e1Attr4);
		  in.close();
		  in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
		  break;
	  
		  
		  } 
		  }
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
		  
		  try{
			  while ((str = in.readLine()) != null) {   
			  String [] elements = str.trim().split(">");
			  String elements2[] = elements; 
			  if (elements2.length > 1 && (elements[1].startsWith("initialNoOfAgents"))){
			  
			  String nodeValue ="";
			  String value = in.readLine();
			  String []value1 = value.trim().split(">");
			  while(value1.length >=1){
			  if(value1.length > 1 && (value1[0].startsWith("<valueRange"))){
				  String []temp = value1[1].split("<");
				  nodeValue = temp[0];
				  break;
			  }
			  else 
				  value = in.readLine();
			      value1 = value.trim().split(">");
			  }
			  
			  Element e1 = xmldoc.createElement("parameter");
			  e0.appendChild(e1);
			  Attr e1Attr1 =xmldoc.createAttribute("valueRange");
			  e1Attr1.setNodeValue(nodeValue);
			  e1.setAttributeNode(e1Attr1);
			  Attr e1Attr2 =xmldoc.createAttribute("type");
			  e1Attr2.setNodeValue("constant");
			  e1.setAttributeNode(e1Attr2);
			  Attr e1Attr3 =xmldoc.createAttribute("constant_type");
			  e1Attr3.setNodeValue("double");
			  e1.setAttributeNode(e1Attr3);
			  Attr e1Attr4 =xmldoc.createAttribute("name");
			  e1Attr4.setNodeValue("initialNumAgents");
			  e1.setAttributeNode(e1Attr4);
			  in.close();
			  in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
			  break;
		  
			  
			  } 
			  }
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  
		  try{
			  while ((str = in.readLine()) != null) {   
			  String [] elements = str.trim().split(">");
			  String elements2[] = elements; 
			  if (elements2.length > 1 && (elements[1].startsWith("worldWidth"))){
			  
			  String nodeValue ="";
			  String value = in.readLine();
			  String []value1 = value.trim().split(">");
			  while(value1.length >=1){
			  if(value1.length > 1 && (value1[0].startsWith("<valueRange"))){
				  String []temp = value1[1].split("<");
				  nodeValue = temp[0];
				  break;
			  }
			  
			  else 
				  value = in.readLine();
			      value1 = value.trim().split(">");
			  }
			  
			  Element e1 = xmldoc.createElement("parameter");
			  e0.appendChild(e1);
			  Attr e1Attr1 =xmldoc.createAttribute("valueRange");
			  e1Attr1.setNodeValue(nodeValue);
			  e1.setAttributeNode(e1Attr1);
			  Attr e1Attr2 =xmldoc.createAttribute("type");
			  e1Attr2.setNodeValue("constant");
			  e1.setAttributeNode(e1Attr2);
			  Attr e1Attr3 =xmldoc.createAttribute("constant_type");
			  e1Attr3.setNodeValue("double");
			  e1.setAttributeNode(e1Attr3);
			  Attr e1Attr4 =xmldoc.createAttribute("name");
			  e1Attr4.setNodeValue("worldWidth");
			  e1.setAttributeNode(e1Attr4);
			  in.close();
			  in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
			  break;
		  
			  
			  } 
			  }
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  
		  try{
			  while ((str = in.readLine()) != null) {   
			  String [] elements = str.trim().split(">");
			  String elements2[] = elements; 
			  if (elements2.length > 1 && (elements[1].startsWith("minDeathAge"))){
			  
			  String nodeValue ="";
			  String value = in.readLine();
			  String []value1 = value.trim().split(">");
			  while(value1.length >=1){
			  if(value1.length > 1 && (value1[0].startsWith("<valueRange"))){
				  String []temp = value1[1].split("<");
				  nodeValue = temp[0];
				  break;
			  }
			  else if( (value1[0].startsWith("<factorLevels"))){
				  String []temp = value1[1].split("<");
				  String temp2[] = temp[0].split(",");
				  first = temp2[0];
				  last = temp2[temp2.length -1];
				  step =temp2.length;
				  nodeValue = temp[0];
				  flag =2;
				  break;
			  }
			  else 
				  value = in.readLine();
			      value1 = value.trim().split(">");
			  }
			  
			  Element e1 = xmldoc.createElement("parameter");
			  e0.appendChild(e1);
			  Attr e1Attr =xmldoc.createAttribute("name");
			  e1Attr.setNodeValue("minDeathAge");
			  e1.setAttributeNode(e1Attr);
			  if(flag ==1){
			  Attr e1Attr1 =xmldoc.createAttribute("valueRange");
			  e1Attr1.setNodeValue(nodeValue);
			  e1.setAttributeNode(e1Attr1);
			  Attr e1Attr2 =xmldoc.createAttribute("type");
			  e1Attr2.setNodeValue("constant");
			  e1.setAttributeNode(e1Attr2);
			  Attr e1Attr3 =xmldoc.createAttribute("constant_type");
			  e1Attr3.setNodeValue("double");
			  e1.setAttributeNode(e1Attr3);
			  }
			  else if(flag == 2){
				  Attr e1Attr1 =xmldoc.createAttribute("start");
				  e1Attr1.setNodeValue(first);
				  e1.setAttributeNode(e1Attr1);
				  Attr e1Attr2 =xmldoc.createAttribute("end");
				  e1Attr2.setNodeValue(last);
				  e1.setAttributeNode(e1Attr2);
				  Attr e1Attr3 =xmldoc.createAttribute("step");
				  e1Attr3.setNodeValue(Integer.toString((step-1)));
				  e1.setAttributeNode(e1Attr3);
				  Attr e1Attr4 =xmldoc.createAttribute("type");
				  e1Attr4.setNodeValue("number");
				  e1.setAttributeNode(e1Attr4);
				  Attr e1Attr5 =xmldoc.createAttribute("number_type");
				  e1Attr5.setNodeValue("int");
				  e1.setAttributeNode(e1Attr5);
				  
			  }
			  in.close();
			  in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
			  break;
		  
			  
			  } 
			  }
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  
		  try{
			 
			  while ((str = in.readLine()) != null) {   
			  String [] elements = str.trim().split(">");
			  String elements2[] = elements; 
			  if (elements2.length > 1 && (elements[1].startsWith("maxDeathAge"))){
			  
			  String nodeValue ="";
			  
			  String value = in.readLine();
			  String []value1 = value.trim().split(">");
			  while(value1.length >=1){
			  if(value1.length > 1 && (value1[0].startsWith("<valueRange"))){
				  String []temp = value1[1].split("<");
				  nodeValue = temp[0];
				  flag =1;
				  break;
			  }
			  
			  else if( (value1[0].startsWith("<factorLevels"))){
				  String []temp = value1[1].split("<");
				  String temp2[] = temp[0].split(",");
				  first = temp2[0];
				  last = temp2[temp2.length -1];
				  step =temp2.length;
				  nodeValue = temp[0];
				  flag =2;
				  break;
			  }
			  else 
				  value = in.readLine();
			      value1 = value.trim().split(">");
			  }
			  
			  Element e1 = xmldoc.createElement("parameter");
			  e0.appendChild(e1);
			  Attr e1Attr =xmldoc.createAttribute("name");
			  e1Attr.setNodeValue("maxDeathAge");
			  e1.setAttributeNode(e1Attr);
			  if(flag ==1){
			  Attr e1Attr1 =xmldoc.createAttribute("valueRange");
			  e1Attr1.setNodeValue(nodeValue);
			  e1.setAttributeNode(e1Attr1);
			  Attr e1Attr2 =xmldoc.createAttribute("type");
			  e1Attr2.setNodeValue("constant");
			  e1.setAttributeNode(e1Attr2);
			  Attr e1Attr3 =xmldoc.createAttribute("constant_type");
			  e1Attr3.setNodeValue("double");
			  e1.setAttributeNode(e1Attr3);
			  }
			  else if(flag == 2){
				  Attr e1Attr1 =xmldoc.createAttribute("start");
				  e1Attr1.setNodeValue(first);
				  e1.setAttributeNode(e1Attr1);
				  Attr e1Attr2 =xmldoc.createAttribute("end");
				  e1Attr2.setNodeValue(last);
				  e1.setAttributeNode(e1Attr2);
				  Attr e1Attr3 =xmldoc.createAttribute("step");
				  e1Attr3.setNodeValue(Integer.toString((step-1)));
				  e1.setAttributeNode(e1Attr3);
				  Attr e1Attr4 =xmldoc.createAttribute("type");
				  e1Attr4.setNodeValue("number");
				  e1.setAttributeNode(e1Attr4);
				  Attr e1Attr5 =xmldoc.createAttribute("number_type");
				  e1Attr5.setNodeValue("int");
				  e1.setAttributeNode(e1Attr5);
				  
			  }
			  in.close();
			  in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
			  break;
		  
			  
			  } 
			  }
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  
		  try{
			  while ((str = in.readLine()) != null) {   
			  String [] elements = str.trim().split(">");
			  String elements2[] = elements; 
			  if (elements2.length > 1 && (elements[1].startsWith("worldHeight"))){
			  
			  String nodeValue ="";
			  String value = in.readLine();
			  String []value1 = value.trim().split(">");
			  while(value1.length >=1){
			  if(value1.length > 1 && (value1[0].startsWith("<valueRange"))){
				  String []temp = value1[1].split("<");
				  nodeValue = temp[0];
				  break;
			  }
			  else 
				  value = in.readLine();
			      value1 = value.trim().split(">");
			  }
			  
			  Element e1 = xmldoc.createElement("parameter");
			  e0.appendChild(e1);
			  Attr e1Attr1 =xmldoc.createAttribute("valueRange");
			  e1Attr1.setNodeValue(nodeValue);
			  e1.setAttributeNode(e1Attr1);
			  Attr e1Attr2 =xmldoc.createAttribute("type");
			  e1Attr2.setNodeValue("constant");
			  e1.setAttributeNode(e1Attr2);
			  Attr e1Attr3 =xmldoc.createAttribute("constant_type");
			  e1Attr3.setNodeValue("double");
			  e1.setAttributeNode(e1Attr3);
			  Attr e1Attr4 =xmldoc.createAttribute("name");
			  e1Attr4.setNodeValue("worldHeight");
			  e1.setAttributeNode(e1Attr4);
			  in.close();
			  in = new BufferedReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/runtime-EclipseXtext/ExperimentOntology/src/data.xml"));
			  break;
		  
			  
			  } 
			  }
			  }
			  catch(Exception e){
				  e.printStackTrace();
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
