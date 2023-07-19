package br.com.lis2b.igorviagens.voos.infra;

import java.time.LocalDate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "vooAmadeusClient", url = "https://test.api.amadeus.com", configuration = AmadeusFeignConfiguration.class)
public interface VooAmadeusClientFeing {

	 @GetMapping("/v2/shopping/flight-offers")
	    FlightOfferResponse buscaVoos(
	        @RequestParam("originLocationCode") String codigoOrigem,
	        @RequestParam("destinationLocationCode") String codigoDestino,
	        @RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataIda,
	        @RequestParam("returnDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataVolta,
	        @RequestParam("adults") Integer quantidadePessoas,
	        @RequestParam("nonStop") boolean nonStop,
	        @RequestParam("currencyCode") String currencyCode,
	        @RequestParam("max") Integer max
	    );
}
