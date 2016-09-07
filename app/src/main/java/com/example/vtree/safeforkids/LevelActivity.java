package com.example.vtree.safeforkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {
    private Button btnNormal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_layout);
        btnNormal = (Button)findViewById(R.id.btnNormal);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LevelActivity.this,QuestionActivity.class);
                startActivity(i);
            }
        });
    }
}
