package epam.CleanCodeTask;

import constructioncostestimation.CostWindow;
import intresrtCalculator.IntrestWindow;

/**
 * Clean Code Task
 *  1. Meaningful variable names.
 *  2. Calculate simple Interest and Compound Interests
 *  3.  Cost of Constructing a  House based on the quality of materials
 *  
 */
public class App 
{
    public static void main( String[] args )
    {
    	IntrestWindow intrestwindow = new IntrestWindow();
    	intrestwindow.setVisible(true);
    	intrestwindow.setSize(300, 600);
    	
    	CostWindow costwindow = new CostWindow();
    	costwindow.setVisible(true);
    	costwindow.setSize(300,800);
    }
}
