package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<CategoryItem> artists = new ArrayList<>();
        artists.add(new CategoryItem("Rihanna", R.drawable.rihanna));
        artists.add(new CategoryItem("Drake", R.drawable.drake));
        artists.add(new CategoryItem("Destiny Rogers", R.drawable.destiny_rogers));
        artists.add(new CategoryItem("DaBaby", R.drawable.dababy));
        artists.add(new CategoryItem("Don Toliver", R.drawable.don_toliver));
        artists.add(new CategoryItem("Ella Mai", R.drawable.ella_mai));
        artists.add(new CategoryItem("Jessie Reyez", R.drawable.jessie_reyez));
        artists.add(new CategoryItem("Kehlani", R.drawable.kehlani));
        artists.add(new CategoryItem("Pop Smoke", R.drawable.pop_smoke));
        artists.add(new CategoryItem("The Weeknd", R.drawable.the_weeknd));
        artists.add(new CategoryItem("SZA", R.drawable.sza));
        artists.add(new CategoryItem("Queen Naija", R.drawable.queen_naija));
        artists.add(new CategoryItem("Koffee", R.drawable.koffee));
        artists.add(new CategoryItem("H.E.R.", R.drawable.her));
        artists.add(new CategoryItem("Layton Greene", R.drawable.layton_greene));
        artists.add(new CategoryItem("Roddy Ricch", R.drawable.roddy_ricch));
        artists.add(new CategoryItem("Lizzo", R.drawable.lizzo));
        artists.add(new CategoryItem("A Boogie wit da Hoodie", R.drawable.a_boogie));

        ListView artistListview = findViewById(R.id.artist_listview);
        CategoryAdapter artistAdapter = new CategoryAdapter(this, artists);
        artistListview.setAdapter(artistAdapter);
    }
}
