package com.example.rssnewsfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.io.File;
import java.io.FileInputStream;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        } else {


            getActionBar().hide();

            Thread background = new Thread() {
                public void run() {

                    try {
                        sleep(1000);
                        File f = getBaseContext().getFileStreamPath("mydata.txt");
                        Intent i;
                        if (f.exists()) {
                            FileInputStream fin = openFileInput("mydata.txt");
                            int c;
                            String temp = "";
                            while ((c = fin.read()) > 0) {
                                temp += Character.toString((char) c);
                            }

                            switch (temp) {
                                case "1":
                                    i = new Intent(getBaseContext(), SportsActivity.class);
                                    startActivity(i);
                                    finish();
                                    break;
                                case "2":
                                    i = new Intent(getBaseContext(), TechActivity.class);
                                    startActivity(i);
                                    finish();
                                    break;
                                case "3":
                                    i = new Intent(getBaseContext(), EntActivity.class);
                                    startActivity(i);
                                    finish();
                                    break;
                                case "4":
                                    i = new Intent(getBaseContext(), PoliticsActivity.class);
                                    startActivity(i);
                                    finish();
                                    break;
                                case "0":
                                    i = new Intent(getBaseContext(), HomePage.class);
                                    startActivity(i);
                                    finish();
                                    break;
                            }
                        } else {
                            i = new Intent(getBaseContext(), HomePage.class);
                            startActivity(i);
                            finish();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            background.start();
        }
    }
}
