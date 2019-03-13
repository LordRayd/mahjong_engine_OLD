package fr.univubs.inf1603.mahjong.engine;

import java.util.ArrayList;

/**
 * 
 * @author Samuel LE BERRE
 */
public class Board {

    /**
     * The collection of zones present in the Board
     */
    private ArrayList<Zone> listZones;

    /**
     * The collection of tiles present in the Board
     */
    private ArrayList<AbstractTile> listTiles;

    /**
     * 
     */
    public Board() {

    }

    /**
     * Allow to add a zone in the collection
     * @param zone The tile we want to add
     * @return True if the zone has been had correctly
     */
    public boolean addZone(Zone zone) {
        return listZones.add(zone);
    }

    /**
     * Allow to add a tile in the collection
     * @param tile The tile we want to add
     * @return True if the tile has been had correctly
     */
    public boolean addTile(AbstractTile tile) {
        return listTiles.add(tile);
    }

    /**
     * Allows to return an instance of the Board
     * @return The board we want to return
     */
    public Board getBoard() {
        return this;
    }

    /**
     * 
     * @return The collection of zones
     */
    public ArrayList<Zone> getZones() {
        return this.listZones;
    }

    /**
     * 
     * @return The collection of tiles
     */
    public ArrayList<AbstractTile> getTiles() {
        return this.listTiles;
    }
}
