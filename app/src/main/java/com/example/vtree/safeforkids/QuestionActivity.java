package com.example.vtree.safeforkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_layout);
        Button btnShould,btnShouldnt;
        btnShould = (Button) findViewById(R.id.btnShould);
        btnShouldnt = (Button) findViewById(R.id.btnShouldnt);
        final Customdialog alert = new Customdialog();
        btnShould.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.showDialog(QuestionActivity.this,"Nên");
            }
        });
        btnShouldnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.showDialog(QuestionActivity.this,"Không Nên");
            }
        });
    }
}
