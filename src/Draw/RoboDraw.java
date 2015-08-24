package Draw;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.Canvas;


public class RoboDraw {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoboDraw window = new RoboDraw();
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
	public RoboDraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 562, 431);
		tabbedPane.setBackground(UIManager.getColor("CheckBox.background"));
		
		JPanel jpanel1 = createInnerPanel1();
		tabbedPane.addTab("Words", jpanel1);
		jpanel1.setLayout(null);
		
		JPanel jpanel2 = createInnerPanel2();
		tabbedPane.addTab("Images", jpanel2);
		
		JPanel jpanel3 = createInnerPanel3();
		tabbedPane.addTab("Canvas", jpanel3);
		
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		frame.getContentPane().add(tabbedPane);
		
	}
	/*
	 * create panel for first tab of tabbedpanel
	 */
	protected JPanel createInnerPanel1(){
		JPanel jpanel = new JPanel();
		
		//create text box
		JTextField txtContent = new JTextField();
		txtContent.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtContent.setBounds(10, 11, 531, 104);
		jpanel.add(txtContent);
		txtContent.setColumns(10);
		//create command button
		JButton btnDraw = new JButton("Draw");
		btnDraw.setBounds(452, 154, 89, 23);
		jpanel.add(btnDraw);
		
		return(jpanel);
	}
	
	/*
	 * create panel for second tab of tabbedpanel
	 */
	protected JPanel createInnerPanel2(){
		JPanel jpanel = new JPanel();
		jpanel.setLayout(null);
		

		//create command button
		JButton btnDraw = new JButton("Draw");
		btnDraw.setBounds(435, 57, 112, 23);
		jpanel.add(btnDraw);
		
		JButton btnOpenImage = new JButton("Open Image");
		btnOpenImage.setBounds(435, 11, 112, 23);
		jpanel.add(btnOpenImage);
		
		
		return(jpanel);
	}
	
	/*
	 * create panel for second tab of tabbedpanel
	 */
	protected JPanel createInnerPanel3(){
		JPanel jpanel = new JPanel();
		jpanel.setLayout(null);
		
		
		Canvas canvas = new Canvas();
		canvas.setBackground(UIManager.getColor("Button.disabledShadow"));
		canvas.setBounds(10, 10, 451, 337);
		canvas.show(true);
		jpanel.add(canvas);
		

		/* /create command button
		JButton btnDraw = new JButton("Draw");
		btnDraw.setBounds(435, 57, 112, 23);
		jpanel.add(btnDraw);*/
		
		
		return(jpanel);
	}
}
