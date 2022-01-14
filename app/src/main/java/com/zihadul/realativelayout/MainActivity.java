package com.zihadul.realativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =findViewById(R.id.imageView);

        Picasso.get()
                .load("https://img1.hscicdn.com/image/upload/f_auto/lsci/db/PICTURES/CMS/278400/278428.4.jpg")
                .into(imageView);
    }
}