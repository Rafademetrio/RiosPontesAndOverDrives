package com.rafademetrio.riospontesandoverdrives.models;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Relatorio {


    private static final String  caminhoArquivoEntrada = "D:\\projeto pontes\\rios_pontes_and_overdrives\\templates\\templateRelatorio.docx";
    private static final String  caminhoArquivoSaida = "D:\\projeto pontes\\rios_pontes_and_overdrives\\templates\\RelatorioGerado.docx";


    public static void gerarRelatorio(Ponte ponte) throws IOException {


        try{


            // Abrir o documento existente
            FileInputStream fis = new FileInputStream(caminhoArquivoEntrada);
            XWPFDocument documento = new XWPFDocument(fis);

            substituirTexto(documento,"_km_", ponte.getKm());
            substituirTexto(documento,"_linha_", ponte.getLinha());
            substituirTexto(documento,"_cidade_", ponte.getCidade());
            substituirTexto(documento,"_estado_", ponte.getEstado());
            substituirTexto(documento,"_naturezaDaTransposicao_", ponte.getNaturezaDaTransposicao());
            substituirTexto(documento,"_bitola_", ponte.getBitola());
            substituirTexto(documento,"_tracado_", ponte.getTracado());
            substituirTexto(documento,"_trilhos_", ponte.getTrilhos());
            substituirTexto(documento,"_fixacao_", ponte.getFixacao());
            substituirTexto(documento,"_comprimento_", ponte.getComprimento());
            substituirTexto(documento,"_largura_", ponte.getLargura());



            FileOutputStream fos = new FileOutputStream(caminhoArquivoSaida);
            documento.write(fos);


            fis.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }


    private static void substituirTexto(XWPFDocument documento, String textoAntigo, String textoNovo){

                // Iterar sobre os parágrafos do documento
        for (XWPFParagraph paragrafo : documento.getParagraphs()) {
            // Iterar sobre as execuções (runs) do parágrafo

            for (XWPFRun run : paragrafo.getRuns()) {

                String textoAtual = run.getText(0);
                // Verificar se o texto atual contém a string a ser substituída
                System.out.println(textoAtual);
                System.out.println("---");

                if (textoAtual != null && textoAtual.contains(textoAntigo)) {
                    // Realizar a substituição
                    textoAtual = textoAtual.replace(textoAntigo, textoNovo);
                    // Configurar o novo texto na execução
                    run.setText(textoAtual, 0);
                }
            }
        }
    }

    private static void substituirTexto2(XWPFDocument documento, String textoAntigo, String textoNovo) {



        for (XWPFParagraph paragrafo : documento.getParagraphs()) {
           System.out.println(paragrafo.getText());
            for (XWPFRun run : paragrafo.getRuns()) {

                String textoAtual = run.text();
                // Verificar se o texto atual contém a string a ser substituída
                System.out.println(textoAtual);
                System.out.println("---");

                if (textoAtual != null && textoAtual.contains(textoAntigo)) {
                    // Realizar a substituição
                    textoAtual = textoAtual.replace(textoAntigo, textoNovo);
                    // Configurar o novo texto na execução
                    run.setText(textoAtual, 0);
                }
            }


        }




    }

}
