package com.example.anti.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.slika)
    ImageView slika;

    @BindView(R.id.fm)
    RadioGroup mf;

    String pol = "";

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


    }


}
