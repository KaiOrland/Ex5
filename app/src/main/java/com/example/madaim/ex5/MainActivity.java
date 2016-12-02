package com.example.madaim.ex5;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.widget.ListPopupWindow.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        LinearLayout layoutFromXml = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout2, mainLayout, false);

        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(MATCH_PARENT, toPixels(180));
        rlp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        //rlp.setMargins(0,);
        mainLayout.addView(layoutFromXml,rlp);

        LinearLayout layout1 = new LinearLayout(this);
        layout1.setOrientation(LinearLayout.VERTICAL);
        layout1.setBackgroundResource(R.drawable.border);
        rlp = new RelativeLayout.LayoutParams(MATCH_PARENT, toPixels(200));
        rlp.addRule(RelativeLayout.BELOW, R.id.textView);
        rlp.setMargins(0,toPixels(80),0,0);
        mainLayout.addView(layout1,rlp);
        
        TextView text1 = new TextView(this);
        text1.setText(R.string.runTime);
        text1.setWidth(toPixels(400));
        text1.setHeight(toPixels(100));
        text1.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT,WRAP_CONTENT));
        ((LinearLayout) layout1).addView(text1);

        RadioGroup rd1 = new RadioGroup(this);
        rd1.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        ((LinearLayout) layout1).addView(rd1);
        RadioButton rdb1 = new RadioButton(this);
        rdb1.setText("first");

        rdb1.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT,WRAP_CONTENT));
        ((LinearLayout) layout1).addView(rdb1);
        RadioButton rdb2 = new RadioButton(this);
        rdb2.setText("second");
        rdb2.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT,WRAP_CONTENT));
        ((LinearLayout) layout1).addView(rdb2);
    }

    private int toPixels(int dp) {//converts pixels to dp
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }





}

