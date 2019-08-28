package GaiaProjectAppService.models.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Itinerary {
    private int idItinerary;
    private String itineraryCode;
    private Date itineraryDate;
    private String walkDuration;
    private double itineraryLength;
    private int maxNumberPeople;
    private int maxNumberVisitedSpecie;
    private Collection<ItineraryGuide> itineraryGuidesByIdItinerary;
    private Collection<ItineraryZone> itineraryZonesByIdItinerary;

    public int getIdItinerary() {
        return idItinerary;
    }

    public void setIdItinerary(int idItinerary) {
        this.idItinerary = idItinerary;
    }

    public String getItineraryCode() {
        return itineraryCode;
    }

    public void setItineraryCode(String itineraryCode) {
        this.itineraryCode = itineraryCode;
    }

    public Date getItineraryDate() {
        return itineraryDate;
    }

    public void setItineraryDate(Date itineraryDate) {
        this.itineraryDate = itineraryDate;
    }

    public String getWalkDuration() {
        return walkDuration;
    }

    public void setWalkDuration(String walkDuration) {
        this.walkDuration = walkDuration;
    }

    public double getItineraryLength() {
        return itineraryLength;
    }

    public void setItineraryLength(double itineraryLength) {
        this.itineraryLength = itineraryLength;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

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
                Objects.equals(itineraryDate, itinerary.itineraryDate) &&
                Objects.equals(walkDuration, itinerary.walkDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItinerary, itineraryCode, itineraryDate, walkDuration, itineraryLength, maxNumberPeople, maxNumberVisitedSpecie);
    }

    public Collection<ItineraryGuide> getItineraryGuidesByIdItinerary() {
        return itineraryGuidesByIdItinerary;
    }

    public void setItineraryGuidesByIdItinerary(Collection<ItineraryGuide> itineraryGuidesByIdItinerary) {
        this.itineraryGuidesByIdItinerary = itineraryGuidesByIdItinerary;
    }

    public Collection<ItineraryZone> getItineraryZonesByIdItinerary() {
        return itineraryZonesByIdItinerary;
    }

    public void setItineraryZonesByIdItinerary(Collection<ItineraryZone> itineraryZonesByIdItinerary) {
        this.itineraryZonesByIdItinerary = itineraryZonesByIdItinerary;
    }
}
