package com.dragan.ipainter.backend_classes_main;

/**
 * Created by Dragan on 1/18/2018.
 */

public class Room {

    private String name;
    private boolean hasCeiling;
    private boolean hasWalls;

    private Ceiling ceiling;
    private Walls walls;

    /**
     * Basic constructor with no parameters
     */
    public Room()
    {
        this.hasCeiling = false;
        this.hasWalls = false;

        this.ceiling = new Ceiling();
        this.walls = new Walls();
    }

    /**
     * Constructor used to create an instance with known name
     * @param name The name of the room that is to be created
     */
    public Room(String name)
    {
        this();
        this.name = name;
    }

    /**
     * Constructor used to create an instance with known name and ceiling object
     *
     * @param name The name of the room
     * @param ceiling The Ceiling object that will represent data regarding the room's ceiling
     */
    public Room(String name, Ceiling ceiling)
    {
        this(name);
        this.ceiling = ceiling;

        this.hasCeiling = true;

    }

    /**
     * Constructor used to create an instance with known name and walls object
     *
     * @param name The name of the room
     * @param walls The Walls object that will represent data regarding the room's walls
     */
    public Room(String name, Walls walls)
    {
        this(name);
        this.walls = walls;

        this.hasWalls = true;
    }

    /**
     * Constructor used to create an instance with known name, ceiling object and walls object
     *
     * @param name The name of the room
     * @param ceiling The Ceiling object that will represent data regarding the room's ceiling
     * @param walls The Walls object that will represent data regarding the room's walls
     */
    public Room(String name, Ceiling ceiling, Walls walls)
    {
        this(name);
        this.walls = walls;
        this.ceiling = ceiling;

        this.hasWalls = true;
        this.hasCeiling = true;
    }

    public void init()
    {
        this.hasCeiling = false;
        this.hasWalls = false;
    }

    ////////////////////////////////////////////
    ////////////////////////////////////////////
    /// IMPORTANT FUNCTIONAL METHODS GO HERE ///
    ////////////////////////////////////////////
    ////////////////////////////////////////////

    /**
     * Method used to add ceiling to be worked on for the current room
     * @param ceiling The newly created Ceiling object that is to be added to the room
     */
    public void addCeiling(Ceiling ceiling)
    {
        this.ceiling = ceiling;
        this.hasCeiling = true;
    }

    /**
     * Method used to add walls to be worked on for the current room
     * @param walls The newly created Walls object that is to be added to the room
     */
    public void addWalls(Walls walls)
    {
        this.walls = walls;
        this.hasWalls = true;
    }




}
