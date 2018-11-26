package castle;

import java.util.HashMap;

public class Room {
    public String description;
    private HashMap<String, Room> Exits = new HashMap<String,Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    
    public void setExit(String dec,Room room) {
    	Exits.put(dec, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String Exitdesc() {
    	StringBuffer ret = new StringBuffer();
    	for(String key : Exits.keySet()) {
    		ret.append(key);
    		ret.append(" ");
    	}
    	 return ret.toString();
    }
    
    public Room getroom(String direction) {
        return Exits.get(direction);
    }
}
