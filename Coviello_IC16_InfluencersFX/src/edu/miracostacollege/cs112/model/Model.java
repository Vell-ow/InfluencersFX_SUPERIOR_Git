package edu.miracostacollege.cs112.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.Scanner;

/**
 * The <code>Model</code> class represents the business logic (data and calculations) of the application.
 * In the Influencers app, it either loads influencer from a CSV file (first load) or a binary file (all
 * subsequent loads).  It is also responsible for saving data to a binary file.
 *
 * @author Michael Paulding
 * @version 1.0
 */
public class Model {
	
	public static final String BINARY_FILE = "Influencers.dat";

	/**
	 * Determines whether the binary file exists and has data (size/length > 0).
	 * @return True if the binary file exists and has data, false otherwise.
	 */
	public static boolean binaryFileHasData()
	{
		// TODO: Create a File reference to the binary file
		// TODO: Return whether the binary file exists and has > 0 size
		return false;
	}

	/**
	 * Populates the list of all influencers from the binary file. This will be called everytime the application loads,
	 * other than the very first time, since it needs initial data from CSV.
	 * @return The list of all influences populated from the binary file
	 */
	public static ObservableList<Influencer> populateListFromBinaryFile()
	{
		ObservableList<Influencer> allInfluencers = FXCollections.observableArrayList();
		// TODO: Create a File reference to the binary file
		// TODO: Check to see if the binary file exists
		// TODO: Instantiate an ObjectInputStream reference to the binary file for reading
		// TODO: Create a temp array of Influencer objects to read from the binary file
		// TODO: Initialize the temp array from the binary file reader.
		// TODO: Add the temp array to the collection of all burritos (list)
		// TODO: Close the binary file reader.
		return allInfluencers;
	}

	/**
	 * Saves the list of all influencers to the binary file. This will be called each time the application stops,
	 * which occurs when the user exits/closes the app.  Note this method is called in the View, by the controller,
	 * during the stop() method.
	 * @return True if the data were saved to the binary file successfully, false otherwise.
	 */
	public static boolean writeDataToBinaryFile(ObservableList<Influencer> allInfluencersList)
	{
		// TODO: Create a File reference to the binary file
		// TODO: Instantiate an ObjectOutputStream reference to the binary file for writing
		// TODO: Create a temp array of Influencer objects to read from the binary file (length should match list size)
		// TODO: Loop through the temp array and initialize each element to the corresponding element in the list
		// TODO: Write the temp array object to the binary file writer
		// TODO: Close the binary file writer and return true.
		// TODO: If an exception occurs, print its message and return false.
		return false;
	}

}
