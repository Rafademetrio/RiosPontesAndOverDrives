package com.rafademetrio.riospontesandoverdrives.models;

public class PonteOutputDTO {


    public PonteOutputDTO(String km, String linha, String cidade, String estado) {
        this.km = km;
        this.linha = linha;
        this.cidade = cidade;
        this.estado = estado;
    }

    public PonteOutputDTO(Ponte ponte){
        this.km = ponte.getKm();
        this.linha = ponte.getLinha();
        this.cidade = ponte.getCidade();
        this.estado = ponte.getEstado();
    }

    private String km;
    private String linha;
    private String cidade;
    private String estado;


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
}
