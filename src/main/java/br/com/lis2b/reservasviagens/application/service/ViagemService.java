package br.com.lis2b.reservasviagens.application.service;

import java.util.List;

import br.com.lis2b.reservasviagens.application.api.DestinoDTO;
import br.com.lis2b.reservasviagens.application.api.ViagemResponse;

public interface ViagemService {

	List<ViagemResponse> buscarViagens(DestinoDTO destino);

}
