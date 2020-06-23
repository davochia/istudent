package com.example.istudent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AnnouncementAdapter extends ArrayAdapter <Announcement> {

    private static final String TAG  = "AnnouncementAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView announcement;
        TextView tagName;
        TextView body;
    }

    /**
     * Default constructor for the announcementList_adapter
     * @param context
     * @param resource
     * @param objects
     */
    public AnnouncementAdapter(Context context, int resource, ArrayList<Announcement> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String announcement = getItem(position).getAnnouncement();
        String tagName = getItem(position).getTagName();
        String body = getItem(position).getBody();

        //Create the person object with the information
        Announcement announcement1 = new Announcement(announcement,tagName,body);

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.announcement = (TextView) convertView.findViewById(R.id.text1);
            holder.tagName = (TextView) convertView.findViewById(R.id.text2);
            holder.body = (TextView) convertView.findViewById(R.id.text3);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_animation: R.anim.load_up_animation);
        result.startAnimation(animation);
        lastPosition = position;

        holder.announcement.setText(announcement1.getAnnouncement());
        holder.tagName.setText(announcement1.getTagName());
        holder.body.setText(announcement1.getBody());


        return convertView;
    }
}


