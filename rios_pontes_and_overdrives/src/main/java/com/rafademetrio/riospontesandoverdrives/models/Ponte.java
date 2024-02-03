package com.rafademetrio.riospontesandoverdrives.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.IOException;
import java.math.BigInteger;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ponte {
    public Ponte(PonteInputDTO ponteInputDTO){
        this.id = ponteInputDTO.getId();
        this.km = ponteInputDTO.getKm();
        this.linha = ponteInputDTO.getLinha();
        this.cidade = ponteInputDTO.getCidade();
        this.estado = ponteInputDTO.getEstado();
        this.naturezaDaTransposicao = ponteInputDTO.getNaturezaDaTransposicao();
        this.bitola = ponteInputDTO.getBitola();
        this.tracado = ponteInputDTO.getTracado();
        this.trilhos = ponteInputDTO.getTrilhos();
        this.fixacao = ponteInputDTO.getFixacao();
        this.comprimento = ponteInputDTO.getComprimento();
        this.largura = ponteInputDTO.getLargura();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private BigInteger id;
    private String km;
    private String linha;
    private String cidade;
    private String estado;
    private String naturezaDaTransposicao;
    private String bitola;
    private String tracado;
    private String trilhos;
    private String fixacao;
    private String comprimento;
    private String largura;



    public static void gerarRelatorio(Ponte ponte) throws IOException {
        Relatorio.gerarRelatorio(ponte);
    }

}
