package com.example.anti.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.btn2)
    Button btn2;

  @BindView(R.id.name2)
    TextView name2;

    @BindView(R.id.last2)
    TextView last2;

    @BindView(R.id.age)
    TextView age;


    @BindView(R.id.pol)
    TextView pol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn2)
    public  void  klik (View v) {

        name2.setText(PreferencesManager.getFirstName(this));
        last2.setText(PreferencesManager.getLastName(this));
        age.setText(PreferencesManager.getAge(this));
        pol.setText(PreferencesManager.isMale(this)? "male": "female");


    }


}
