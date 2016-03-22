package com.example.android.demofullanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button demo,btnscale,btnrotate,btnmove,btn_translte,btncustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Animation animation= AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        final Animation animscale=AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        final Animation animationrotate=AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        final Animation animationtranslate=AnimationUtils.loadAnimation(this,R.anim.anim_translate);
        btncustom=(Button)findViewById(R.id.btn_custom);
        btncustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet set=new AnimationSet(false);
                set.addAnimation(animation);
                set.addAnimation(animscale);
                set.addAnimation(animationrotate);
                set.addAnimation(animationtranslate);
               v.startAnimation(set);
            }
        });








        btn_translte=(Button)findViewById(R.id.btn_stranslate);
        btn_translte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationtranslate);

            }
        });







        btnmove=(Button)findViewById(R.id.btn_move);
        btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TranslateAnimation translateAnimation=new TranslateAnimation(0,300,0,700);
                translateAnimation.setDuration(3000);
                translateAnimation.setFillAfter(false);

                translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(getApplicationContext(), "Bat dau", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Toast.makeText(getApplicationContext(), "Ket thuc", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btnmove.startAnimation(translateAnimation);
            }
        });






        btnrotate=(Button)findViewById(R.id.btn_rotate);
        btnrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  v.startAnimation(animationrotate);
            }
        });







        btnscale=(Button)findViewById(R.id.btn_scale);

        btnscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animscale);

            }
        });






        demo=(Button)findViewById(R.id.btn_demo);
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             v.startAnimation(animation);
            }
        });
    }
}
