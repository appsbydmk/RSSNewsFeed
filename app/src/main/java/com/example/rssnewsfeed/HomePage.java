package com.example.rssnewsfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class HomePage extends Activity{
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
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
        findViewById(R.id.tech_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tech_1).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Tech1");
                startActivity(intent);
            }
        });
        findViewById(R.id.tech_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Tech2");
                startActivity(intent);
            }
        });
        findViewById(R.id.tech_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tech_3).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Tech3");
                startActivity(intent);
            }
        });
        findViewById(R.id.pol_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.pol_1).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Pol1");
                startActivity(intent);
            }
        });
        findViewById(R.id.pol_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.pol_2).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Pol2");
                startActivity(intent);
            }
        });
        findViewById(R.id.pol_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.pol_3).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Pol3");
                startActivity(intent);
            }
        });
        findViewById(R.id.ent_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.ent_1).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Ent1");
                startActivity(intent);
            }
        });
        findViewById(R.id.ent_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.ent_2).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Ent2");
                startActivity(intent);
            }
        });
        findViewById(R.id.ent_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.ent_3).setBackgroundColor(getResources().getColor(R.color.white));
                intent = new Intent(getBaseContext(), NewsPage.class);
                intent.putExtra("artId","Ent3");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.homepage_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.sports:
                i = new Intent(getBaseContext(), SportsActivity.class);
                startActivity(i);
                //finish();
                return true;
            case R.id.politics:
                i = new Intent(getBaseContext(), PoliticsActivity.class);
                startActivity(i);
                //finish();
                return true;
            case R.id.entertainment:
                i = new Intent(getBaseContext(), EntActivity.class);
                startActivity(i);
                //finish();
                return true;
            case R.id.technology:
                i = new Intent(getBaseContext(), TechActivity.class);
                startActivity(i);
                //finish();
                return true;
            case R.id.settings:
                i = new Intent(getBaseContext(), SettingsActivity.class);
                startActivity(i);
                //finish();
                return true;
            case R.id.exit:
                i = new Intent(getBaseContext(), ExitActivity.class);
                startActivity(i);
                finish();
                return true;
        }
        return false;
    }
}
