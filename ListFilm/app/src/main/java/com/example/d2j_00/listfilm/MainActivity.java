package com.example.d2j_00.listfilm;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String  [] fileTitles= {"The Thor", "Harry Potter", "Inception",
                                    "wolf of wallstreet", "Django Unchained",
                                    "Titanic", "Captain America", "Doctor Stranger",
                                    "X-Men Apocalypse", "Shutter Island"};


    private ArrayList<movie> movies = new ArrayList<>();

    private void inimovie(){
        movies.add(new movie("The Thor", "Film mengenai kisah pahlawan", 7.5, 2012));
        movies.add(new movie("Koizora", "Film kisah romance", 7.9, 2007));
        movies.add(new movie("Deathnote", "Film bergenre horor", 8.0, 2016));
        movies.add(new movie("Startrek", "Film mengkisahkan petualang luar angkasa", 8.0, 2016));
        movies.add(new movie("Ensiklopedi", "Film para ilmuwan", 7.9, 2010));
        movies.add(new movie("The billionaire", "Film tentang kesuksesan", 8.5, 2012));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inimovie();
        ArrayAdapter<movie> adapter = new  ArrayAdapter<movie>(this,
        android.R.layout.simple_list_item_1, movies);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, fileTitles);
        ListView ListView = (ListView) findViewById(R.id.list_film);
        ListView.setAdapter(adapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                movie selectMovie = movies.get(position);
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("com.example.d2j_00.listfilm", selectMovie);
                startActivity(intent);
            }
        });
    }
}
