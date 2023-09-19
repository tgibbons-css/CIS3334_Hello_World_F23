package cis3334.helloworldf23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewMessage;
    Button buttonPressMe;

    // This is a change Tom made in class on Tuesday....

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMessage = findViewById(R.id.textViewMessage);
        setupButton();
    }

    private void setupButton() {
        buttonPressMe = findViewById(R.id.buttonPressMe);
        buttonPressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Hello World");
            }
        });
    }
}