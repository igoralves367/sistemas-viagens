package br.com.lis2b.igorviagens.voos.infra;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class FlightOfferResponse {

    private Meta meta;
    private List<Data> data;

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Meta {
        private int count;
        private Links links;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Links {
        private String self;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Data {
        private String type;
        private String id;
        private String source;
        private boolean instantTicketingRequired;
        private boolean nonHomogeneous;
        private boolean oneWay;
        private String lastTicketingDate;
        private String lastTicketingDateTime;
        private int numberOfBookableSeats;
        private List<Itinerary> itineraries;
        private Price price;
        private PricingOptions pricingOptions;
        private List<String> validatingAirlineCodes;
        private List<TravelerPricing> travelerPricings;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Itinerary {
        private String duration;
        private List<Segment> segments;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Segment {
        private Departure departure;
        private Arrival arrival;
        private String carrierCode;
        private String number;
        private Aircraft aircraft;
        private Operating operating;
        private String duration;
        private String id;
        private int numberOfStops;
        private boolean blacklistedInEU;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Departure {
        private String iataCode;
        private String at;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Arrival {
        private String iataCode;
        private String at;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Aircraft {
        private String code;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Operating {
        private String carrierCode;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Price {
        private String currency;
        private String total;
        private String base;
        private List<Fee> fees;
        private String grandTotal;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class Fee {
        private String amount;
        private String type;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class PricingOptions {
        private List<String> fareType;
        private boolean includedCheckedBagsOnly;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class TravelerPricing {
        private String travelerId;
        private String fareOption;
        private String travelerType;
        private Price price;
        private List<FareDetailsBySegment> fareDetailsBySegment;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class FareDetailsBySegment {
        private String segmentId;
        private String cabin;
        private String fareBasis;
        private String brandedFare;
        private String clazz;
        private IncludedCheckedBags includedCheckedBags;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class IncludedCheckedBags {
        private int quantity;
    }
}

