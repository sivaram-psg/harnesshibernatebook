package com.oreilly.hh.data;
// Generated 7 Jul, 2011 12:24:29 AM by Hibernate Tools 3.2.0.b9


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *       Represents a single playable track in the music database.
 *       @author Jim Elliott (with help from Hibernate)
 *     
 */
public class Track  implements java.io.Serializable {


     private int id;
     private String title;
     private String filePath;
     /**
      * Playing time
     */
     private Date playTime;
     private Set<Artist> artists = new HashSet<Artist>(0);
     /**
      * When the track was created
     */
     private Date added;
     /**
      * How loud to play the track
     */
     private short volume;
     private Set<String> comments = new HashSet<String>(0);

    public Track() {
    }

	
    public Track(String title, String filePath, short volume) {
        this.title = title;
        this.filePath = filePath;
        this.volume = volume;
    }
    public Track(String title, String filePath, Date playTime, Set<Artist> artists, Date added, short volume, Set<String> comments) {
       this.title = title;
       this.filePath = filePath;
       this.playTime = playTime;
       this.artists = artists;
       this.added = added;
       this.volume = volume;
       this.comments = comments;
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
    public String getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    /**       
     *      * Playing time
     */
    public Date getPlayTime() {
        return this.playTime;
    }
    
    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }
    public Set<Artist> getArtists() {
        return this.artists;
    }
    
    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }
    /**       
     *      * When the track was created
     */
    public Date getAdded() {
        return this.added;
    }
    
    public void setAdded(Date added) {
        this.added = added;
    }
    /**       
     *      * How loud to play the track
     */
    public short getVolume() {
        return this.volume;
    }
    
    public void setVolume(short volume) {
        this.volume = volume;
    }
    public Set<String> getComments() {
        return this.comments;
    }
    
    public void setComments(Set<String> comments) {
        this.comments = comments;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("title").append("='").append(getTitle()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


