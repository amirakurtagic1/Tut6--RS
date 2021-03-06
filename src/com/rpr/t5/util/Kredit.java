package com.rpr.t5.util;

import com.rpr.t5.Korisnik;

import java.util.List;

public class Kredit {
    public static Double proracunKreditneSposobnosti(KreditnaSposobnost funkcija, Korisnik korisnik) {
        return funkcija.provjeri(korisnik.getRacun());
    }

    public static void ispisiSveKorisnikeBezPrekoracenja(List<Korisnik> listaKorisnika) {
        int brojac = 0;
        listaKorisnika.stream().filter(value -> value.getRacun().getStanjeRacuna().doubleValue() > 0).forEach(value -> System.out.println(value));

    }

    public static void odobriPrekoracenje(List<Korisnik> listaKorisnika){
        listaKorisnika.stream().filter(value -> value.getRacun().getStanjeRacuna().doubleValue() > 10000).forEach(value -> value.getRacun().odobriPrekoracenja(true));
    }

}
