package com.rufflez.parseloginexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.parse.ParseUser;
import com.rufflez.parseloginexample.rssurls.Splash1;
import com.rufflez.parseloginexample.rssurls.Splash10;
import com.rufflez.parseloginexample.rssurls.Splash11;
import com.rufflez.parseloginexample.rssurls.Splash2;
import com.rufflez.parseloginexample.rssurls.Splash3;


public class MainHome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_home);

        //top 1
        ((Button) findViewById(R.id.top)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(MainHome.this, Splash1.class));
            }
        });

        //recent 2
        ((Button) findViewById(R.id.recent)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(MainHome.this, Splash2.class));
            }
        });

        //location
        ((Button) findViewById(R.id.location)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(MainHome.this, Location.class));
            }
        });

        //international 3
        ((Button) findViewById(R.id.international)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(MainHome.this, Splash3.class));
            }
        });

        //GENERAL
        ((Button) findViewById(R.id.general)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(MainHome.this, General.class));
            }
        });

        //DOWNLOAD
        ((Button) findViewById(R.id.download)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(MainHome.this, Downloads.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            ParseUser.getCurrentUser().logOut();
            startActivity(new Intent(MainHome.this, DispatchActivity.class));
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
