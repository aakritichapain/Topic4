package com.aakriti.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ExplictIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explict_intent);

        TextView tvText = findViewById(R.id.tvText);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String message= bundle.getString("Capital");
            tvText.setText(message);

        }
        else
        {
            Toast.makeText(this, "No message", Toast.LENGTH_SHORT).show();
        }

    }
}
