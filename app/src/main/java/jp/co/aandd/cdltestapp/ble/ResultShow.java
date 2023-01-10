package jp.co.aandd.cdltestapp.ble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jp.co.aandd.cdltestapp.R;

public class ResultShow extends AppCompatActivity {

    public static TextView sysResult, diasResult, pulseResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_show);

//        Intent resultIntent = getIntent();
//        resultIntent.getStringExtra("operation");
//
//        sysResult = (TextView) findViewById(R.id.sysResult);
//        diasResult = (TextView) findViewById(R.id.diasResult);
//        pulseResult = (TextView) findViewById(R.id.pulseResult);
    }
}