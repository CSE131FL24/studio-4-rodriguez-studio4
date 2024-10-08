package studio4;

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
		int[] color = new int[3];
		String shape = in.nextLine();
		for (int i=0;i < 3; i++) {
			color[i] = in.nextInt();
		}
		double[] perameters = new double[3];
		boolean filled = in.nextBoolean();
		for (int i=0;i < 3; i++) {
			perameters[i] = in.nextDouble();
		}
		
	}
}
