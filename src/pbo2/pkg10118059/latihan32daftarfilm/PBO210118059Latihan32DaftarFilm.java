/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan32daftarfilm;

/**
 *
 * @author 
 * Nama     : Muhammad Rakha Firdaus
 * NIM      : 10118059
 * Kelas    : IF-2
 */
public class PBO210118059Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film = new Film();
        
        System.out.println("===Daftar Film Sedang Tayang===");
        
        film.filmName = "Annabelle : far from home";
        film.filmGenre = "Comedy";
        film.filmRating = 10.0;
        film.filmDuration = 120;
        film.nowPlaying();
        
        film.filmName = "Spiderman : cominghome";
        film.filmGenre = "Comedy";
        film.filmRating = 10.0;
        film.filmDuration = 120;
        film.nowPlaying();
    }
    
}
