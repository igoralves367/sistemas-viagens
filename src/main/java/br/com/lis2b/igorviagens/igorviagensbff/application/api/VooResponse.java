package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VooResponse {
	private VooPernaResponse ida;
	private VooPernaResponse volta;

}
