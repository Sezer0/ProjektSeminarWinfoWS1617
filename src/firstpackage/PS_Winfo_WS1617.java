package firstpackage;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PS_Winfo_WS1617 {

 private JFrame frame;
 private static CSVReader csvReader;
 private static Algorithm algorithm = new Algorithm();
 private static View view = new View();
 
 private static ArrayList<csvItem> userList = csvReader.userListReader();
 private static ArrayList <String> staedteList = csvReader.staedteReader();

 
 public static void main(String[] args) throws IOException {
	 csvReader  = new CSVReader();
	
 }

 public static void algorithmClicked(String name){
	 
	switch (name){
	
	case "Soundex":
		
		float percent = algorithm.getAccuray(name, userList, staedteList );
		
		
		break;
	}
		
	 
 }
 
 
 /**
  * Create the application.
  */
 public PS_Winfo_WS1617() {
  initialize();
 }
 
 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame();
  frame.setBounds(100, 100, 450, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

}