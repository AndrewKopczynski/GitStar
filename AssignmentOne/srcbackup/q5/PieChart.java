package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** PieChart.java 
 * - Generates a pie chart with 8 slices.
 * 
 * @author Andrew P. Kopczynski
 * @version 1.0 */
public class PieChart {
	/** Describes the size of the frame. */
	public static final Dimension FRAME_SIZE = new Dimension(310, 310);
	
	/** Calls DrawCircle to draw a piechart, then adds
	 * it to the frame.
	 * 
	 * @param args unused*/
	public static void main(String[] args) {
		
		JFrame frameChart = new JFrame("Pie Chart");
		frameChart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameChart.setSize(FRAME_SIZE);

		frameChart.getContentPane().add(new DrawCircle());
		frameChart.setVisible(true);
	}
}

/** Draws a chart when called upon.
 *  
 * @author Andrew P. Kopczynski
 * @version 1.0*/
class DrawCircle extends JPanel {
	
	/** Serial ID, required. */
	private static final long serialVersionUID = 4923049032904L;
	/** Height/Width of circle in pixels. */
	private static final int C_SIZE = 250;
	/** Size of a slice in degrees.
	 * <p>
	 * Positive values go CCW, negative values go CW.  */
	private static final int C_ARC_LENGTH = -45;
	/** Defines where the cirlce should begin to be drawn from.
	 *  Measured in pixels. */
	private static final int C_POS = 20;
	
	/** paintComponent is called whenever the chart is drawn,
	 * so this is called when getContent pane calls for a new
	 * drawCircle.
	 * <p>
	 * Sets a colour, then uses the constants defined before
	 * in order to draw 1/8th of the circle. Repeats 7 more
	 * times.
	 * 
	 * @param g Graphics, required. */
    public void paintComponent(Graphics g) {
        
    	super.paintComponent(g);
    	
    	// rMem is used for the starting angle to begin to draw arcs from.
        int rMem = 0;
        
        g.setColor(Color.green);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 1
  
        g.setColor(Color.blue);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 2
        
        g.setColor(Color.cyan);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 3
        
        g.setColor(Color.magenta);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 4
        
        g.setColor(Color.pink);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 5
        
        g.setColor(Color.red);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 6
        
        g.setColor(Color.orange);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 7
        
        g.setColor(Color.yellow);
        g.fillArc(C_POS, C_POS, C_SIZE, C_SIZE, rMem, C_ARC_LENGTH);
        rMem += C_ARC_LENGTH; // 8 
    }
}
