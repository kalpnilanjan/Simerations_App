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

public class GeneralDetail extends AppCompatActivity {
    ImageView img;
    TextView txt,txt1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_detail);
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
            img.setImageResource(R.drawable.gf);
            txt.setText(R.string.gf);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1F6wBhORYzEFj04Fb9obNshZdjhQY6DMJhVMcKhkG6FQ/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 1)
        {
            img.setImageResource(R.drawable.picturesque);
            txt.setText(R.string.picturesque);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1gB1QUMn3pzmIKOeDetFKcMIW-yaN9YDNzaIQxBSQdzo/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 2)
        {
            img.setImageResource(R.drawable.cc);
            txt.setText(R.string.cc);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1z3_WEtMGq6Wg3EcF5TpQXnE2Jhy9jwFmX6pxuQ799e0/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 3)
        {
            img.setImageResource(R.drawable.jive);
            txt.setText(R.string.jive);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1zE5D8mIRiMhY88ILL_E07leuwrSxSrfkP79Glo7XiiE/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }
        if(y == 4)
        {
            img.setImageResource(R.drawable.paintball);
            txt.setText(R.string.paintball);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/17otVJ6ZS_jiMmL_-YAR83NwTt9dlpdS0TDiOquezLYA/viewform";
                    Intent intent = new Intent(v.getContext(), ViewPapers.class);
                    intent.putExtra("url", url);
                    v.getContext().startActivity(intent);
                }
            });
        }

        if(y == 5)
        {
            img.setImageResource(R.drawable.lan1);
            txt.setText(R.string.lan);
            txt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    url = "https://docs.google.com/forms/d/1GfRRBeGGgmacydj1tuaptxukXRUe6EJcmoPLTIX3d2A/viewform?usp=send_form";
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
