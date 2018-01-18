package com.dragan.ipainter.backend_classes_main;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dragan on 1/18/2018.
 */

public class Project implements Parcelable {

    // basic attributes for identification
    private String name;
    private Date startDate;
    private String clientName;
    private String location;

    // functional attributes
    private ArrayList<Room> listOfRooms;

    /**
     * Basic constructor with no parameters
     */
    public Project()
    {
        this.init();
    }

    /**
     * Constructor used to create a project instance with a known name argument
     *
     * @param name The name of the project that is being created
     */
    public Project(String name)
    {
        this();
        this.name = name;
    }

    /**
     * Constructor used to create a project instance with a known name,
     * client name and location
     *
     * @param name The name of the project
     * @param location The location of the project
     * @param clientName The client's name
     */
    public Project(String name, String location, String clientName)
    {
        this(name);
        this.location = location;
        this.clientName = clientName;


    }

    /**
     * Constructor used to create an instance of this class via Parcel object argument
     * @param in
     */
    public Project(Parcel in)
    {
        this.name = in.readString();
        this.clientName = in.readString();
        this.location = in.readString();
        this.startDate = new Date();
    }

    /**
     * Method used to initialize automatically some of the class members
     */
    private void init()
    {
        // basic attributes
        this.startDate = new Date();

        // functional attributes
        this.listOfRooms = new ArrayList<Room>();
    }

    ////////////////////////////////////////////
    ////////////////////////////////////////////
    /// IMPORTANT FUNCTIONAL METHODS GO HERE ///
    ////////////////////////////////////////////
    ////////////////////////////////////////////

    /**
     * Method used to create a new room instance
     * and add it to the list of rooms of this project
     */
    public void addNewRoom(Room room)
    {
        this.listOfRooms.add(room);
    }

    // overriding parcelable interface methods
    @Override
    public int describeContents() {
        return 0;
    }
    // same
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(clientName);
        dest.writeString(location);
    }

    /**
     * Apparently all classes that are implementing the Parcelable interface
     * need to have this CONTRAPTION
     * Cue the contraption below *shrugs*
     */
    public static final Parcelable.Creator<Project> CREATOR =
            new Parcelable.Creator<Project>(){
                public Project createFromParcel(Parcel in) {
                    return new Project(in);
                }

                public Project[] newArray(int size) {
                    return new Project[size];
                }
            };

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(ArrayList<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }
}
