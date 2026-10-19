package com.domenkoder.scrollview;

import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView6 = findViewById(R.id.textView6);
        if (textView6 != null) {
            textView6.setText(Html.fromHtml(getString(R.string.article_content), Html.FROM_HTML_MODE_LEGACY));
        }

        Button buttonComment = findViewById(R.id.buttonComment);
        if (buttonComment != null) {
            buttonComment.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Comment submitted!", Toast.LENGTH_SHORT).show());
        }
    }
}
