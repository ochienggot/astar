import java.util.*;


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
    private HashMap<Location, Waypoint> openWaypoints = new HashMap<>();
    private HashMap<Location, Waypoint> closedWaypoints = new HashMap<>();

    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

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
        float leastCost = Float.MAX_VALUE;
        Waypoint wp = null;

        for (Waypoint openWay : openWaypoints.values()) {
            if (openWay.getTotalCost() < leastCost) {
                wp = openWay;
                leastCost = openWay.getTotalCost();
                }
        }

        return openWaypoints.size() > 0 ? wp : null;
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
        Location loc = newWP.getLocation();

        if (openWaypoints.containsKey(loc)) {
            if (newWP.getPreviousCost() < (openWaypoints.get(loc)).getPreviousCost()) {
                openWaypoints.put(loc, newWP);
                return true;
            }
        } else {
            openWaypoints.put(loc, newWP);
            return true;
        }

        return false;
    }

    /** Returns the current number of open waypoints. **/
    public int numOpenWaypoints()
    {
        // TODO:  Implement.
        return openWaypoints.size();
    }


    /**
     * This method moves the waypoint at the specified location from the
     * open list to the closed list.
     **/
    public void closeWaypoint(Location loc)
    {
        // TODO:  Implement.
        Waypoint wp = openWaypoints.get(loc);
        closedWaypoints.put(loc, wp);
        openWaypoints.remove(loc);
    }

    /**
     * Returns true if the collection of closed waypoints contains a waypoint
     * for the specified location.
     **/
    public boolean isLocationClosed(Location loc)
    {
        // TODO:  Implement.
        return closedWaypoints.containsKey(loc);
        //return false;
    }
}

