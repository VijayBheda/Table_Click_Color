package com.example.vij.tableclickcolor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

    EditText edt;
    Button submit,admob,admob2;
    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        edt= (EditText) findViewById(R.id.editText);
        submit= (Button) findViewById(R.id.button);
        imgbtn= (ImageButton) findViewById(R.id.imageButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strVal=edt.getText().toString();
                if (strVal.equals("1")){
                    imgbtn.setBackgroundColor(Color.parseColor("#4285F4"));
                }
                else {
                    imgbtn.setBackgroundColor(Color.parseColor("#FF00968"));
                }
            }
        });
        admob= (Button) findViewById(R.id.admob);
        admob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_admob=new Intent(getApplicationContext(),AdMob.class);
                startActivity(i_admob);
            }
        });

        admob2= (Button) findViewById(R.id.admob2);
        admob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_admob2=new Intent(getApplicationContext(),AdMob2.class);
                startActivity(i_admob2);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
    

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
