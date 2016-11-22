
package firstpackage;
import javax.swing.*;

import uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex;

import java.awt.*;
import java.awt.event.*;
class View extends JFrame
{

	JPopupMenu menu;
	JButton jb;
	JMenuItem m1,m2,m3,m4;
	PS_Winfo_WS1617 ps_Winfo_WS1617 = new PS_Winfo_WS1617();
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=380,171
	 */

    public View()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
    	
        // Set frame properties
    	
    	
        setTitle("Menu Button");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        // Create a JPopupMenu
        menu=new JPopupMenu();
        
        // Create JMenuItems
        m1=new JMenuItem("Soundex");
        m2=new JMenuItem("Levenshtein");
        m3=new JMenuItem("Chapman");
        m4=new JMenuItem("Item 4");
        
        // Add JMenuItems to JPopupMenu
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        
        // Create an ActionListener which
        // will be used by two buttons (in common)
        ActionListener a1=new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                // Call the showPopup method
                // This takes ActionEvent to get
                // the event source
                showPopup(ae);
            }
        };
        
        ActionListener menuListener=new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {

            	ps_Winfo_WS1617.algorithmClicked(ae.getActionCommand());	
            
            }
        };
        
        m1.addActionListener(menuListener);
        m2.addActionListener(menuListener);
        // Create JButtons
        jb=new JButton("Algorithms");
        jb.setBounds(10, 34, 83, 23);
        // Add ActionListener to JButtons
        jb.addActionListener(a1);
        
        getContentPane().setLayout(null);
        getContentPane().add(jb);
        
        textField = new JTextField();
        textField.setBounds(129, 35, 123, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Füge Stadt hinzu");
        btnNewButton.setBounds(259, 34, 115, 23);
        getContentPane().add(btnNewButton);
        
        // Set some size and show
        setSize(400,400);
        setVisible(true);
    }
    
    
    private void getAlgorithm (String string){
    	
    	switch (string){
    	
    	case "Soundex": 
    		
    		break;
    	
    	}
    	
    	
    }
    
    // This method does it all!
    private void showPopup(ActionEvent ae)
    {
        // Get the event source
        Component b =(Component)ae.getSource();

        
        // Get the location of the point 'on the screen'
        Point p = b.getLocationOnScreen();
        
        // Show the JPopupMenu via program
        
        // Parameter desc
        // ----------------
        // this - represents current frame
        // 0,0 is the co ordinate where the popup
        // is shown
        menu.show(this,0,0);
        
        // Now set the location of the JPopupMenu
        // This location is relative to the screen
        menu.setLocation(p.x,p.y+b.getHeight());
    }
}