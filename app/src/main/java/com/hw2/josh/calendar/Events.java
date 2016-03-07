package com.hw2.josh.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;



public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ContentResolver resolver = getContentResolver();
        String[] EVENT_PROJECTION = new String[]{CalendarContract.Calendars._ID,
                                     CalendarContract.Calendars.CALENDAR_DISPLAY_NAME,
                                     CalendarContract.Calendars.ACCOUNT_NAME,
                                     CalendarContract.Calendars.OWNER_ACCOUNT};
        Uri uri = CalendarContract.Calendars.CONTENT_URI;
        
    }


}
