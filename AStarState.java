/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map.  This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints."  In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState
{
    // fields for open and closed waypoints initialization
    private HashMap<Location, Waypoint> openWaypoints = new Hashmap<>();
    private HashMap<Location, Waypoint> closeWaypoints = new Hashmap<>();

    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

    /**
     * @return the number of waypoints in the collection of open waypoints
     */
    public int numOpenWaypoints() {
        return openWaypoints.size();
    }

    /**
     * scans thro' all waypoints in the collection of open waypoints
     * @return reference to the waypoint with the smallest cost; if
     * none, return null
     */
    public Waypoint getMinOpenWaypoint() {
        // ToDo
        float leastCost;
        Waypoint wp;
        for (Location openWay : openWaypoints.keySet()) {
            if (get(openWay).remainingCost + 
                get(openWay).prevCost < leastCost) {
                wp = get(openWay);
                leastCost = get(openWay).remainingCost + get(openWay).prevCost;
                }
        }

        return wp;
    }


    }

    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     * This method scans through all open waypoints, and returns the waypoint
     * with the minimum total cost.  If there are no open waypoints, this method
     * returns <code>null</code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        // TODO:  Implement.
        return null;
    }

    /**
     * This method adds a waypoint to (or potentially updates a waypoint already
     * in) the "open waypoints" collection.  If there is not already an open
     * waypoint at the new waypoint's location then the new waypoint is simply
     * added to the collection.  However, if there is already a waypoint at the
     * new waypoint's location, the new waypoint replaces the old one <em>only
     * if</em> the new waypoint's "previous cost" value is less than the current
     * waypoint's "previous cost" value.
     **/
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        // TODO:  Implement.
        return false;
    }


    /** Returns the current number of open waypoints. **/
    public int numOpenWaypoints()
    {
        // TODO:  Implement.
        return 0;
    }


    /**
     * This method moves the waypoint at the specified location from the
     * open list to the closed list.
     **/
    public void closeWaypoint(Location loc)
    {
        // TODO:  Implement.
    }

    /**
     * Returns true if the collection of closed waypoints contains a waypoint
     * for the specified location.
     **/
    public boolean isLocationClosed(Location loc)
    {
        // TODO:  Implement.
        return false;
    }
}

