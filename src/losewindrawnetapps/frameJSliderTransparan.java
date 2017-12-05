/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package losewindrawnetapps;

/**
 *
 * @author Herwin
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class frameJSliderTransparan extends JFrame
{
	private JPanel contentPane;
	private JLabel lblWall;

	/**
	 * Create the frame.
	 */
	public frameJSliderTransparan() {
		setTitle("WinzApps About");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/media/DATA/Kuliah/PENS_Semester 3/PROJECT SEMESTER/Aplikasi (AWT)/LoseWinDrawNetApps/src/losewindrawnetapps/image/wall3.jpg"));
		lblWall.setBounds(0, -12, 643, 396);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
	
					frameJSliderTransparan frame = new frameJSliderTransparan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
