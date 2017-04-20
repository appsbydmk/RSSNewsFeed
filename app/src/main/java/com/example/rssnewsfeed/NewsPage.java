package com.example.rssnewsfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsPage extends Activity {

    ImageView title_pic;
    TextView main_content;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);
        title_pic = (ImageView) findViewById(R.id.title_pic);
        main_content = (TextView) findViewById(R.id.main_content);
        intent = getIntent();
        String myId = intent.getStringExtra("artId");
        setNewsPage(myId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.newspage_menu, menu);
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

    public void setNewsPage(String myId) {
        switch (myId) {
            case "Sports1":
                title_pic.setImageResource(R.drawable.david_rudisha);
                main_content.setText(getResources().getString(R.string.sports_main_1));
                break;
            case "Sports2":
                title_pic.setImageResource(R.drawable.united_reuters);
                main_content.setText(getResources().getString(R.string.sports_main_2));
                break;
            case "Sports3":
                title_pic.setImageResource(R.drawable.ashwin_jadeja);
                main_content.setText(getResources().getString(R.string.sports_main_3));
                break;
            case "Ent1":
                title_pic.setImageResource(R.drawable.kaabil);
                main_content.setText(getResources().getString(R.string.ent_main_1));
                break;
            case "Ent2":
                title_pic.setImageResource(R.drawable.vin_deepika);
                main_content.setText(getResources().getString(R.string.ent_main_2));
                break;
            case "Ent3":
                title_pic.setImageResource(R.drawable.ok_jaanu);
                main_content.setText(getResources().getString(R.string.ent_main_3));
                break;
            case "Tech1":
                title_pic.setImageResource(R.drawable.nintendo_switch);
                main_content.setText(getResources().getString(R.string.tech_main_1));
                break;
            case "Tech2":
                title_pic.setImageResource(R.drawable.operaneon_main);
                main_content.setText(getResources().getString(R.string.tech_main_2));
                break;
            case "Tech3":
                title_pic.setImageResource(R.drawable.nokia_6);
                main_content.setText(getResources().getString(R.string.tech_main_3));
                break;
            case "Pol1":
                title_pic.setImageResource(R.drawable.akhileshnew);
                main_content.setText(getResources().getString(R.string.pol_main_1));
                break;
            case "Pol2":
                title_pic.setImageResource(R.drawable.modi_mamata);
                main_content.setText(getResources().getString(R.string.pol_main_2));
                break;
            case "Pol3":
                title_pic.setImageResource(R.drawable.priyanka_dimple);
                main_content.setText(getResources().getString(R.string.pol_main_3));
                break;
        }
    }
}
