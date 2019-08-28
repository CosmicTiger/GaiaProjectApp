package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Itinerary_Zone", schema = "GaiaDatabase", catalog = "")
public class ItineraryZone {
    private int idItineraryZone;
    private int idZone;
    private int idItinerary;
    private Zone zoneByIdZone;
    private Itinerary itineraryByIdItinerary;

    @Id
    @Column(name = "id_itinerary_zone", nullable = false)
    public int getIdItineraryZone() {
        return idItineraryZone;
    }

    public void setIdItineraryZone(int idItineraryZone) {
        this.idItineraryZone = idItineraryZone;
    }

    @Basic
    @Column(name = "id_zone", nullable = false)
    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Basic
    @Column(name = "id_itinerary", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "id_zone", referencedColumnName = "id_zone", nullable = false , insertable = false, updatable = false)
    public Zone getZoneByIdZone() {
        return zoneByIdZone;
    }

    public void setZoneByIdZone(Zone zoneByIdZone) {
        this.zoneByIdZone = zoneByIdZone;
    }

    @ManyToOne
    @JoinColumn(name = "id_itinerary", referencedColumnName = "id_itinerary", nullable = false , insertable = false, updatable = false)
    public Itinerary getItineraryByIdItinerary() {
        return itineraryByIdItinerary;
    }

    public void setItineraryByIdItinerary(Itinerary itineraryByIdItinerary) {
        this.itineraryByIdItinerary = itineraryByIdItinerary;
    }
}
