/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    /**
     * Implementation of equals method
     */
    @Override public boolean equals(Object obj) {

        if (obj instanceof Location) {
            Location other = (Location) obj;
            return xCoord == other.xCoord && yCoord == other.yCoord;
        }
        return false;
    }

    /**
     * @return a hash code of Location object
     * similar objects will have the same hash code
     */
    @Override public int hashCode() {
        int result = 19;  // random prime number

        // Use another prime to combine
        result = 53 * result + ((Integer)xCoord).hashCode();
        result = 53 * result + ((Integer)yCoord).hashCode();

        return result;
    }
}
