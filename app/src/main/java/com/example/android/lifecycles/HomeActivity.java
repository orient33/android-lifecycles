package com.example.android.lifecycles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.codelabs.lifecycle.R;
import com.example.android.lifecycles.step1.ChronoActivity1;
import com.example.android.lifecycles.step2.ChronoActivity2;
import com.example.android.lifecycles.step3.ChronoActivity3;
import com.example.android.lifecycles.step4.LocationActivity;
import com.example.android.lifecycles.step5.Activity_step5;
import com.example.android.lifecycles.step6.SavedStateActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private final int[] resId = {R.id.s1, R.id.s2, R.id.s3, R.id.s3s,
            R.id.s4, R.id.s4s, R.id.s5, R.id.s5s, R.id.s6, R.id.s6s};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        for (int id : resId) {
            findViewById(id).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Class<?> clz = null;
        switch (v.getId()) {
            case R.id.s1:
                clz = ChronoActivity1.class;
                break;
            case R.id.s2:
                clz = ChronoActivity2.class;
                break;
            case R.id.s3:
                clz = ChronoActivity3.class;
                break;
            case R.id.s3s:
                clz = com.example.android.lifecycles.step3_solution.ChronoActivity3.class;
                break;
            case R.id.s4:
                clz = LocationActivity.class;
                break;
            case R.id.s4s:
                clz = com.example.android.lifecycles.step4_solution.LocationActivity.class;
                break;
            case R.id.s5:
                clz = Activity_step5.class;
                break;
            case R.id.s5s:
                clz = com.example.android.lifecycles.step5_solution.Activity_step5.class;
                break;
            case R.id.s6:
                clz = SavedStateActivity.class;
                break;
            case R.id.s6s:
                clz = com.example.android.lifecycles.step6_solution.SavedStateActivity.class;
                break;
        }
        if (clz != null) {
            startActivity(new Intent(this, clz));
        }
    }
}
