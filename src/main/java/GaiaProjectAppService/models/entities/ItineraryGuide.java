package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class ItineraryGuide {
    private int idItineraryGuide;
    private int idGuide;
    private int idItinerary;
    private Guide guideByIdGuide;
    private Itinerary itineraryByIdItinerary;

    public int getIdItineraryGuide() {
        return idItineraryGuide;
    }

    public void setIdItineraryGuide(int idItineraryGuide) {
        this.idItineraryGuide = idItineraryGuide;
    }

    public int getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(int idGuide) {
        this.idGuide = idGuide;
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
        ItineraryGuide that = (ItineraryGuide) o;
        return idItineraryGuide == that.idItineraryGuide &&
                idGuide == that.idGuide &&
                idItinerary == that.idItinerary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItineraryGuide, idGuide, idItinerary);
    }

    public Guide getGuideByIdGuide() {
        return guideByIdGuide;
    }

    public void setGuideByIdGuide(Guide guideByIdGuide) {
        this.guideByIdGuide = guideByIdGuide;
    }

    public Itinerary getItineraryByIdItinerary() {
        return itineraryByIdItinerary;
    }

    public void setItineraryByIdItinerary(Itinerary itineraryByIdItinerary) {
        this.itineraryByIdItinerary = itineraryByIdItinerary;
    }
}
