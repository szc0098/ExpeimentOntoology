import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.transform.stream.StreamResult;

import ishc.Main;
 
public class MenuExp extends JFrame {
	
	//XYSeriesCollection dataset;
    //JFreeChart chart;
   // ChartPanel chartPanel = new ChartPanel(chart);
    //final int chartWidth = 560;
    //final int chartHeight = 367;
    //CSVReader reader;
    //String[] readNextLine;
    //XYSeries series;
     
    public MenuExp() {
         
        setTitle("Design Of Experiment");
        setSize(800, 600);
         
        // Creates a menubar for a JFrame
        JMenuBar menuBar = new JMenuBar();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
         
        // Add the menubar to the frame
        setJMenuBar(menuBar);
         
        // Define and add two drop down menu to the menubar
        
       // Define and add two drop down menu to the menubar
       JMenu fileMenu = new JMenu("File");
       JMenu runMenu = new JMenu("Run");
       JMenu dataMenu = new JMenu("Data");
       JMenu graphMenu = new JMenu("Graphs");
       menuBar.add(fileMenu);
       menuBar.add(runMenu);
       menuBar.add(dataMenu);
       menuBar.add(graphMenu);
        
       // Create and add simple menu item to one of the drop down menu
       
       JMenuItem openAction = new JMenuItem("Open");
       JMenuItem editAction = new JMenuItem("Edit");
       final JMenuItem saveAction = new JMenuItem("Save");
       JMenuItem runAction = new JMenuItem("Run as MASON Model");
       JMenuItem dataAction = new JMenuItem("Results of the run");
       JMenuItem graph1 = new JMenuItem("LPS vs Time");
       JMenuItem graph2 = new JMenuItem("Cytokine vs Time");
       JMenuItem graph3 = new JMenuItem("Cytokine vs LPS");
       
      // fileMenu.add(newAction);
       fileMenu.add(openAction);
       fileMenu.addSeparator();
       fileMenu.add(editAction);
       fileMenu.addSeparator();
       fileMenu.add(saveAction);

       dataMenu.add(dataAction);
       
       graphMenu.add(graph1);
       graphMenu.addSeparator();
       graphMenu.add(graph2);
       graphMenu.addSeparator();
       graphMenu.add(graph3);
       
       runMenu.add(runAction);
       
       final JTextArea openTextArea = new JTextArea(30,60);
       final JPanel convertArea = new JPanel();
       convertArea.setPreferredSize(new java.awt.Dimension (500, 60));
       convertArea.setAlignmentX(RIGHT_ALIGNMENT);
       convertArea.setAlignmentY(TOP_ALIGNMENT);
       final JTextArea convertTextArea = new JTextArea(30,60);
       final JTextArea outputTextArea = new JTextArea(10,30);
        
        
        // Add a listener to the Open menu item. actionPerformed() method will
        // invoked, if user triggred this menu item
        openAction.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            JFileChooser openFile = new JFileChooser();
            openFile.showOpenDialog(null);
            openFile.getSelectedFile();
            
            try{
            	FileReader reader = new FileReader(new File(openFile.getSelectedFile().toString()));
                BufferedReader br = new BufferedReader(reader);
                openTextArea.read( br, null );
                br.close();
                openTextArea.requestFocus();
                openTextArea.setEditable(false);
            }
            catch(Exception e){
            	
            }
            
    }
        });
        
        editAction.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    openTextArea.setEditable(true); 
                }
                catch(Exception e){	
                }
        }
            });
        
        
        saveAction.addActionListener( new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent arg0){

                JFileChooser saveAs = new JFileChooser();
                saveAs.showSaveDialog(null);
                File filename = saveAs.getSelectedFile();
                int confirmationResult;
                if(filename.exists()) {
                    confirmationResult = JOptionPane.showConfirmDialog(saveAction, "Replace existing file?");
                    if(confirmationResult == JOptionPane.YES_OPTION) {
                    	try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
                            writer.write(openTextArea.getText());
                            writer.close();
                            //saved = true;
                            setTitle("JavaText - " + filename.getName());
                        } catch (IOException err) {
                            err.printStackTrace();
                        }                       
                    }
                } else {
                	try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
                        writer.write(openTextArea.getText());
                        writer.close();
                       // saved = true;
                        setTitle("JavaText - " + filename.getName());
                    } catch (IOException err) {
                        err.printStackTrace();
                    }
                }
            
        	}
        });
        
        
        dataAction.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	try{
            		FileReader reader = new FileReader("C:/Users/sritika/Documents/Research Project/Development/MASON/ISHC model/logs/run-0000.csv" );
                    BufferedReader br = new BufferedReader(reader);
                    outputTextArea.read( br, null );
                    br.close();
                    outputTextArea.requestFocus();
            	}
                    catch(Exception e){
                    	
                    }
            }
            });
        
        runAction.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	try{
            		String[] args={};
            		Main.main(args);
            		System.out.println("Finish!");
            	}
                    catch(Exception e){
                    	
                    }
            }
            });
