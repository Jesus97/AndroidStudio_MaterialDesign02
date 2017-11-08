package com.iesvirgendelcarmen.dam.materialdesign02;

import android.animation.Animator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Toast;

public class Material02 extends AppCompatActivity {

    public FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material02);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "FAB", Toast.LENGTH_SHORT).show();
            }
        });
        fab.setScaleX(0);
        fab.setScaleY(0);
        final Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);

        fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolador).setDuration(600).setStartDelay(1000).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                fab.animate().scaleX(0).scaleY(0).setInterpolator(interpolador).setDuration(600).start();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }
}
