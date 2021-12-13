package com.letscode.array_frutas.utils;

import java.util.Scanner;

public class Leitor {
    private static Scanner sc = new Scanner(System.in);

    public static String escanearArrayFrutas() {
        Impressora.imprimirMsgInsercaoFrutas();
        return sc.nextLine();
    }
}
