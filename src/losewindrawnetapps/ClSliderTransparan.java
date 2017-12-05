/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package losewindrawnetapps;

/**
 *
 * @author Herwin
 */
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class ClSliderTransparan extends JSlider 
{
	
    public ClSliderTransparan() 
    {
        setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g) 
    {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
        super.paint(g2d);
        g2d.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.dispose();

        super.paintComponent(g);
    }
	
}
