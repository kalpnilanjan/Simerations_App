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

public class ManagementDetail extends AppCompatActivity {
    ImageView img;
    TextView txt,txt1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_detail);
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
            img.setImageResource(R.drawable.bnb);
            txt.setText(R.string.bnb);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1bP4vQ4NbQOlt6l3WV6ZtRF8lBgQbKMqhee158uueYEY/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 1)
        {
            img.setImageResource(R.drawable.whp);
            txt.setText(R.string.whp);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1wcGUyDAZuOr1FcipNmPOUdk7V5wULxSM91T7LwuwyNg/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 2)
        {
            img.setImageResource(R.drawable.conv);
            txt.setText(R.string.conv);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1XKgNVazTx2eXTInkuajAgUYbzqVuIq9sXve1Bb68HBg/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 3)
        {
            img.setImageResource(R.drawable.fin);
            txt.setText(R.string.fin);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1ao4QehcqubO4Pi7TeSKPvxObK9aLL7O0ZqSMkfhOaE4/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }

        if(y == 4)
        {
            img.setImageResource(R.drawable.lms);
            txt.setText(R.string.lms);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1YJADl24PjX6cXxu_6GIHiUZR39ZNk6FA9EnfM-cxSXE/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 5)
        {
            img.setImageResource(R.drawable.whiz);
            txt.setText(R.string.biz);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1tziBb3t8UPYXt72C9g2ITX3GvQuQJIC3JwL01x48-So/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 6)
        {
            img.setImageResource(R.drawable.cdb);
            txt.setText(R.string.cdb);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1nxUGqghZaQ4MA0deCGrYPCUPAP2gKx_UIcsCc8mkh4E/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }

        if(y == 7)
        {
            img.setImageResource(R.drawable.ams);
            txt.setText(R.string.ams);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1RNwVrDgDEUbKFxCTM60agaO48ZbSyQ6tc-YsYjA94Qg/viewform?fbzx=6956346463121314587";
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
