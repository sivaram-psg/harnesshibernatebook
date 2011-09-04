package com.oreilly.hh.data;
// Generated 5 Jul, 2011 11:49:24 PM by Hibernate Tools 3.2.0.b9


import java.util.Date;

/**
 *    Represents a single playable track in the music database
 *    @author Sivaram
 *    
 */
public class Track  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 8196799461329225704L;
	private int id;
     private String title;
     private String filepath;
     /**
      * Playing Time
     */
     private Date playTime;
     /**
      * when the track was created
     */
     private Date added;
     /**
      * How loud the track is played
 *   
     */
     private short volume;

    public Track() {
    }

	
    public Track(String title, String filepath, short volume) {
        this.title = title;
        this.filepath = filepath;
        this.volume = volume;
    }
    public Track(String title, String filepath, Date playTime, Date added, short volume) {
       this.title = title;
       this.filepath = filepath;
       this.playTime = playTime;
       this.added = added;
       this.volume = volume;
    }
   
    public int getId() {
        return this.id;
    }
    
    protected void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFilepath() {
        return this.filepath;
    }
    
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    /**       
     *      * Playing Time
     */
    public Date getPlayTime() {
        return this.playTime;
    }
    
    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }
    /**       
     *      * when the track was created
     */
    public Date getAdded() {
        return this.added;
    }
    
    public void setAdded(Date added) {
        this.added = added;
    }
    /**       
     *      * How loud the track is played
     *   
     */
    public short getVolume() {
        return this.volume;
    }
    
    public void setVolume(short volume) {
        this.volume = volume;
    }




}


