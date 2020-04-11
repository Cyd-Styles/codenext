package com.example.cydbooks;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RomanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);

        ArrayList<CategoryItem> romance = new ArrayList<>();
        romance.add(new CategoryItem("After", "J.D. Salinger", "", "Romance", R.drawable.after1));
        romance.add(new CategoryItem("After We Collided", "Harper Lee", "", "Romance" , R.drawable.after2));
        romance.add(new CategoryItem("After We Fell", "George Orwell", "", "Romance", R.drawable.after3));
        romance.add(new CategoryItem("After Ever Happy", "George Orwell", "", "Romance", R.drawable.after4));
        romance.add(new CategoryItem("Sun Is Also A Star", "Ray Bradbury", "", "Romance", R.drawable.sun_also_star));
        romance.add(new CategoryItem("A Walk to Remember", "William Shakespeare", "", "Romance", R.drawable.a_walk_to_remember));
        romance.add(new CategoryItem("Eleanor and Park", "Louisa May Alcott", "", "Romance", R.drawable.eleanor_park));
        romance.add(new CategoryItem("Fifty Shades of Grey", "William Golding", "", "Romance", R.drawable.fifty_shades_book1));
        romance.add(new CategoryItem("Fifty Shades Darker", "John Steinbeck", "", "Romance", R.drawable.fifty_shades_book2));
        romance.add(new CategoryItem("Fifty Shades Freed", "Jane Austen", "", "Romance", R.drawable.fifty_shades_book3));
        romance.add(new CategoryItem("The Fault in Our Stars", "William Shakespeare", "", "Romance", R.drawable.the_fault_in_our_stars));
        romance.add(new CategoryItem("The Kiss Quotient", "Mark Twain", "", "Romance", R.drawable.the_kiss_quotient));
        romance.add(new CategoryItem("Perfect Chemistry", "F. Scott Fitzgerald", "", "Romance", R.drawable.perfect_chem));
        romance.add(new CategoryItem("Rules of Attraction", "Margaret Atwood", "", "Romance", R.drawable.perfect_chem2));
        romance.add(new CategoryItem("Chain Reaction", "Nathaniel Hawthorne", "", "Romance", R.drawable.perfect_chem3));
        romance.add(new CategoryItem("The Summer I Turned Pretty", "Nathaniel Hawthorne", "", "Romance", R.drawable.summer_pretty1));
        romance.add(new CategoryItem("It's Not Summer Without You", "Nathaniel Hawthorne", "", "Romance", R.drawable.summer_pretty2));
        romance.add(new CategoryItem("We'll Always Have Summer", "Nathaniel Hawthorne", "", "Romance", R.drawable.summer_pretty3));
        romance.add(new CategoryItem("To All the Boys I've Loved Before", "Nathaniel Hawthorne", "", "Romance", R.drawable.boys_i_loved_before1));
        romance.add(new CategoryItem("P.S. I Still Love You", "Nathaniel Hawthorne", "", "Romance", R.drawable.boys_ive_loved_before2));
        romance.add(new CategoryItem("Always and Forever, Lara Jean", "Nathaniel Hawthorne", "", "Romance", R.drawable.boys_ive_lloved_before3));
        romance.add(new CategoryItem("Paper Towns", "Nathaniel Hawthorne", "", "Romance", R.drawable.paper_towns));
        romance.add(new CategoryItem("5 Feet Apart", "Nathaniel Hawthorne", "", "Romance", R.drawable.five_feet));

        ListView romanceListview = findViewById(R.id.romance_listview);
        CategoryAdapter romanceAdapter = new CategoryAdapter(this, romance);
        romanceListview.setAdapter(romanceAdapter);
    }
}