//        graph1.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//            	try{
//            		dataset = createDatasetLPSvsTime();
//                    chart = createChart1(dataset);
//                    chartPanel = new ChartPanel(chart);
//                    System.out.println("Almost Done");
//                    chartPanel.setPreferredSize(new java.awt.Dimension(500,500));
//                    chartPanel.setVisible(true);
//                    convertArea.add(chartPanel);
//                    System.out.println(" Done");
//            	}
//                    catch(Exception e){
//                    	
//                    }
//            }
//
//			private JFreeChart createChart1(XYSeriesCollection dataset) {
//		        chart = ChartFactory.createXYLineChart("LPS vs Time", // chart
//                        // title
//				"Time", // domain axis label
//				"LPS", // range axis label
//				dataset, // data
//				PlotOrientation.VERTICAL, // the plot orientation
//				true, // legend
//				true, // tooltips
//				false); // urls
//				
//				return chart;
//}
//
//			private XYSeriesCollection createDatasetLPSvsTime()throws NumberFormatException,
//            IOException {
//		        dataset = new XYSeriesCollection();
//		        try {
//		            reader = new CSVReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/MASON/ISHC model/logs/run-0000.csv"),'\t');
//		            readNextLine = reader.readNext();
//
//		            // Set up series
//		            final XYSeries seriesX = new XYSeries("X");
//		            while ((readNextLine = reader.readNext()) != null) {
//		                // add values to dataset
//		            	String value[] = readNextLine[0].split(",");
//		                double Time = Double.valueOf(value[0]);
//		                double X = Double.parseDouble(value[1]);
//		                seriesX.add(Time, X);
//		            }
//
//		            System.out.println(seriesX.getMaxX() + "; " + seriesX.getMaxY());
//
//		            dataset.addSeries(seriesX);
//		           // dataset.addSeries(seriesY);
//		           // dataset.addSeries(seriesZ);
//		        } catch (FileNotFoundException e) {
//		            System.out.println("File not found!");
//		        }
//		        return dataset;
//		    }
//            });
//        
//        
//        graph2.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//            	try{
//            		dataset = createDatasetLPSvsTime();
//                    chart = createChart1(dataset);
//                    chartPanel = new ChartPanel(chart);
////                    convertTextArea.add(chartPanel);
////                    
////                    convertTextArea.requestFocus();
//                    System.out.println("Almost Done");
//                    chartPanel.setPreferredSize(new java.awt.Dimension(500,500));
//                   // setContentPane(chartPanel);
//                    chartPanel.setVisible(true);
//                    convertArea.add(chartPanel);
//                    System.out.println(" Done");
//            	}
//                    catch(Exception e){
//                    	
//                    }
//            }
//
//			private JFreeChart createChart1(XYSeriesCollection dataset) {
//		        chart = ChartFactory.createXYLineChart("Cytokine vs Time", // chart
//                        // title
//				"Time", // domain axis label
//				"Cytokine", // range axis label
//				dataset, // data
//				PlotOrientation.VERTICAL, // the plot orientation
//				true, // legend
//				true, // tooltips
//				false); // urls
//				
//				return chart;
//}
//
//			private XYSeriesCollection createDatasetLPSvsTime()throws NumberFormatException,
//            IOException {
//		        dataset = new XYSeriesCollection();
//		        try {
//		            reader = new CSVReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/MASON/ISHC model/logs/run-0000.csv"),'\t');
//		            // Read the header and chuck it away
//		            readNextLine = reader.readNext();
//
//		            // Set up series
//		            final XYSeries seriesX = new XYSeries("X");
//		           // final XYSeries seriesY = new XYSeries("Y");
//		            //final XYSeries seriesZ = new XYSeries("Z");
//
//		            while ((readNextLine = reader.readNext()) != null) {
//		                // add values to dataset
//		            	String value[] = readNextLine[0].split(",");
//		                double Time = Double.valueOf(value[0]);
//		                double X = Double.parseDouble(value[4]);
//		               // double Y = Double.parseDouble(value[4]);
//		               // double Z = Double.parseDouble(readNextLine[0].);
//		                seriesX.add(Time, X);
//		               // seriesY.add(Time, Y);
//		               // seriesZ.add(X, Y);
//		            }
//
//		            System.out.println(seriesX.getMaxX() + "; " + seriesX.getMaxY());
//
//		            dataset.addSeries(seriesX);
//		           // dataset.addSeries(seriesY);
//		           // dataset.addSeries(seriesZ);
//		        } catch (FileNotFoundException e) {
//		            System.out.println("File not found!");
//		        }
//		        return dataset;
//		    }
//            });
//        
//        graph3.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//            	try{
//            		dataset = createDatasetLPSvsTime();
//                    chart = createChart1(dataset);
//                    chartPanel = new ChartPanel(chart);
////                    convertTextArea.add(chartPanel);
////                    
////                    convertTextArea.requestFocus();
//                    System.out.println("Almost Done");
//                    chartPanel.setPreferredSize(new java.awt.Dimension(500,500));
//                   // setContentPane(chartPanel);
//                    chartPanel.setVisible(true);
//                    convertArea.add(chartPanel);
//                    System.out.println(" Done");
//            	}
//                    catch(Exception e){
//                    	
//                    }
//            }
//
//			private JFreeChart createChart1(XYSeriesCollection dataset) {
//		        chart = ChartFactory.createXYLineChart("Cytokine vs LPS", // chart
//                        // title
//				"LPS", // domain axis label
//				"Cytokine", // range axis label
//				dataset, // data
//				PlotOrientation.VERTICAL, // the plot orientation
//				true, // legend
//				true, // tooltips
//				false); // urls
//				
//				return chart;
//}
//
//			private XYSeriesCollection createDatasetLPSvsTime()throws NumberFormatException,
//            IOException {
//		        dataset = new XYSeriesCollection();
//		        try {
//		            reader = new CSVReader(new FileReader("C:/Users/sritika/Documents/Research Project/Development/MASON/ISHC model/logs/run-0000.csv"),'\t');
//		            // Read the header and chuck it away
//		            readNextLine = reader.readNext();
//
//		            // Set up series
//		            final XYSeries seriesX = new XYSeries("X");
//		           // final XYSeries seriesY = new XYSeries("Y");
//		            //final XYSeries seriesZ = new XYSeries("Z");
//
//		            while ((readNextLine = reader.readNext()) != null) {
//		                // add values to dataset
//		            	String value[] = readNextLine[0].split(",");
//		                double Time = Double.valueOf(value[1]);
//		                double X = Double.parseDouble(value[4]);
//		               // double Y = Double.parseDouble(value[4]);
//		               // double Z = Double.parseDouble(readNextLine[0].);
//		                seriesX.add(Time, X);
//		               // seriesY.add(Time, Y);
//		               // seriesZ.add(X, Y);
//		            }
//
//		            System.out.println(seriesX.getMaxX() + "; " + seriesX.getMaxY());
//
//		            dataset.addSeries(seriesX);
//		           // dataset.addSeries(seriesY);
//		           // dataset.addSeries(seriesZ);
//		        } catch (FileNotFoundException e) {
//		            System.out.println("File not found!");
//		        }
//		        return dataset;
//		    }
//            });
        
        
        
        getContentPane().add( new JScrollPane(openTextArea), BorderLayout.WEST );
        getContentPane().add(new JScrollPane(convertArea), BorderLayout.EAST );
        getContentPane().add(new JScrollPane(outputTextArea), BorderLayout.SOUTH );
        //frame.getContentPane().add(write, BorderLayout.EAST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo( null );
        setVisible(true);
        
        
        
        
   }
    
        
      
    public static void main(String[] args) {
        MenuExp me = new MenuExp();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setVisible(true);
    }
}