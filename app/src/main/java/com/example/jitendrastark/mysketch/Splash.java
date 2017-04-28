package com.example.jitendrastark.mysketch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends Activity
{
    @Override
    protected void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView iv=(ImageView)findViewById(R.id.imageView);
        final ImageView iv1=(ImageView)findViewById(R.id.imageView2);
        final Animation an= AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation an1=AnimationUtils.loadAnimation(getBaseContext(),R.anim.blink);
        iv.startAnimation(an);
        iv1.startAnimation(an1);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        an1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i=new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}

