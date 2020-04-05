package edu.qcc.soccerscorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button usamBtn;
    Button usawBtn;

    TextView usamText;
    TextView usawText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usawText = findViewById(R.id.tv_usaw_count);

        usamText = findViewById(R.id.tv_usam_count);


        usawBtn = findViewById(R.id.btn_usaw_win);
        usamBtn = findViewById(R.id.btn_usam_win);
    }

    public void onUsawClicked(View v){
        String cokeCount = usawText.getText().toString().trim();
        int count = Integer.parseInt(cokeCount);
        count++;
        usawText.setText(String.valueOf(count));
    }

    public void onUsamClicked(View v){
        String pepsiCount = usamText.getText().toString().trim();
        int count = Integer.parseInt(pepsiCount);
        count++;
        usamText.setText(String.valueOf(count));
    }

}
