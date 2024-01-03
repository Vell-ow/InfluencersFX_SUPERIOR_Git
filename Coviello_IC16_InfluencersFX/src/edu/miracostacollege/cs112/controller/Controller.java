package edu.miracostacollege.cs112.controller;

import edu.miracostacollege.cs112.model.Influencer;
import edu.miracostacollege.cs112.model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * The <code>Controller</code> is a Singleton object that relays all commands between the Model and View
 * (and vice versa).  There is only one Controller object, accessible by a call to the static getInstance()
 * method.
 *
 * @author Michael Paulding
 * @version 1.0
 */
public class Controller {

	private static Controller theInstance;
	private ObservableList<Influencer> mAllInfluencersList;

	// TODO: Create private constructor to enforce Singleton pattern

	private Controller() {}


	/**
	 * Gets the one instance of the Controller.
	 * @return The instance
	 */
	public static Controller getInstance() {
		// TODO: If the instance is null, assign it to a new Controller,
		// TODO: then check to see if the binary file has data
		// TODO: If so, assign the mAllInfluencersList to the populateListFromBinaryFile() method
		// TODO: Otherwise, assign it to a new observableArrayList()
		public static Controller getInstance()
		{
			if(theInstance == null)
			{
				theInstance = new Controller();
				// Controller is grabbing data from the Model
			}
			if(binaryFileHasData)
			{

			}
		}
		return theInstance;
	}

	/**
	 * Gets the list of all influencers.
	 * @return The list of all influencers.
	 */
	public ObservableList<Influencer> getAllInfluencers() {
		return mAllInfluencersList;
	}

	/**
	 * Makes a request for the model to save all the influencer data (the list of all influencers) to
	 * a persistent binary file.
	 */
	public void saveData() {
		Model.writeDataToBinaryFile(mAllInfluencersList);
	}
}
