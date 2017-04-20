package com.example.rssnewsfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class SettingsActivity extends Activity {
    Button submit;
    RadioGroup rbg;
    int selCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        submit = (Button) findViewById(R.id.submit);
        rbg = (RadioGroup) findViewById(R.id.rbg_categories);
        selCategory = 0;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int id = rbg.getCheckedRadioButtonId();
                    if (id == R.id.spnews) {
                        selCategory = 1;
                    } else if (id == R.id.technews) {
                        selCategory = 2;
                    } else if (id == R.id.entnews) {
                        selCategory = 3;
                    } else if (id == R.id.polnews) {
                        selCategory = 4;
                    } else if(id == R.id.defaultSettings){
                        selCategory= 0;
                    }

                    FileOutputStream fout = openFileOutput("mydata.txt", MODE_PRIVATE);
                    OutputStreamWriter osw = new OutputStreamWriter(fout);
                    osw.write(String.valueOf(selCategory));
                    osw.close();

                    Toast.makeText(getBaseContext(), "Preferences Saved!", Toast.LENGTH_SHORT).show();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.homepage:
                Intent i = new Intent(getBaseContext(), HomePage.class);
                startActivity(i);
                finish();
                break;
            case R.id.exit:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
