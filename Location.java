public class Location
{
    public int xCoord;
    public int yCoord;
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }
    public Location()
    {
        this(0, 0);
    }
    
    public boolean equals(Object obj) {       
        if (obj instanceof Location){
            Location other = (Location) obj;
            if (xCoord == other.xCoord && yCoord == other.yCoord) {
                return true;
            }
		}              
        return false;
    }
    public int hashCode() {
        int result = 19; 
        result = 53 * result + xCoord;
        result = 53 * result + yCoord;
        return result;
    }
}
