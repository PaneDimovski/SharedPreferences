package com.example.anti.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.slika)
    ImageView slika;

    @BindView(R.id.fm)
    RadioGroup mf;

    @BindView(R.id.m)
    RadioButton male;

    @BindView(R.id.f)
    RadioButton female;

    String pol = "";

    @BindView(R.id.btn)
    Button btn;

    @BindView(R.id.btn1)
    Button btn1;

    @BindView(R.id.name)
    EditText name;

    @BindView(R.id.last)
    EditText last;

    @BindView(R.id.age3)
    EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //  Picasso.with(getActivity()).load(R.drawable.husky).into(slika);

        final RadioGroup mz = (RadioGroup) findViewById(R.id.fm);


        mz.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int radioButtonID = mz.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(radioButtonID);
                // int idx = mz.indexOfChild(radioButton);

                pol = radioButton.getText().toString();
            }
        });

//        String m ;
//        if (pol = m ) {
//
//
//        }


    }


    @OnClick (R.id.btn)
    public  void  klik () {

        PreferencesManager.setFirstName(this, name.getText().toString());
        PreferencesManager.setLastName(this, last.getText().toString());
        PreferencesManager.setAge(this, age.getText().toString());
        PreferencesManager.setIsmale(male.isChecked(), this);

        User user = new User();
        user.setFirstName(name.getText().toString());
        user.setLastName(last.getText().toString());
        user.setAge(age.getText().toString());
        user.setIsMale(male.isChecked());

        Toast.makeText(this, "User Details Saved", Toast.LENGTH_SHORT).show();
    }


    @OnClick (R.id.btn1)
    public  void  klik1 (View v) {

        startActivity(new Intent(MainActivity.this, Main2Activity.class));

    }



}
