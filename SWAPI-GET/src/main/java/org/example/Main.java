package org.example;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String filmsJson = SwapiService.getFilmsJson("https://swapi.info/api/films");
        //System.out.println(filmsJson);

        JsonReader reader = Json.createReader(new StringReader(filmsJson));
        JsonArray films = reader.readArray();
        List<Film> list = new ArrayList<>();

        for (int i=0; i < films.size(); i++){
            JsonObject film = films.getJsonObject(i);
            String title = film.getString("title");
            //System.out.println("Title: " + title);

            int episode_id = film.getInt("episode_id");
            //System.out.println("Episode ID: " + episode_id);

            String opening_crawl = film.getString("opening_crawl");
            //System.out.println("Opening crawl: " + opening_crawl);

            String director = film.getString("director");
            //System.out.println("Director: " + director);

            String release_date = film.getString("release_date");
            //System.out.println("Release date: " + release_date);

            String url = film.getString("url");
            //System.out.println("Url: " + url);

            Film filmdta = new Film(title, episode_id, opening_crawl, director, release_date, url);
            list.add(filmdta);

            // episode id, opening crawl, director, release date, link(url)
            // Film class
            // Films Class
        }
        Films filmsdta = new Films(list);

        for (Film f : filmsdta.getFilmList()){
            System.out.println("Film : " + f.getTitle() + " - " + f.getReleaseDate() + "--> " + f.getUrl());
        }
    }
}