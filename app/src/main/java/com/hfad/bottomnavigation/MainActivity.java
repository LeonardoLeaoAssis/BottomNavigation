package com.hfad.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_fav: {
                Toast.makeText(getApplicationContext(), "Favoritos", Toast.LENGTH_LONG).show();

                break;
            }

            case R.id.menu_loc: {
                Toast.makeText(getApplicationContext(), "Localização", Toast.LENGTH_LONG).show();

                break;
            }

            case R.id.menu_track: {
                Toast.makeText(getApplicationContext(), "Caminho", Toast.LENGTH_LONG).show();

                break;
            }
        }

        return true;
    }

}
