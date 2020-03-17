package com.example.a2lab.ui.main;


import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.a2lab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {

     TableLayout tableLayout;
     TableRow row1, row2, row3;
     TextView text1, text2, text3;
     ImageView image1, image2, image3;

    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TableLayout tableLayout = new TableLayout(getActivity());
        TableRow row1 = new TableRow(getActivity());
        TableRow row2 = new TableRow(getActivity());
        TableRow row3 = new TableRow(getActivity());

        tableLayout.setShrinkAllColumns(true);
        tableLayout.setStretchAllColumns(true);

        TextView text1 = new TextView(getActivity());
        TextView text2 = new TextView(getActivity());
        TextView text3 = new TextView(getActivity());

        ImageView image1 = new ImageView(getActivity());
        ImageView image2 = new ImageView(getActivity());
        ImageView image3 = new ImageView(getActivity());

        text1.setText("Rockstar Games");
        text2.setText("Rockstar North");
        text3.setText("Rockstar USA");

        image1.setImageResource(R.drawable.rockstargames);
        image2.setImageResource(R.drawable.rockstarnorth);
        image3.setImageResource(R.drawable.rockstarusa);


        row1.addView(text1);
        row1.addView(image1);
        image1.getLayoutParams().height = 200;
        image1.getLayoutParams().width = 200;
        row1.setGravity(Gravity.CENTER);

        row2.addView(text2);
        row2.addView(image2);
        image2.getLayoutParams().height = 200;
        image2.getLayoutParams().width = 200;
        row2.setGravity(Gravity.CENTER);

        row3.addView(text3);
        row3.addView(image3);
        image3.getLayoutParams().height = 200;
        image3.getLayoutParams().width = 200;
        row3.setGravity(Gravity.CENTER);

        tableLayout.addView(row1);
        tableLayout.addView(row2);
        tableLayout.addView(row3);



        return tableLayout;
    }

}
