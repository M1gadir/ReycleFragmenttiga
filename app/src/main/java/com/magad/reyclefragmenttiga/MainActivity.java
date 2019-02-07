package com.magad.reyclefragmenttiga;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.magad.reyclefragmenttiga.fragment.HorizontalFragment;
import com.magad.reyclefragmenttiga.fragment.VerGamFragment;
import com.magad.reyclefragmenttiga.fragment.VertikalFragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        fm = getSupportFragmentManager();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pindah, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment destinationFragment = null;
        switch (item.getItemId()) {
            case R.id.fragmenthor:
                destinationFragment = new HorizontalFragment();
                break;

            case R.id.fragmantver:
                destinationFragment = new VertikalFragment();
                break;

            case R.id.fragmenver2:
                destinationFragment = new VerGamFragment();
                break;
        }

        assert destinationFragment != null;
        fm.beginTransaction().replace(R.id.jajaja, destinationFragment).addToBackStack("any").commit();
        return super.onOptionsItemSelected(item);
    }
}
