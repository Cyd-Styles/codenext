package com.example.cydbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ClassicsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classics);

        ArrayList<CategoryItem> classics = new ArrayList<>();
        classics.add(new CategoryItem("The Catcher in the Rye", "J.D. Salinger", "", "Classics", R.drawable.the_catcher_in_the_rye));
        classics.add(new CategoryItem("To Kill A Mockingbird", "Harper Lee", "", "Classics" , R.drawable.to_kill_a_mokingbird));
        classics.add(new CategoryItem("1984", "George Orwell", "", "Classics", R.drawable.book_1984));
        classics.add(new CategoryItem("Animal Farm", "George Orwell", "", "Classics", R.drawable.animal_farm));
        classics.add(new CategoryItem("Fahrenheit 451", "Ray Bradbury", "", "Classics", R.drawable.fahrenheit_451));
        classics.add(new CategoryItem("Hamlet", "William Shakespeare", "", "Classics", R.drawable.hamlet));
        classics.add(new CategoryItem("Little Women", "Louisa May Alcott", "", "Classics", R.drawable.little_women));
        classics.add(new CategoryItem("Lord of the Flies", "William Golding", "", "Classics", R.drawable.lord_of_the_flies));
        classics.add(new CategoryItem("Of Mice and Men", "John Steinbeck", "", "Classics", R.drawable.of_mice_and_men));
        classics.add(new CategoryItem("Pride and Prejudice", "Jane Austen", "", "Classics", R.drawable.pride_and_prejudice));
        classics.add(new CategoryItem("Romeo and Juliet", "William Shakespeare", "", "Classics", R.drawable.romeo_and_juliet));
        classics.add(new CategoryItem("The Adventures of Huckleberry Finn", "Mark Twain", "", "Classics", R.drawable.the_adventures_of_huckleberry_finn));
        classics.add(new CategoryItem("The Great Gatsby", "F. Scott Fitzgerald", "", "Classics", R.drawable.the_great_gatsby));
        classics.add(new CategoryItem("The Handmaid's Tale", "Margaret Atwood", "", "Classics", R.drawable.the_handmaids_tale));
        classics.add(new CategoryItem("The Scarlet Letter", "Nathaniel Hawthorne", "", "Classics", R.drawable.the_scarlet_letter));

        ListView classicsListview = findViewById(R.id.classics_listview);
        CategoryAdapter albumAdapter = new CategoryAdapter(this, classics);
        classicsListview.setAdapter(classicsAdapter);
    }
}
