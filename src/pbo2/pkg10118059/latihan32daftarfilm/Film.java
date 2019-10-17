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
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film      : " + filmName);
        System.out.println("Genre Film      : " + filmGenre);
        System.out.println("Rating Film     : " + filmRating);
        System.out.println("Duration Film   : " + filmDuration + " Menit");
        System.out.println("");
    }
}
