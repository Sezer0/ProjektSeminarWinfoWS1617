
package firstpackage;
import javax.swing.*;

import uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex;

import java.awt.*;
import java.awt.event.*;
class View extends JFrame
{

	JPopupMenu menu;
	JButton jb,jb1;
	JMenuItem m1,m2,m3,m4;
	PS_Winfo_WS1617 ps_Winfo_WS1617 = new PS_Winfo_WS1617();
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
        getContentPane().setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create JButtons
        jb=new JButton("Algorithms");
        
        
        
        // Create a JPopupMenu
        menu=new JPopupMenu();
        
        // Create JMenuItems
        m1=new JMenuItem("Soundex");
        m2=new JMenuItem("Item 2");
        m3=new JMenuItem("Item 3");
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
        // Add ActionListener to JButtons
        jb.addActionListener(a1);
        
        m1.addActionListener(menuListener);
        
        // Add the JButtons
        getContentPane().add(jb);
        
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
    
   /* public static void main(String args[])
    {
        new View();
    }*/
    
    
}