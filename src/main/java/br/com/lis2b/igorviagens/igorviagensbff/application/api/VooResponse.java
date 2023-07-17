package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import java.util.List;

import br.com.lis2b.igorviagens.voos.infra.VooBuscaResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VooResponse {
	private VooPernaResponse ida;
	private VooPernaResponse volta;

	public static List<VooResponse> convert(List<VooBuscaResponse> voosBusca) {
		// TODO Auto-generated method stub
		return null;
	}

}
