package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.lis2b.igorviagens.hospedagem.domain.Hospedagem;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HospedagemResponse {

	private String localizacao;
	private LocalDateTime checkin;
	private LocalDateTime checkout;
	private String hotel;
	private BigDecimal precoTotal;
	
	public HospedagemResponse(Hospedagem hospedagem) {
		this.localizacao = hospedagem.getLocalizacao();
		this.checkin = hospedagem.getCheckin();
		this.checkout = hospedagem.getCheckout();
		this.hotel = hospedagem.getHotel();
		this.precoTotal = hospedagem.getPrecoTotal();
	}
}