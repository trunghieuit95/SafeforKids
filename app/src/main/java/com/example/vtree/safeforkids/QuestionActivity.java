package com.example.vtree.safeforkids;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_layout);
        Button btnShould,btnShouldnt;
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.medal_gold_2);
        btnShould = (Button) findViewById(R.id.btnShould);
        btnShouldnt = (Button) findViewById(R.id.btnShouldnt);
        final AlertDialog.Builder builder =
                new AlertDialog.Builder(this);
        builder.setMessage("Message above the image");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
        //builder.setView(image);
        btnShould.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.create().show();
            }
        });
        btnShouldnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.create().show();
            }
        });
    }
}
