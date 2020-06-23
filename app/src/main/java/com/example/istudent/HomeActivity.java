package com.example.istudent;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


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

        ListView mListView = (ListView) findViewById(R.id.announcement_list);

        //Create the Person objects
        Announcement today = new Announcement("URGENT", "By: David Friday, 30 April 2019, 11:00AM", "Για την απρόσκοπτη σύνδεση με το Intranet, ΟΣΟΙ ΦΟΙΤΗΤΕΣ έχετε οικονομικές εκκρεμότητες προς το City Unity College, τα royalty fees στο Euraka και τις λίρες του CMET, παρακαλείσθε να τις εξοφλήσετε μέχρι τις 30/3.");
        Announcement yesterday = new Announcement("SPECIAL INFORMATION", "By: Maria Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");
        Announcement monday = new Announcement("JOB ANNOUNCEMENT", "From: Student Support Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");


        Announcement today1 = new Announcement("URGENT", "By: David Friday, 30 April 2019, 11:00AM", "Για την απρόσκοπτη σύνδεση με το Intranet, ΟΣΟΙ ΦΟΙΤΗΤΕΣ έχετε οικονομικές εκκρεμότητες προς το City Unity College, τα royalty fees στο Euraka και τις λίρες του CMET, παρακαλείσθε να τις εξοφλήσετε μέχρι τις 30/3.");
        Announcement yesterday1 = new Announcement("SPECIAL INFORMATION", "By: Maria Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");
        Announcement monday1 = new Announcement("JOB ANNOUNCEMENT", "From: Student Support Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");


        Announcement today2 = new Announcement("URGENT", "By: David Friday, 30 April 2019, 11:00AM", "Για την απρόσκοπτη σύνδεση με το Intranet, ΟΣΟΙ ΦΟΙΤΗΤΕΣ έχετε οικονομικές εκκρεμότητες προς το City Unity College, τα royalty fees στο Euraka και τις λίρες του CMET, παρακαλείσθε να τις εξοφλήσετε μέχρι τις 30/3.");
        Announcement yesterday2 = new Announcement("SPECIAL INFORMATION", "By: Maria Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");
        Announcement monday2 = new Announcement("JOB ANNOUNCEMENT", "From: Student Support Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");


        Announcement today3 = new Announcement("URGENT", "By: David Friday, 30 April 2019, 11:00AM", "Για την απρόσκοπτη σύνδεση με το Intranet, ΟΣΟΙ ΦΟΙΤΗΤΕΣ έχετε οικονομικές εκκρεμότητες προς το City Unity College, τα royalty fees στο Euraka και τις λίρες του CMET, παρακαλείσθε να τις εξοφλήσετε μέχρι τις 30/3.");
        Announcement yesterday3 = new Announcement("SPECIAL INFORMATION", "By: Maria Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");
        Announcement monday3 = new Announcement("JOB ANNOUNCEMENT", "From: Student Support Friday, 30 April 2019, 11:00AM", "Please be kindly informed that you will not be able to have access to the Intranet platform until you pay off your outstanding balance/ amount to City Unity College, your royalty fees to Euraka and/ or your outstanding balance, in pounds, to CMET by the 30th of March. In case you have no outstanding balance towards CUC, Euraka and/ or Cardiff, please ignore this notice.");


        //Add the Announcement objects to an ArrayList
        ArrayList<Announcement> announcements_list = new ArrayList<>();

        announcements_list.add(today);
        announcements_list.add(yesterday);
        announcements_list.add(monday);

        announcements_list.add(today1);
        announcements_list.add(yesterday1);
        announcements_list.add(monday1);

        announcements_list.add(today2);
        announcements_list.add(yesterday2);
        announcements_list.add(monday2);

        announcements_list.add(today3);
        announcements_list.add(yesterday3);
        announcements_list.add(monday3);

        AnnouncementAdapter adapter = new AnnouncementAdapter(this, R.layout.adapter_view_layout, announcements_list);
        mListView.setAdapter(adapter);


        //End List adapter

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
            Intent cal = new Intent(HomeActivity.this,ProfileActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_grades) {
            Intent cal = new Intent(HomeActivity.this,GradeActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_timetable) {
            Intent cal = new Intent(HomeActivity.this,TimeTableActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_message) {
            Intent cal = new Intent(HomeActivity.this,MessageActivity.class);
            startActivity(cal);
        }
        if (id == R.id.action_scan_id) {
            Intent cal = new Intent(HomeActivity.this,ScanActivity.class);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.my_home_page_button) {
            // Handle the home action
        } else if (id == R.id.calendar_button) {
            Intent cal = new Intent(HomeActivity.this,CalendarActivity.class);
            startActivity(cal);

        } else if (id == R.id.library_button) {
            Intent cal = new Intent(HomeActivity.this,LibraryActivity.class);
            startActivity(cal);

        } else if (id == R.id.webmail_button) {
            Intent mailClient = new Intent(Intent.ACTION_VIEW);
            mailClient.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivity");
            startActivity(mailClient);

        } else if (id == R.id.portal_button) {
            Intent edu = new Intent(HomeActivity.this,EduActivity.class);
            startActivity(edu);

        } else if (id == R.id.CIS1_button) {
            Intent cis5006 = new Intent(HomeActivity.this,Course1Activity.class);
            startActivity(cis5006);

        } else if (id == R.id.CIS5_button) {
            Intent cis5006 = new Intent(HomeActivity.this,Course1Activity.class);
            startActivity(cis5006);

        } else if (id == R.id.CIS6_button) {
            Intent cis5006 = new Intent(HomeActivity.this,Course1Activity.class);
            startActivity(cis5006);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
