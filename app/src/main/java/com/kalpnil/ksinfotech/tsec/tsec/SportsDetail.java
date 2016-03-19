package com.kalpnil.ksinfotech.tsec.tsec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kalpnil.ksinfotech.tsec.R;

public class SportsDetail extends AppCompatActivity {
    ImageView img;
    TextView txt,txt1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle bun = getIntent().getExtras();
        int y = bun.getInt("x");
        img = (ImageView) findViewById(R.id.img_desc);
        txt = (TextView) findViewById(R.id.textdesc);
        txt1 = (TextView) findViewById(R.id.reg);
        txt1.setText(R.string.register);
        //txt.setMovementMethod(new ScrollingMovementMethod());

        if(y == 0)
        {
            img.setImageResource(R.drawable.stumped);
            txt.setText(R.string.stumped);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/19-7qgxXFmmyN6Q2DZtWwzSJ8FkeZ_MMFPlzqcMXAlUc/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 1)
        {
            img.setImageResource(R.drawable.f2);
            txt.setText(R.string.kicks);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1E6f9wLu4s_4C61c5_dm70PO97w5pQKPK8LKMZXwrUrg/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 2)
        {
            img.setImageResource(R.drawable.uvtt);
            txt.setText(R.string.sas);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1je7Of1HULqtC2qpa-So-LEpQ-Bs2fatFJLkIgs3UZCA/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 3)
        {
            img.setImageResource(R.drawable.sfs);
            txt.setText(R.string.sfs);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1Pke0LulhwMACQt2maC2yLuwF-npYVo-b6eMbnDUD43w/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 4)
        {
            img.setImageResource(R.drawable.bucket2);
            txt.setText(R.string.bucket);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/15AYhIUN9Ngf5QB7GesPELNeIYK03mkHL-RzrkaOOhgQ/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_faculty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id==R.id.home)
        {
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }
}
