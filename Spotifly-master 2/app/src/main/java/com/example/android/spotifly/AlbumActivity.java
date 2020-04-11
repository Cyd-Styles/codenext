package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<CategoryItem> albums = new ArrayList<>();
        albums.add(new CategoryItem("Views", R.drawable.views));
        albums.add(new CategoryItem("Kirk", R.drawable.kirk));
        albums.add(new CategoryItem("Baby on Baby", R.drawable.baby_on_baby));
        albums.add(new CategoryItem("Ready", R.drawable.ready));
        albums.add(new CategoryItem("Hoodie SZN", R.drawable.hoodie_szn));
        albums.add(new CategoryItem("Ella Mai", R.drawable.ella_mai_album));
        albums.add(new CategoryItem("Tomboy", R.drawable.tomboy));
        albums.add(new CategoryItem("Scorpion", R.drawable.scorpion));
        albums.add(new CategoryItem("Cuz I Love You", R.drawable.cuz_i_love_you));
        albums.add(new CategoryItem("The Bigger Artist", R.drawable.the_bigger_artist));
        albums.add(new CategoryItem("Please Excuse Me for Being Antisocial", R.drawable.please_excuse_me_for_being_antisocial));
        albums.add(new CategoryItem("Perfect 10", R.drawable.perfect_ten));
        albums.add(new CategoryItem("Meet the Woo 2", R.drawable.meet_the_woo_2));
        albums.add(new CategoryItem("H.E.R.", R.drawable.her_album));
        albums.add(new CategoryItem("Artist 2.0", R.drawable.artist_2_0));
        albums.add(new CategoryItem("Ctrl", R.drawable.ctrl));
        albums.add(new CategoryItem("I Used to Know Her", R.drawable.i_used_to_know_her));

        ListView albumListview = findViewById(R.id.album_listview);
        CategoryAdapter albumAdapter = new CategoryAdapter(this, albums);
        albumListview.setAdapter(albumAdapter);
    }
}
