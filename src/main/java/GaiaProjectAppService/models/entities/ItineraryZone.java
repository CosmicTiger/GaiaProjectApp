package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class ItineraryZone {
    private int idItineraryZone;
    private int idZone;
    private int idItinerary;
    private Zone zoneByIdZone;
    private Itinerary itineraryByIdItinerary;

    public int getIdItineraryZone() {
        return idItineraryZone;
    }

    public void setIdItineraryZone(int idItineraryZone) {
        this.idItineraryZone = idItineraryZone;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public int getIdItinerary() {
        return idItinerary;
    }

    public void setIdItinerary(int idItinerary) {
        this.idItinerary = idItinerary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItineraryZone that = (ItineraryZone) o;
        return idItineraryZone == that.idItineraryZone &&
                idZone == that.idZone &&
                idItinerary == that.idItinerary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItineraryZone, idZone, idItinerary);
    }

    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }

    public Itinerary getItineraryByIdItinerary() {
        return itineraryByIdItinerary;
    }

    public void setItineraryByIdItinerary(Itinerary itineraryByIdItinerary) {
        this.itineraryByIdItinerary = itineraryByIdItinerary;
    }
}
