package com.rafademetrio.riospontesandoverdrives.models;

import jakarta.persistence.*;
import java.io.IOException;
import java.math.BigInteger;
@Entity
public class Ponte {

    public Ponte() {
    }

    public Ponte(BigInteger id, String km, String linha, String cidade, String estado, String naturezaDaTransposicao, String bitola, String tracado, String trilhos, String fixacao, String comprimento, String largura) {
        this.id = id;
        this.km = km;
        this.linha = linha;
        this.cidade = cidade;
        this.estado = estado;
        this.naturezaDaTransposicao = naturezaDaTransposicao;
        this.bitola = bitola;
        this.tracado = tracado;
        this.trilhos = trilhos;
        this.fixacao = fixacao;
        this.comprimento = comprimento;
        this.largura = largura;
    }

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

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNaturezaDaTransposicao() {
        return naturezaDaTransposicao;
    }

    public void setNaturezaDaTransposicao(String naturezaDaTransposicao) {
        this.naturezaDaTransposicao = naturezaDaTransposicao;
    }

    public String getBitola() {
        return bitola;
    }

    public void setBitola(String bitola) {
        this.bitola = bitola;
    }

    public String getTracado() {
        return tracado;
    }

    public void setTracado(String tracado) {
        this.tracado = tracado;
    }

    public String getTrilhos() {
        return trilhos;
    }

    public void setTrilhos(String trilhos) {
        this.trilhos = trilhos;
    }

    public String getFixacao() {
        return fixacao;
    }

    public void setFixacao(String fixacao) {
        this.fixacao = fixacao;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public static void gerarRelatorio(Ponte ponte) throws IOException {
        Relatorio.gerarRelatorio(ponte);
    }

}
