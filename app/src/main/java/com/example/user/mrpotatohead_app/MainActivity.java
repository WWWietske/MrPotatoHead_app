package com.example.user.mrpotatohead_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;
    CheckBox checkarms;
    CheckBox checkears;
    CheckBox checkeyebrows;
    CheckBox checkeyes;
    CheckBox checkglasses;
    CheckBox checkhat;
    CheckBox checkmouth;
    CheckBox checkmustache;
    CheckBox checknose;
    CheckBox checkshoes;
    Button checkall;
    Button checknone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.arms);
        ears = (ImageView) findViewById(R.id.ears);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        glasses = (ImageView) findViewById(R.id.glasses);
        hat = (ImageView) findViewById(R.id.hat);
        mouth = (ImageView) findViewById(R.id.mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        nose = (ImageView) findViewById(R.id.nose);
        shoes = (ImageView) findViewById(R.id.shoes);

        arms.setVisibility(View.INVISIBLE);
        ears.setVisibility(View.INVISIBLE);
        eyebrows.setVisibility(View.INVISIBLE);
        eyes.setVisibility(View.INVISIBLE);
        glasses.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        mouth.setVisibility(View.INVISIBLE);
        mustache.setVisibility(View.INVISIBLE);
        nose.setVisibility(View.INVISIBLE);
        shoes.setVisibility(View.INVISIBLE);

        checkarms = (CheckBox) findViewById(R.id.checkarms);
        checkears = (CheckBox) findViewById(R.id.checkears);
        checkeyebrows = (CheckBox) findViewById(R.id.checkeyebrows);
        checkeyes = (CheckBox) findViewById(R.id.checkeyes);
        checkglasses = (CheckBox) findViewById(R.id.checkglasses);
        checkhat = (CheckBox) findViewById(R.id.checkhat);
        checkmouth = (CheckBox) findViewById(R.id.checkmouth);
        checkmustache = (CheckBox) findViewById(R.id.checkmustache);
        checknose = (CheckBox) findViewById(R.id.checknose);
        checkshoes = (CheckBox) findViewById(R.id.checkshoes);

        checkall = (Button) findViewById(R.id.checkall);
        checknone = (Button) findViewById(R.id.checknone);

        checkall.setOnClickListener(all);
        checknone.setOnClickListener(none);
    }

    // nog check all en check none toevoegen

    public void onCheckboxClicked(View view) {
        // Is view checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        // delete nu de checkboxes, omdat die de view delete en niet de afbeeldingen!
        switch(view.getId()) {
            case R.id.checkarms:
                if (checked)
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkears:
                if (checked)
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkeyebrows:
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkeyes:
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkglasses:
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkhat:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkmouth:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkmustache:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkshoes:
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checknose:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
        }
    }
    View.OnClickListener all = new View.OnClickListener() {
        public void onClick(View v) {
            checkarms.setChecked(true);
            checkears.setChecked(true);
            checkeyebrows.setChecked(true);
            checkeyes.setChecked(true);
            checkglasses.setChecked(true);
            checkhat.setChecked(true);
            checkmouth.setChecked(true);
            checkmustache.setChecked(true);
            checknose.setChecked(true);
            checkshoes.setChecked(true);
            arms.setVisibility(View.VISIBLE);
            ears.setVisibility(View.VISIBLE);
            eyebrows.setVisibility(View.VISIBLE);
            eyes.setVisibility(View.VISIBLE);
            glasses.setVisibility(View.VISIBLE);
            hat.setVisibility(View.VISIBLE);
            mouth.setVisibility(View.VISIBLE);
            mustache.setVisibility(View.VISIBLE);
            nose.setVisibility(View.VISIBLE);
            shoes.setVisibility(View.VISIBLE);
        }
    };

    View.OnClickListener none = new View.OnClickListener() {
        public void onClick(View v) {
            checkarms.setChecked(false);
            checkears.setChecked(false);
            checkeyebrows.setChecked(false);
            checkeyes.setChecked(false);
            checkglasses.setChecked(false);
            checkhat.setChecked(false);
            checkmouth.setChecked(false);
            checkmustache.setChecked(false);
            checknose.setChecked(false);
            checkshoes.setChecked(false);
            arms.setVisibility(View.INVISIBLE);
            ears.setVisibility(View.INVISIBLE);
            eyebrows.setVisibility(View.INVISIBLE);
            eyes.setVisibility(View.INVISIBLE);
            glasses.setVisibility(View.INVISIBLE);
            hat.setVisibility(View.INVISIBLE);
            mouth.setVisibility(View.INVISIBLE);
            mustache.setVisibility(View.INVISIBLE);
            nose.setVisibility(View.INVISIBLE);
            shoes.setVisibility(View.INVISIBLE);
        }
    };
}