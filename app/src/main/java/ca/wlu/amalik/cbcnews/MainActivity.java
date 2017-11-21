package ca.wlu.amalik.cbcnews;

/**
 * Author: Akanksha Malik
 * ID: 140901360
 * Created 2017-09-17
 */

//Import Statements
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new NewsListFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }
}