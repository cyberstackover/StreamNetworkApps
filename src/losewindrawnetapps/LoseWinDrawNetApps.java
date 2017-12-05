/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package losewindrawnetapps;

/**
 * @author Herwin
 * Hak Cipta dimiliki oleh Muhammad Herwindra Berlian
 * Asal Politeknik Elektronika Negeri Surabaya
 * Jurusan Teknik Komputer - 2210121035
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.activation.DataSource;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ChatClient.Code.ChatClientGUI;
import ChatServer.Code.ChatServerGUI;
import NetworkAdmin.Code.NetworkAdminGUI;
import losewindrawnetapps.frameJSliderTransparan;

public class LoseWinDrawNetApps extends JFrame implements ActionListener //implements manggil interface actionlistener
{
	public String JJ1, JJ2;
	private static JPanel contentPane;
	private static JButton btnClient;
	private static JButton btnServer;
	private static JButton btnExit;
	private static JButton btnNetwork;
	private static JButton btnHelp;
        private static JLabel lblWall;
        private Image image;
        
	public LoseWinDrawNetApps ()
	{
            //    image = new ImageIcon(getClass().getResource("/media/DATA/Kuliah/PENS_Semester 3/PROJECT SEMESTER/Aplikasi (AWT)/LoseWinDrawNetApps/src/losewindrawnetapps/image/wall3.jpg")).getImage();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
		JLabel lbJJ1       = new JLabel ("Main Menu");
		JLabel lbJJ2       = new JLabel ("");             
		
		btnClient           = new JButton ("Chat Client");
		btnServer           = new JButton ("Chat Server");
		btnExit             = new JButton ("exit");
		btnNetwork          = new JButton ("Network Admin");
		btnHelp             = new JButton ("About");
		
		setLayout(null);
		Dimension sizelbJJ1       = lbJJ1.getPreferredSize();
		Dimension sizelbJJ2       = lbJJ2.getPreferredSize();
		
		Dimension sizebtnClient      = btnClient.getPreferredSize();
		Dimension sizebtnServer      = btnServer.getPreferredSize();
		Dimension sizebtnExit        = btnExit.getPreferredSize();
		Dimension sizebtnNetwork     = btnNetwork.getPreferredSize();
		Dimension sizebtnHelp        = btnHelp.getPreferredSize();
		
		lbJJ1.setBounds(20,10, sizelbJJ1.width, sizelbJJ1.height);              
		lbJJ2.setBounds(140,35, sizelbJJ2.width, sizelbJJ2.height);
		
		btnClient.setBounds(70,100, sizebtnClient.width, sizebtnClient.height);
		btnServer.setBounds(180,100, sizebtnServer.width, sizebtnServer.height);
		btnExit.setBounds(350,185, sizebtnExit.width, sizebtnExit.height);
		btnNetwork.setBounds(300,100, sizebtnNetwork.width, sizebtnNetwork.height);
		btnHelp.setBounds(410,185, sizebtnHelp.width, sizebtnHelp.height);
		
		add(lbJJ1);
		add(lbJJ2);
		
		add(btnClient);
		add(btnServer);
		add(btnExit);
		add(btnNetwork);
		add(btnHelp);
		
		btnClient.addActionListener(this);
		btnServer.addActionListener(this);
		btnExit.addActionListener(this);
		btnNetwork.addActionListener(this);
		btnHelp.addActionListener(this);
		setSize(500,250);
		setTitle("LoseWinDraw Aplication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/media/DATA/Kuliah/PENS_Semester 3/PROJECT SEMESTER/Aplikasi (AWT)/LoseWinDrawNetApps/src/losewindrawnetapps/image/wall3.jpg"));
	//	lblWall.setIcon(new ImageIcon("losewindrawapps.image/wall3.jpg"));
                lblWall.setBounds(0, -12, 643, 396);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
            
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== btnClient)
		{
			try
			{
                           
				//form di close - dispose();
                            new   ChatClientGUI ().setVisible(true);
			}
			catch (Exception es)
			{
				es.printStackTrace();	
			}
		}	
		else if(e.getSource()== btnServer)
		{
			try
			{
                            
				//form di close - dispose();
                            new ChatServerGUI ().setVisible(true);
			}
			catch (Exception es)
			{
				es.printStackTrace();	
			}
		}
	
		else if(e.getSource()== btnExit)
		{
			try
			{
				//form di close - dispose();
	
                           System.exit(0);
			}
			catch (Exception es)
			{
				es.printStackTrace();	
			}
		}
		else if(e.getSource()== btnNetwork)
		{
			try
			{
				//form di close - dispose();
                            new NetworkAdminGUI ().setVisible(true);
			}
			catch (Exception es)
			{
				es.printStackTrace();	
			}
		}
		else if(e.getSource()== btnHelp)
		{
			try
			{
				//form di close - dispose();
                                new frameJSliderTransparan().setVisible(true);
			}
			catch (Exception es)
			{
				es.printStackTrace();	
			}
		}
	}
		
	public static void main(String args []) throws Exception
	{
		LoseWinDrawNetApps s = new LoseWinDrawNetApps ();
		s.setVisible(true);
	}
}
