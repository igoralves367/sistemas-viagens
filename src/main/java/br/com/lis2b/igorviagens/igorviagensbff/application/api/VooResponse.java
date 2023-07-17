package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.lis2b.igorviagens.voos.infra.FlightOfferResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VooResponse {
	private List<ItinerarioResponse> itinerarios;
	private BigDecimal preco;

	public VooResponse(FlightOfferResponse.Data data) {
		this.itinerarios = data.getItineraries().stream()
				.map(ItinerarioResponse::new)
				.collect(Collectors.toList());
		this.preco = new BigDecimal(data.getPrice().getTotal());
	}	

	public static List<VooResponse> convert(FlightOfferResponse voosBusca) {
		return voosBusca.getData().stream()
		.map(VooResponse::new)
		.collect(Collectors.toList());
	}

    @Getter
    @ToString
    public static class ItinerarioResponse {
        private String duracao;
        private List<SegmentoResponse> segmentos;
        
		public ItinerarioResponse(FlightOfferResponse.Itinerary itinerary) {
			this.duracao = itinerary.getDuration();
			this.segmentos = itinerary.getSegments().stream()
					.map(SegmentoResponse::new)
					.collect(Collectors.toList());
		}
    }
	
	@Getter
	@ToString
	public static class SegmentoResponse {
		private String codigoAeroportoOrigem; 
		private String codigoAeroportoDestino;
		private LocalDateTime decolagem;
		private String nomeCompanhiaAerea;
		
		public SegmentoResponse(FlightOfferResponse.Segment segment) {
			this.codigoAeroportoOrigem = segment.getDeparture().getIataCode();
			this.codigoAeroportoDestino = segment.getArrival().getIataCode();
			this.decolagem = LocalDateTime.parse(segment.getDeparture().getAt());
			this.nomeCompanhiaAerea = segment.getCarrierCode();
		}
	}
}
