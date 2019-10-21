package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class image extends AppCompatActivity implements View.OnClickListener{
    RadioGroup animal;
    RadioButton btnSnake,btnBird,btnTiger;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        animal =findViewById(R.id.rgAnimal);
        image =findViewById(R.id.imageview);
        btnBird=findViewById(R.id.rbBird);
        btnSnake=findViewById(R.id.rbSnake);
        btnTiger=findViewById(R.id.rbTiger);

        btnBird.setOnClickListener(this);
        btnTiger.setOnClickListener(this);
        btnSnake.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rbBird:
                image.setImageResource(R.drawable.bird);
                break;
            case R.id.rbSnake:
                image.setImageResource(R.drawable.snake);
                break;
            case R.id.rbTiger:
                image.setImageResource(R.drawable.tiger);
                break;
        }
    }
}
