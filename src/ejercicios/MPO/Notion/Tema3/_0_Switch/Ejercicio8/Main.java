package ejercicios.MPO.Notion.Tema3._0_Switch.Ejercicio8;

import enums.TipoFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objetivo: Crear un programa que identifique el tipo de archivo según su extensión.
        // Requisitos:
        // Declara una variable String extension (por ejemplo: "jpg", "pdf", "txt", "mp3").
        //Usa un switch para agrupar extensiones similares: Imágenes (jpg, png, gif),
        // Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
        // Muestra el tipo de archivo y el programa recomendado para abrirlo.
        Scanner scn = new Scanner(System.in);

        String extension = "jpg";

        switch (extension){
            case "jpg","png","gif"   -> {System.out.println("El archivo es una imagen. Puedes utilizar el Visor de Imágenes de Windows.");}
            case "pdf", "doc", "txt" -> {System.out.println("El archivo es un documento. Puedes utilizar Microsoft Word.");}
            case "mp3", "wav"        -> {System.out.println("El archivo es un audio. Puedes utilizar Reproductor de Musica.");}
            case "mp4", "avi"        -> {System.out.println("El archivo es una pelicula. Puedes utilizar VLC.");}
        }

        System.out.printf("\nOpción con ENUM: El archivo es de tipo %s.", TipoFile.findByType(extension));

    }
}
