package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Itinerary {
    private int idItinerary;
    private String itineraryCode;
    private String status;
    private Date itineraryDate;
    private String walkDuration;
    private double itineraryLength;
    private int maxNumberPeople;
    private int maxNumberVisitedSpecie;
    private Collection<ItineraryGuide> itineraryGuidesByIdItinerary;
    private Collection<ItineraryZone> itineraryZonesByIdItinerary;

    @Id
    @Column(name = "id_itinerary", nullable = false)
    public int getIdItinerary() {
        return idItinerary;
    }

    public void setIdItinerary(int idItinerary) {
        this.idItinerary = idItinerary;
    }

    @Basic
    @Column(name = "itinerary_code", nullable = false, length = 12)
    public String getItineraryCode() {
        return itineraryCode;
    }

    public void setItineraryCode(String itineraryCode) {
        this.itineraryCode = itineraryCode;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 12)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "itinerary_date", nullable = false)
    public Date getItineraryDate() {
        return itineraryDate;
    }

    public void setItineraryDate(Date itineraryDate) {
        this.itineraryDate = itineraryDate;
    }

    @Basic
    @Column(name = "walk_duration", nullable = false, length = 20)
    public String getWalkDuration() {
        return walkDuration;
    }

    public void setWalkDuration(String walkDuration) {
        this.walkDuration = walkDuration;
    }

    @Basic
    @Column(name = "itinerary_length", nullable = false, precision = 0)
    public double getItineraryLength() {
        return itineraryLength;
    }

    public void setItineraryLength(double itineraryLength) {
        this.itineraryLength = itineraryLength;
    }

    @Basic
    @Column(name = "max_number_people", nullable = false)
    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    @Basic
    @Column(name = "max_number_visited_specie", nullable = false)
    public int getMaxNumberVisitedSpecie() {
        return maxNumberVisitedSpecie;
    }

    public void setMaxNumberVisitedSpecie(int maxNumberVisitedSpecie) {
        this.maxNumberVisitedSpecie = maxNumberVisitedSpecie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Itinerary itinerary = (Itinerary) o;
        return idItinerary == itinerary.idItinerary &&
                Double.compare(itinerary.itineraryLength, itineraryLength) == 0 &&
                maxNumberPeople == itinerary.maxNumberPeople &&
                maxNumberVisitedSpecie == itinerary.maxNumberVisitedSpecie &&
                Objects.equals(itineraryCode, itinerary.itineraryCode) &&
                Objects.equals(status, itinerary.status) &&
                Objects.equals(itineraryDate, itinerary.itineraryDate) &&
                Objects.equals(walkDuration, itinerary.walkDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItinerary, itineraryCode, status, itineraryDate, walkDuration, itineraryLength, maxNumberPeople, maxNumberVisitedSpecie);
    }

    @OneToMany(mappedBy = "itineraryByIdItinerary")
    public Collection<ItineraryGuide> getItineraryGuidesByIdItinerary() {
        return itineraryGuidesByIdItinerary;
    }

    public void setItineraryGuidesByIdItinerary(Collection<ItineraryGuide> itineraryGuidesByIdItinerary) {
        this.itineraryGuidesByIdItinerary = itineraryGuidesByIdItinerary;
    }

    @OneToMany(mappedBy = "itineraryByIdItinerary")
    public Collection<ItineraryZone> getItineraryZonesByIdItinerary() {
        return itineraryZonesByIdItinerary;
    }

    public void setItineraryZonesByIdItinerary(Collection<ItineraryZone> itineraryZonesByIdItinerary) {
        this.itineraryZonesByIdItinerary = itineraryZonesByIdItinerary;
    }
}
