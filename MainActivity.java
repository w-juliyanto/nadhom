package id.almuayyad.ekstra.nadhom;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Typeface;
import static id.almuayyad.ekstra.nadhom.R.string.*;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    StringBuilder teksar = new StringBuilder();
    StringBuilder teksid = new StringBuilder();
    StringBuilder teksrumie = new StringBuilder();
    Typeface custom_font, default_font;
    TextView baris_1_a, baris_1_b, baris_1_c,
            baris_2_a, baris_2_b,baris_2_c,
            baris_3_a, baris_3_b,baris_3_c,
            baris_4_a, baris_4_b,baris_4_c,
            baris_5_a, baris_5_b,baris_5_c,
            baris_6_a, baris_6_b,baris_6_c,
            baris_7_a, baris_7_b,baris_7_c,
            baris_8_a, baris_8_b,baris_8_c,
            baris_9_a, baris_9_b,baris_9_c,
            baris_10_a, baris_10_b,baris_10_c,
            baris_11_a, baris_11_b,baris_11_c,
            baris_12_a, baris_12_b,baris_12_c,
            baris_13_a, baris_13_b,baris_13_c,
            baris_14_a, baris_14_b,baris_14_c,
            baris_15_a, baris_15_b,baris_15_c,
            baris_16_a, baris_16_b,baris_16_c,
            baris_17_a, baris_17_b,baris_17_c,
            baris_18_a, baris_18_b,baris_18_c,
            baris_19_a, baris_19_b,baris_19_c,
            judul_bab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client.connect();
        //Action viewAction = Action.newAction(
        //        Action.TYPE_VIEW, // TODO: choose an action type.
        //        "Main Page", // TODO: Define a title for the content shown.
        // TODO: If you have web page content that matches this app activity's content,
        // make sure this auto-generated web page URL is correct.
        // Otherwise, set the URL to null.
        //        Uri.parse("http://host/path"),
        // TODO: Make sure this auto-generated app deep link URI is correct.
        //        Uri.parse("android-app://com.marwahdigital.joe.yaasiin/http/host/path")
        //);
        //AppIndex.AppIndexApi.start(client, viewAction);

        baris_1_a = (TextView) findViewById(R.id.textView_1_a);
        baris_1_b = (TextView) findViewById(R.id.textView_1_b);
        baris_2_a = (TextView) findViewById(R.id.textView_2_a);
        baris_2_b = (TextView) findViewById(R.id.textView_2_b);
        baris_3_a = (TextView) findViewById(R.id.textView_3_a);
        baris_3_b = (TextView) findViewById(R.id.textView_3_b);
        baris_4_a = (TextView) findViewById(R.id.textView_4_a);
        baris_4_b = (TextView) findViewById(R.id.textView_4_b);
        baris_5_a = (TextView) findViewById(R.id.textView_5_a);
        baris_5_b = (TextView) findViewById(R.id.textView_5_b);
        baris_6_a = (TextView) findViewById(R.id.textView_6_a);
        baris_6_b = (TextView) findViewById(R.id.textView_6_b);
        baris_7_a = (TextView) findViewById(R.id.textView_7_a);
        baris_7_b = (TextView) findViewById(R.id.textView_7_b);
        baris_8_a = (TextView) findViewById(R.id.textView_8_a);
        baris_8_b = (TextView) findViewById(R.id.textView_8_b);
        baris_9_a = (TextView) findViewById(R.id.textView_9_a);
        baris_9_b = (TextView) findViewById(R.id.textView_9_b);
        baris_10_a = (TextView) findViewById(R.id.textView_10_a);
        baris_10_b = (TextView) findViewById(R.id.textView_10_b);
        baris_11_a = (TextView) findViewById(R.id.textView_11_a);
        baris_11_b = (TextView) findViewById(R.id.textView_11_b);
        baris_12_a = (TextView) findViewById(R.id.textView_12_a);
        baris_12_b = (TextView) findViewById(R.id.textView_12_b);
        baris_13_a = (TextView) findViewById(R.id.textView_13_a);
        baris_13_b = (TextView) findViewById(R.id.textView_13_b);
        baris_14_a = (TextView) findViewById(R.id.textView_14_a);
        baris_14_b = (TextView) findViewById(R.id.textView_14_b);
        baris_15_a = (TextView) findViewById(R.id.textView_15_a);
        baris_15_b = (TextView) findViewById(R.id.textView_15_b);
        baris_16_a = (TextView) findViewById(R.id.textView_16_a);
        baris_16_b = (TextView) findViewById(R.id.textView_16_b);
        baris_17_a = (TextView) findViewById(R.id.textView_17_a);
        baris_17_b = (TextView) findViewById(R.id.textView_17_b);
        baris_18_a = (TextView) findViewById(R.id.textView_18_a);
        baris_18_b = (TextView) findViewById(R.id.textView_18_b);
        baris_19_a = (TextView) findViewById(R.id.textView_19_a);
        baris_19_b = (TextView) findViewById(R.id.textView_19_b);
        baris_1_c = (TextView) findViewById(R.id.textView_sep_1);
        baris_2_c = (TextView) findViewById(R.id.textView_sep_2);
        baris_3_c = (TextView) findViewById(R.id.textView_sep_3);
        baris_4_c = (TextView) findViewById(R.id.textView_sep_4);
        baris_5_c = (TextView) findViewById(R.id.textView_sep_5);
        baris_6_c = (TextView) findViewById(R.id.textView_sep_6);
        baris_7_c = (TextView) findViewById(R.id.textView_sep_7);
        baris_8_c = (TextView) findViewById(R.id.textView_sep_8);
        baris_9_c = (TextView) findViewById(R.id.textView_sep_9);
        baris_10_c = (TextView) findViewById(R.id.textView_sep_10);
        baris_11_c = (TextView) findViewById(R.id.textView_sep_11);
        baris_12_c = (TextView) findViewById(R.id.textView_sep_12);
        baris_13_c = (TextView) findViewById(R.id.textView_sep_13);
        baris_14_c = (TextView) findViewById(R.id.textView_sep_14);
        baris_15_c = (TextView) findViewById(R.id.textView_sep_15);
        baris_16_c = (TextView) findViewById(R.id.textView_sep_16);
        baris_17_c = (TextView) findViewById(R.id.textView_sep_17);
        baris_18_c = (TextView) findViewById(R.id.textView_sep_18);
        baris_19_c = (TextView) findViewById(R.id.textView_sep_19);
        judul_bab = (TextView) findViewById(R.id.textView_judul_bab);

    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.bab_1) { //19
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1));judul_bab.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_1_b));baris_1_b.setText(teksar.toString());baris_1_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_2_b));baris_2_b.setText(teksar.toString());baris_2_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_3_b));baris_3_b.setText(teksar.toString());baris_3_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_4_b));baris_4_b.setText(teksar.toString());baris_4_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_5_b));baris_5_b.setText(teksar.toString());baris_5_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_6_b));baris_6_b.setText(teksar.toString());baris_6_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_7_b));baris_7_b.setText(teksar.toString());baris_7_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_8_b));baris_8_b.setText(teksar.toString());baris_8_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_9_b));baris_9_b.setText(teksar.toString());baris_9_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_10_a));baris_10_a.setText(teksar.toString()); 
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_10_b));baris_10_b.setText(teksar.toString()); baris_10_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_11_a));baris_11_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_11_b));baris_11_b.setText(teksar.toString());baris_11_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_12_a));baris_12_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_12_b));baris_12_b.setText(teksar.toString());baris_12_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_13_a));baris_13_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_13_b));baris_13_b.setText(teksar.toString());baris_13_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_14_a));baris_14_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_14_b));baris_14_b.setText(teksar.toString());baris_14_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_15_a));baris_15_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_15_b));baris_15_b.setText(teksar.toString());baris_15_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_16_a));baris_16_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_16_b));baris_16_b.setText(teksar.toString());baris_16_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_17_a));baris_17_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_17_b));baris_17_b.setText(teksar.toString());baris_17_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_18_a));baris_18_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_18_b));baris_18_b.setText(teksar.toString());baris_18_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_19_a));baris_19_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_1_19_b));baris_19_b.setText(teksar.toString());baris_19_c.setText(" * ");

        } else if (id == R.id.bab_2) {//7
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_1_b));baris_1_b.setText(teksar.toString());baris_1_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_2_b));baris_2_b.setText(teksar.toString());baris_2_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_3_b));baris_3_b.setText(teksar.toString());baris_3_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_4_b));baris_4_b.setText(teksar.toString());baris_4_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_5_b));baris_5_b.setText(teksar.toString());baris_5_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_6_b));baris_6_b.setText(teksar.toString());baris_6_c.setText(" * ");
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_2_7_b));baris_7_b.setText(teksar.toString());baris_7_c.setText(" * ");
            baris_8_a.setText("");
            baris_8_b.setText("");baris_8_c.setText("  ");
            baris_9_a.setText("");
            baris_9_b.setText("");baris_9_c.setText("  ");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); baris_10_c.setText("  ");
            baris_11_a.setText("");
            baris_11_b.setText("");baris_11_c.setText("  ");
            baris_12_a.setText("");
            baris_12_b.setText("");baris_12_c.setText("  ");
            baris_13_a.setText("");
            baris_13_b.setText("");baris_13_c.setText("  ");
            baris_14_a.setText("");
            baris_14_b.setText("");baris_14_c.setText("  ");
            baris_15_a.setText("");
            baris_15_b.setText("");baris_15_c.setText("  ");
            baris_16_a.setText("");
            baris_16_b.setText("");baris_16_c.setText("  ");
            baris_17_a.setText("");
            baris_17_b.setText("");baris_17_c.setText("  ");
            baris_18_a.setText("");
            baris_18_b.setText("");baris_18_c.setText("  ");
            baris_19_a.setText("");
            baris_19_b.setText("");baris_19_c.setText("  ");
			
        } else if (id == R.id.bab_3) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_3_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_4) {//9
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_8_b));baris_8_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_4_9_b));baris_9_b.setText(teksar.toString());
			baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_5) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_5_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_6) {//9
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_8_b));baris_8_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_6_9_b));baris_9_b.setText(teksar.toString());
			baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_7) {//10
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_1_a));baris_1_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_1_b));baris_1_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_2_a));baris_2_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_2_b));baris_2_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_3_a));baris_3_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_3_b));baris_3_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_4_a));baris_4_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_4_b));baris_4_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_5_a));baris_5_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_5_b));baris_5_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_6_a));baris_6_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_7_a));baris_7_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_7_b));baris_7_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_8_a));baris_8_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_8_b));baris_8_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_9_a));baris_9_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_9_b));baris_9_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_10_a));baris_10_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_7_10_b));baris_10_b.setText(teksar.toString());
			baris_11_a.setText("");
			baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_8) {//11
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_1_a));baris_1_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_1_b));baris_1_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_2_a));baris_2_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_2_b));baris_2_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_3_a));baris_3_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_3_b));baris_3_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_4_a));baris_4_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_4_b));baris_4_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_5_a));baris_5_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_5_b));baris_5_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_6_a));baris_6_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_7_a));baris_7_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_7_b));baris_7_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_8_a));baris_8_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_8_b));baris_8_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_9_a));baris_9_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_9_b));baris_9_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_10_a));baris_10_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_10_b));baris_10_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_11_a));baris_11_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_8_11_b));baris_11_b.setText(teksar.toString());
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_9) {//12
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_1_a));baris_1_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_1_b));baris_1_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_2_a));baris_2_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_2_b));baris_2_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_3_a));baris_3_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_3_b));baris_3_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_4_a));baris_4_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_4_b));baris_4_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_5_a));baris_5_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_5_b));baris_5_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_6_a));baris_6_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_7_a));baris_7_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_7_b));baris_7_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_8_a));baris_8_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_8_b));baris_8_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_9_a));baris_9_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_9_b));baris_9_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_10_a));baris_10_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_10_b));baris_10_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_11_a));baris_11_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_11_b));baris_11_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_12_b));baris_12_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_9_12_b));baris_12_b.setText(teksar.toString());
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_10) {//7
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_10_7_b));baris_7_b.setText(teksar.toString());
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_11) {//11
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_1_a));baris_1_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_1_b));baris_1_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_2_a));baris_2_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_2_b));baris_2_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_3_a));baris_3_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_3_b));baris_3_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_4_a));baris_4_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_4_b));baris_4_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_5_a));baris_5_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_5_b));baris_5_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_6_a));baris_6_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_7_a));baris_7_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_7_b));baris_7_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_8_a));baris_8_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_8_b));baris_8_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_9_a));baris_9_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_9_b));baris_9_b.setText(teksar.toString());
			//teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_10_a));baris_10_a.setText(teksar.toString());
			//teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_10_b));baris_10_b.setText(teksar.toString());
			//teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_11_a));baris_11_a.setText(teksar.toString());
			//teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_11_11_b));baris_11_b.setText(teksar.toString());
            baris_10_a.setText("");
            baris_10_b.setText("");
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_12) {//9
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_4_b));baris_4_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_5_b));baris_5_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_7_b));baris_7_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_8_b));baris_8_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_12_9_b));baris_9_b.setText(teksar.toString());
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_13) {//7
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_13_7_b));baris_7_b.setText(teksar.toString());
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_14) {//12
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_8_b));baris_8_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_9_b));baris_9_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_10_a));baris_10_a.setText(teksar.toString()); 
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_10_b));baris_10_b.setText(teksar.toString()); 
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_11_a));baris_11_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_11_b));baris_11_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_12_a));baris_12_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_14_12_b));baris_12_b.setText(teksar.toString());
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_15) {//6
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_15_6_b));baris_6_b.setText(teksar.toString());
			baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_16) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_16_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_17) {//4
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_17_4_b));baris_4_b.setText(teksar.toString());
            baris_5_a.setText("");
            baris_5_b.setText("");
            baris_6_a.setText("");
            baris_6_b.setText("");
			baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_18) {//9
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_8_b));baris_8_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_18_9_b));baris_9_b.setText(teksar.toString());
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_19) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_19_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_20) {//7
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_20_7_b));baris_7_b.setText(teksar.toString());
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_21) {//7
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_21_7_b));baris_7_b.setText(teksar.toString());
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_22) {//8
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_22_8_b));baris_8_b.setText(teksar.toString());            
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_23) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_23_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_24) {//10
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_8_b));baris_8_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_9_b));baris_9_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_10_a));baris_10_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_24_10_b));baris_10_b.setText(teksar.toString());
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_25) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_25_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_26) {//5
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_26_5_b));baris_5_b.setText(teksar.toString());
            baris_6_a.setText("");
            baris_6_b.setText("");
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_27) {//11
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_1_a));baris_1_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_1_b));baris_1_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_2_a));baris_2_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_2_b));baris_2_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_3_a));baris_3_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_3_b));baris_3_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_4_a));baris_4_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_4_b));baris_4_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_5_a));baris_5_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_5_b));baris_5_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_6_a));baris_6_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_6_b));baris_6_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_7_a));baris_7_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_7_b));baris_7_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_8_a));baris_8_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_8_b));baris_8_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_9_a));baris_9_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_9_b));baris_9_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_10_a));baris_10_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_10_b));baris_10_b.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_11_a));baris_11_a.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_27_11_b));baris_11_b.setText(teksar.toString());
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_28) {//7
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_28_7_b));baris_7_b.setText(teksar.toString());
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_29) {//6
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_29_6_b));baris_6_b.setText(teksar.toString());
            baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");

        } else if (id == R.id.bab_30) {//3
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_30_3_b));baris_3_b.setText(teksar.toString());
            baris_4_a.setText("");
            baris_4_b.setText("");
            baris_5_a.setText("");
            baris_5_b.setText("");
            baris_6_a.setText("");
            baris_6_b.setText("");
			baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_31) {//3
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_31_3_b));baris_3_b.setText(teksar.toString());
            baris_4_a.setText("");
            baris_4_b.setText("");
            baris_5_a.setText("");
            baris_5_b.setText("");
            baris_6_a.setText("");
            baris_6_b.setText("");
			baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_32) {//4
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_32_4_b));baris_4_b.setText(teksar.toString());            
            baris_5_a.setText("");
            baris_5_b.setText("");
            baris_6_a.setText("");
            baris_6_b.setText("");
			baris_7_a.setText("");
            baris_7_b.setText("");
            baris_8_a.setText("");
            baris_8_b.setText("");
            baris_9_a.setText("");
            baris_9_b.setText("");
            baris_10_a.setText(""); 
            baris_10_b.setText(""); 
            baris_11_a.setText("");
            baris_11_b.setText("");
            baris_12_a.setText("");
            baris_12_b.setText("");
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
			
        } else if (id == R.id.bab_33) {//12
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33));judul_bab.setText(teksar.toString());
			teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_1_a));baris_1_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_1_b));baris_1_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_2_a));baris_2_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_2_b));baris_2_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_3_a));baris_3_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_3_b));baris_3_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_4_a));baris_4_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_4_b));baris_4_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_5_a));baris_5_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_5_b));baris_5_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_6_a));baris_6_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_6_b));baris_6_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_7_a));baris_7_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_7_b));baris_7_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_8_a));baris_8_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_8_b));baris_8_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_9_a));baris_9_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_9_b));baris_9_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_10_a));baris_10_a.setText(teksar.toString()); 
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_10_b));baris_10_b.setText(teksar.toString()); 
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_11_a));baris_11_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_11_b));baris_11_b.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_12_a));baris_12_a.setText(teksar.toString());
            teksar.delete(0, teksar.length());teksar = teksar.append(getResources().getText(ar_im_33_12_b));baris_12_b.setText(teksar.toString());
            baris_13_a.setText("");
            baris_13_b.setText("");
            baris_14_a.setText("");
            baris_14_b.setText("");
            baris_15_a.setText("");
            baris_15_b.setText("");
            baris_16_a.setText("");
            baris_16_b.setText("");
            baris_17_a.setText("");
            baris_17_b.setText("");
            baris_18_a.setText("");
            baris_18_b.setText("");
            baris_19_a.setText("");
            baris_19_b.setText("");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
