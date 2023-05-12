package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista= new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 3) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        filmeDoPaulo.setDiretor("Danillo");
        System.out.println(filmeDoPaulo.getDiretor());
        System.out.println(f1.getDiretor());
        f1.setDiretor("Paty");
        System.out.println(filmeDoPaulo.getDiretor());
        System.out.println(f1.getDiretor());
        lista.forEach(System.out::println);
//        Filme favorito = new Filme("The Matrix", 1999);
//        favorito.avalia(10);
//
//        Filme outroFilme = new Filme("John Wick", 2014);
//        outroFilme.avalia(9);
//
//        Serie serie = new Serie("La Casa de Papel", 2017);
//
//        ArrayList<Titulo> lista = new ArrayList<>();
//        lista.add(favorito);
//        lista.add(outroFilme);
//        lista.add(serie);
//
//        for (Titulo item : lista) {
//            System.out.println("Nome: " + item.getNome());
//            if (item instanceof Filme filme) {
//                System.out.println("Classificação: " + filme.getClassificacao());
//            }
//        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulor");
        buscaPorArtista.add("Jacqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada por ano");
        System.out.println(lista);
    }

}
