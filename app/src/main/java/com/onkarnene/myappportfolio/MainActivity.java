package com.onkarnene.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String STR_ONE = "This button will launch my ";
    private final String STR_TWO = " Project";
    private Context m_context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_context = this;
        
        (findViewById(R.id.popularMovieBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_context, STR_ONE + ((Button) view).getText() + STR_TWO, Toast.LENGTH_SHORT).show();
            }
        });

        (findViewById(R.id.stockHawkBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_context, STR_ONE + ((Button) view).getText() + STR_TWO, Toast.LENGTH_SHORT).show();
            }
        });

        (findViewById(R.id.buildBiggerBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_context, STR_ONE + ((Button) view).getText() + STR_TWO, Toast.LENGTH_SHORT).show();
            }
        });

        (findViewById(R.id.appMaterialBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_context, STR_ONE + ((Button) view).getText() + STR_TWO, Toast.LENGTH_SHORT).show();
            }
        });

        (findViewById(R.id.goUbiquitousBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_context, STR_ONE + ((Button) view).getText() + STR_TWO, Toast.LENGTH_SHORT).show();
            }
        });

        (findViewById(R.id.capstoneBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_context, STR_ONE + ((Button) view).getText() + STR_TWO, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
