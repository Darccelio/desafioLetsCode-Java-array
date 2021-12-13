package com.letscode.array_frutas.utils;

public class Impressora {

    private final static String MENSAGEM_ENTRADA_FRUTAS = "Por favor, insira uma fruta .........: ";

    private final static String MENSAGEM_MOSTRAR_FINAL = "As frutas selecionadas são ..........: ";

    public static void imprimirMsgInsercaoFrutas() {
        System.out.print(MENSAGEM_ENTRADA_FRUTAS);
    }

    public static void imprimirMensagemFinal() {
        System.out.print(MENSAGEM_MOSTRAR_FINAL);
    }

    public static void mostrarFrutas(String fruta) {
        System.out.print(fruta + ", ");
    }



}
