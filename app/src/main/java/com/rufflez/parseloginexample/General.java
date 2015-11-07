package com.rufflez.parseloginexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.parse.ParseUser;
import com.rufflez.parseloginexample.rssurls.Splash1;
import com.rufflez.parseloginexample.rssurls.Splash2;
import com.rufflez.parseloginexample.rssurls.Splash3;
import com.rufflez.parseloginexample.rssurls.Splash4;
import com.rufflez.parseloginexample.rssurls.Splash5;
import com.rufflez.parseloginexample.rssurls.Splash6;
import com.rufflez.parseloginexample.rssurls.Splash7;
import com.rufflez.parseloginexample.rssurls.Splash8;


public class General extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.general);

        //education 4
        ((Button) findViewById(R.id.edu)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(General.this, Splash4.class));
            }
        });

        //technical 5
        ((Button) findViewById(R.id.tech)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(General.this, Splash5.class));
            }
        });

        //business 6
        ((Button) findViewById(R.id.business)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(General.this, Splash6.class));
            }
        });

        //science 7
        ((Button) findViewById(R.id.science)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(General.this, Splash7.class));
            }
        });

        //sports 8
        ((Button) findViewById(R.id.sports)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Starts an intent for the sign up activity
                startActivity(new Intent(General.this, Splash8.class));
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
            startActivity(new Intent(General.this, DispatchActivity.class));
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
