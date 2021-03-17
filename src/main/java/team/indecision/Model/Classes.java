package team.indecision.Model;

import java.io.Serializable;
import java.util.SortedMap;
import java.util.TreeMap;


/** Represents a collection of Class objects in the UML model.
 * @author Connor Nissley, Ian Reger, Alex Stone, Araselli Morales, Rohama Getachew 
 * @version 1.0
 * @since 1.0
 */
public class Classes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// stores a SortedMap of class objects.
	private SortedMap<String, Class> classes = new TreeMap<String, Class>();
	private SortedMap<String, Class> backup = new TreeMap<String, Class>();
	
	/** Constructs an uninitialized instance of the object.
	 * 
	 */
	public Classes () {
		
	}
	
	/** Constructs a classes map with a specified name.
	 * @param classesP The classes map name.
	 */
	public Classes(SortedMap<String, Class> classesP) {
		classes = classesP;
	}
	
	public Classes(SortedMap<String, Class> classesP, SortedMap<String, Class> backupP) {
		classes = classesP;
		backup = backupP;
	}
	
	public void setBackup(SortedMap<String, Class> newBackup) {
		backup = newBackup;
	}
	
	public SortedMap<String, Class> getBackup() {
		return backup;
	}
	
	/** Gets the classes's map.
	 * @return A Map that stores all class objects.
	 */
	public SortedMap<String, Class> getClasses() {
		return classes;
	}
	
	/** Sets the classes's map.
	 * @param newClasses A Map that stores all class objects.
	 */
	public void setClasses(SortedMap<String, Class> newClasses) {
		classes = newClasses;
	}
}