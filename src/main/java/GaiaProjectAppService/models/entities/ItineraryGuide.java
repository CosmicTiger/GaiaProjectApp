package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Itinerary_Guide", schema = "GaiaDatabase", catalog = "")
public class ItineraryGuide {
    private int idItineraryGuide;
    private int idGuide;
    private int idItinerary;
    private Guide guideByIdGuide;
    private Itinerary itineraryByIdItinerary;

    @Id
    @Column(name = "id_itinerary_guide", nullable = false)
    public int getIdItineraryGuide() {
        return idItineraryGuide;
    }

    public void setIdItineraryGuide(int idItineraryGuide) {
        this.idItineraryGuide = idItineraryGuide;
    }

    @Basic
    @Column(name = "id_guide", nullable = false)
    public int getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(int idGuide) {
        this.idGuide = idGuide;
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
        ItineraryGuide that = (ItineraryGuide) o;
        return idItineraryGuide == that.idItineraryGuide &&
                idGuide == that.idGuide &&
                idItinerary == that.idItinerary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItineraryGuide, idGuide, idItinerary);
    }

    @ManyToOne
    @JoinColumn(name = "id_guide", referencedColumnName = "id_guide", nullable = false , insertable = false, updatable = false)
    public Guide getGuideByIdGuide() {
        return guideByIdGuide;
    }

    public void setGuideByIdGuide(Guide guideByIdGuide) {
        this.guideByIdGuide = guideByIdGuide;
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
