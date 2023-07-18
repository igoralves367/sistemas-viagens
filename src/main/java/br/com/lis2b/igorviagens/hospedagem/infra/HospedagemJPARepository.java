package br.com.lis2b.igorviagens.hospedagem.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lis2b.igorviagens.hospedagem.domain.Hospedagem;

public interface HospedagemJPARepository extends JpaRepository <Hospedagem, UUID> {

}
