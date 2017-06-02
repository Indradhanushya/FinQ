package com.exa.finq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.exa.finq.MainActivity;
import com.exa.finq.R;

/**
 * Created by root on 2/6/17.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        findViewById(R.id.floating_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.floating_login) {
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
