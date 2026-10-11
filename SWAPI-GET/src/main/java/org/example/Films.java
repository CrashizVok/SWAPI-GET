package org.example;

import java.util.List;

public class Films {
    private List<Film> list;

    public Films(List<Film> list){
        this.list = list;
    }

    public List<Film> getFilmList(){
        return list;
    }
}
