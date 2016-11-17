package firstpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class PS_Winfo_WS1617 {

	private JFrame frame;

	/**hello world push push 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PS_Winfo_WS1617 window = new PS_Winfo_WS1617();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
