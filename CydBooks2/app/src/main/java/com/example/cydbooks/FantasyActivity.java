package com.example.cydbooks;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

class FantasyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasy);

        ArrayList<CategoryItem> fantasy = new ArrayList<>();
        fantasy.add(new CategoryItem("Harry Potter: Sorcerer's Stone (Book 1)", "", "", "Fantasy", R.drawable.harry_potter_book_1));
        fantasy.add(new CategoryItem("Harry Potter Book 2", "Harper Lee", "", "Fantasy", R.drawable.harry_potter_book_2));
        fantasy.add(new CategoryItem("Harry Potter Book 3", "George Orwell", "", "Fantasy", R.drawable.harry_potter_book_3));
        fantasy.add(new CategoryItem("Harry Potter Book 4", "George Orwell", "", "Fantasy", R.drawable.harry_potter_book_4));
        fantasy.add(new CategoryItem("Harry Potter Book 5", "Ray Bradbury", "", "Fantasy", R.drawable.harry_potter_book_5));
        fantasy.add(new CategoryItem("Harry Potter Book 6", "William Shakespeare", "", "Fantasy", R.drawable.harry_potter_book_6));
        fantasy.add(new CategoryItem("Harry Potter Book 7", "Louisa May Alcott", "", "Fantasy", R.drawable.harry_potter_book_7));
        fantasy.add(new CategoryItem("Harry Potter Book 8", "William Golding", "", "Fantasy", R.drawable.harry_potter_book8));
        fantasy.add(new CategoryItem("Twilight Book 1", "John Steinbeck", "", "Fantasy", R.drawable.twilight_book1));
        fantasy.add(new CategoryItem("Twilight Book 2", "Jane Austen", "", "Fantasy", R.drawable.twilight_book2));
        fantasy.add(new CategoryItem("Twilight Book 3", "William Shakespeare", "", "Fantasy", R.drawable.twilight_book3));
        fantasy.add(new CategoryItem("Twilight Book 4", "Mark Twain", "", "Fantasy", R.drawable.twilight_book4));
        fantasy.add(new CategoryItem("", "F. Scott Fitzgerald", "", "Fantasy", R.drawable.the_great_gatsby));
        fantasy.add(new CategoryItem("", "Margaret Atwood", "", "Fantasy", R.drawable.the_handmaids_tale));
        fantasy.add(new CategoryItem("", "Nathaniel Hawthorne", "", "Fantasy", R.drawable.the_scarlet_letter));

        ListView fantasyListview = findViewById(R.id.fantasy_listview);
        CategoryAdapter fantasyAdapter = new CategoryAdapter(this, fantasy);
        fantasyListview.setAdapter(fantasyAdapter);
        }
    }