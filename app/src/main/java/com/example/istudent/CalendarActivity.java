package com.example.istudent;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class CalendarActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private  static final String TAG = "CalendarActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        getSupportActionBar().setDisplayShowTitleEnabled(false);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        // start list adapter

        Log.d(TAG, "onCreate: Started.");

        }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.my_home_page_button) {
            Intent hom = new Intent(CalendarActivity.this,HomeActivity.class);
            startActivity(hom);
        } else if (id == R.id.calendar_button) {
            Intent cal = new Intent(CalendarActivity.this,CalendarActivity.class);
            startActivity(cal);

        } else if (id == R.id.library_button) {
            Intent cal = new Intent(CalendarActivity.this,LibraryActivity.class);
            startActivity(cal);

        } else if (id == R.id.webmail_button) {
            Intent mailClient = new Intent(Intent.ACTION_VIEW);
            mailClient.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivity");
            startActivity(mailClient);

        } else if (id == R.id.portal_button) {
            Intent edu = new Intent(CalendarActivity.this,EduActivity.class);
            startActivity(edu);

        } else if (id == R.id.CIS1_button) {
            Intent cis5006 = new Intent(CalendarActivity.this,Course1Activity.class);
            startActivity(cis5006);

        } else if (id == R.id.CIS5_button) {
            Intent cis5006 = new Intent(CalendarActivity.this,Course1Activity.class);
            startActivity(cis5006);

        } else if (id == R.id.CIS6_button) {
            Intent cis5006 = new Intent(CalendarActivity.this,Course1Activity.class);
            startActivity(cis5006);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

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
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profile) {
            Intent cal = new Intent(CalendarActivity.this,ProfileActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_grades) {
            Intent cal = new Intent(CalendarActivity.this,GradeActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_timetable) {
            Intent cal = new Intent(CalendarActivity.this,TimeTableActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_message) {
            Intent cal = new Intent(CalendarActivity.this,MessageActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_scan_id) {
            Intent cal = new Intent(CalendarActivity.this,ScanActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_logout) {
            Intent loginscreen=new Intent(this,LoginActivity.class);
            loginscreen.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(loginscreen);
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
