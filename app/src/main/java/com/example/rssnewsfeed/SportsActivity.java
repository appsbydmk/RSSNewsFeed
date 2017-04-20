package com.example.rssnewsfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class SportsActivity extends Activity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        findViewById(R.id.sports_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.sports_1).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Sports1");
                startActivity(intent);
            }
        });
        findViewById(R.id.sports_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.sports_2).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Sports2");
                startActivity(intent);
            }
        });
        findViewById(R.id.sports_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.sports_3).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Sports3");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sports_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.homepage:
                i = new Intent(getBaseContext(), HomePage.class);
                startActivity(i);
                finish();
                return true;
            case R.id.settings:
                i = new Intent(getBaseContext(), SettingsActivity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.exit:
                finish();
                return true;
        }
        return false;
    }
}
