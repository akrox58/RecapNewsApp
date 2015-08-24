package com.rufflez.parseloginexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.parse.ParseUser;
import com.rufflez.parseloginexample.rssurls.Splash10;
import com.rufflez.parseloginexample.rssurls.Splash11;
import com.rufflez.parseloginexample.rssurls.Splash12;
import com.rufflez.parseloginexample.rssurls.Splash4;
import com.rufflez.parseloginexample.rssurls.Splash5;
import com.rufflez.parseloginexample.rssurls.Splash6;
import com.rufflez.parseloginexample.rssurls.Splash7;
import com.rufflez.parseloginexample.rssurls.Splash8;
import com.rufflez.parseloginexample.rssurls.Splash9;


public class Location extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        ((Button) findViewById(R.id.chennai)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(Location.this, Splash9.class));
            }
        });
        ((Button) findViewById(R.id.bombay)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(Location.this, Splash10.class));
            }
        });
        ((Button) findViewById(R.id.delhi)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(Location.this, Splash11.class));
            }
        });
        ((Button) findViewById(R.id.bangalore)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(Location.this, Splash12.class));
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
            startActivity(new Intent(Location.this, DispatchActivity.class));
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
