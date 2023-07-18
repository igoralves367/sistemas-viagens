package br.com.lis2b.igorviagens.aluguelveiculo.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lis2b.igorviagens.aluguelveiculo.domain.AluguelVeiculo;

public interface AluguelVeiculoJPARepository extends JpaRepository<AluguelVeiculo, UUID> {
}