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

public class CulturalDetail extends AppCompatActivity {
    ImageView img;
    TextView txt,txt1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_detail);
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
            img.setImageResource(R.drawable.bbt);
            txt.setText(R.string.bbt);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1lC03zdsalLWuNQDHBXSJZmbFRlZ9pfJHqzJFtoRVCm8/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 1)
        {
            img.setImageResource(R.drawable.lwd);
            txt.setText(R.string.lwd);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1wJ9ABPunwx7Z4OV0E8wJi0RO7gSowp1Kvr2H2AbYIxs/viewform?usp=send_form";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 2)
        {
            img.setImageResource(R.drawable.sd);
            txt.setText(R.string.sd);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1rIcKjJm-ssW9MPpzx0ZC0qdBa23xr3OqHvZoJsLReHM/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 3)
        {
            img.setImageResource(R.drawable.wod);
            txt.setText(R.string.wod);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1i7GYKZFdoa3QYTzQ74BPTyR9c5S_RZJAJ28agoGWqw4/viewform?usp=send_form";
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
