import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{
	
	ArrayList songComponents = new ArrayList();
	String groupName;
	String groupDescription;
	
	public SongGroup(String groupName, String groupDescription){
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}
	
	public void add(SongComponent songComponent){
		
		songComponents.add(songComponent);
	}
	
	public void remove(SongComponent songComponent){
		
		songComponents.remove(songComponent);
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}
	
	public void displaySongInfo(){
		
		System.out.println(getGroupName() + " " + getGroupDescription()+"\n");
		
		Iterator iterator = songComponents.iterator();
		
		while(iterator.hasNext()){
			
			SongComponent songComponent = (SongComponent) iterator.next();
			songComponent.displaySongInfo();
		}
	}
	
	
}
