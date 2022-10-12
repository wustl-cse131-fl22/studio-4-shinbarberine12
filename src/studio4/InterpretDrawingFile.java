package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shapeType;

		int redComponent, greenComponent, blueComponent;

		boolean isFilled;

		double  parameterOne, parameterTwo, parameterThree, parameterFour;

		shapeType = in.next();
		redComponent = in.nextInt();
		greenComponent = in.nextInt();
		blueComponent = in.nextInt();
		isFilled = in.nextBoolean();
		parameterOne = in.nextDouble();
		parameterTwo = in.nextDouble();
		parameterThree = in.nextDouble();
		parameterFour = in.nextDouble();

		Color ourcolor = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(ourcolor);

		if (shapeType .equals ("rectangle"))
		{
			if (isFilled == true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}
			else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}

		}
		
		if (shapeType .equals ("ellipse"))
		{
			if (isFilled == true) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}

		}
		
		if (shapeType .equals ("triangle"))
		{
			if (isFilled == true) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);	
			}

		}

	}
}
