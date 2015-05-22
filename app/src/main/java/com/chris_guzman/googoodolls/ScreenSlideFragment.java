package com.chris_guzman.googoodolls;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class ScreenSlideFragment extends Fragment {

    public ScreenSlideFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Bundle args = super.getArguments();
        String msg = args.getString("MSG");
        String title = args.getString("TITLE");
        int pic = args.getInt("PIC");

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

        TextView newMessage = (TextView) rootView.findViewById(R.id.msg);
        TextView newTitle = (TextView) rootView.findViewById(R.id.title);
        ImageView newPic = (ImageView) rootView.findViewById(R.id.splash);

        newMessage.setText(msg);
        newTitle.setText(title);
        newPic.setImageResource(pic);

        return rootView;
    }
}
