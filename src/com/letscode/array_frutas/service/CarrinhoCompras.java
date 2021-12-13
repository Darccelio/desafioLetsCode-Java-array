package com.letscode.array_frutas.service;

import com.letscode.array_frutas.utils.Impressora;
import com.letscode.array_frutas.utils.Leitor;

public class CarrinhoCompras {

    private static final int tam = 5;
    private static final String[] frutas = new String[tam];

    public static void inserirFruta() {
        for (int i=0; i<tam; i++) {
            frutas[i] = Leitor.escanearArrayFrutas();
        }
    }

    public static void mostrarCarrinho() {
        Impressora.imprimirMensagemFinal();
        for (int i=0; i<tam; i++) {
            Impressora.mostrarFrutas(frutas[i]);
        }
    }
}
