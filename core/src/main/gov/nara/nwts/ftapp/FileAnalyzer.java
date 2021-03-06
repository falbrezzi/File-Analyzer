package gov.nara.nwts.ftapp;

import gov.nara.nwts.ftapp.gui.DirectoryTable;

import java.io.File;

/**
 * Driver for the GUI version of the file analyzer with file modification rules disabled.
 * This application was originally created by Terry Brady in NARA's Digitization Services Branch.
 * @author TBrady
 *
 */
public class FileAnalyzer {

	public static void main(String[] args) {
		if (args.length > 0)
			new DirectoryTable(new File(args[0]),false);		
		else
			new DirectoryTable(null,false);		
	}

}
