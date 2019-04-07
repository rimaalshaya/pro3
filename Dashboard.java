package com.example.pro2;

import android.content.ComponentName;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import static java.nio.file.Paths.get;

public class Dashboard extends MainActivity{
    MyDBHandler dbHandler;
    TextView text ,text2;
    private TextView etName, etPhone , etPass , etEmail , etCredit ;
    //private MyDBHandler dbHandler;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        etName = (TextView) findViewById(R.id.edName);
        etPhone = (TextView) findViewById(R.id.edPhone);
        etPass = (TextView) findViewById(R.id.edPas);
        etEmail = (TextView) findViewById(R.id.edEmil);
        etCredit = (TextView) findViewById(R.id.edCredit);


        dbHandler = new MyDBHandler(getApplicationContext());
        db = dbHandler.getWritableDatabase();//getReadableDatabase



    }

    public void out(View v) {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        dbHandler.close();
        finish();
    }



}