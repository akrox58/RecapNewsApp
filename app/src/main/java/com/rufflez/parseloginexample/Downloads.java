package com.rufflez.parseloginexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Downloads extends Activity {


    private String RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533965/index.rss";
    RSSFeed feed;
    String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);

        fileName = "TDRSSFeed2.td";

        File feedFile = getBaseContext().getFileStreamPath(fileName);

        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (conMgr.getActiveNetworkInfo() == null) {

// No connectivity. Check if feed File exists
            if (!feedFile.exists()) {

// No connectivity & Feed file doesn't exist: Show alert to exit
// & check for connectivity
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(
                        "Unable to reach server, \nPlease check your connectivity.")
                        .setTitle("TD RSS Reader")
                        .setCancelable(false)
                        .setPositiveButton("Exit",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        finish();
                                    }
                                });

                AlertDialog alert = builder.create();
                alert.show();
            } else {

// No connectivty and file exists: Read feed from the File
                Toast toast = Toast.makeText(this,
                        "No connectivity! Reading last update...",
                        Toast.LENGTH_LONG);
                toast.show();
                feed = ReadFeed(fileName);
                startLisActivity(feed);
            }

        } else {

// Connected - Start parsing
            new AsyncLoadXMLFeed().execute();

        }
    }

    private void startLisActivity(RSSFeed feed) {

        Bundle bundle = new Bundle();
        bundle.putSerializable("feed", feed);

// launch List activity
        Intent intent = new Intent(Downloads.this, ListAct.class);
        intent.putExtras(bundle);
        startActivity(intent);

// kill this activity
        finish();
    }

    private class AsyncLoadXMLFeed extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {

// Obtain feed
            DOMParser myParser = new DOMParser();
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed1.td";
            RSSFEEDURL = "http://dynamic.feedsportal.com/pf/555218/http://toi.timesofindia.indiatimes.com/rssfeedstopstories.cms";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed3.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533917/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed4.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533924/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed5.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533923/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed6.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533922/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed7.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533922/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed8.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533921/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed9.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533979/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed10.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533975/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            myParser=new DOMParser();
            fileName = "TDRSSFeed11.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533976/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);


            fileName = "TDRSSFeed12.td";
            RSSFEEDURL = "http://timesofindia.feedsportal.com/c/33039/f/533977/index.rss";
            feed = myParser.parseXml(RSSFEEDURL);
            if (feed != null && feed.getItemCount() > 0)
                WriteFeed(feed,fileName);

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            startLisActivity(feed);
        }
    }

    // Method to write the feed to the File
    private void WriteFeed(RSSFeed data,String fileName) {

        FileOutputStream fOut = null;
        ObjectOutputStream osw = null;

        try {
            fOut = openFileOutput(fileName, MODE_PRIVATE);
            osw = new ObjectOutputStream(fOut);
            osw.writeObject(data);
            osw.flush();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                fOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Method to read the feed from the File
    private RSSFeed ReadFeed(String fName) {

        FileInputStream fIn = null;
        ObjectInputStream isr = null;

        RSSFeed _feed = null;
        File feedFile = getBaseContext().getFileStreamPath(fileName);
        if (!feedFile.exists())
            return null;

        try {
            fIn = openFileInput(fName);
            isr = new ObjectInputStream(fIn);

            _feed = (RSSFeed) isr.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                fIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return _feed;
    }
}
