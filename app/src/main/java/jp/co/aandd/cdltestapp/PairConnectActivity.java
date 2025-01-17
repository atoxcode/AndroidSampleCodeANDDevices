package jp.co.aandd.cdltestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.bluetooth.BluetoothDevice;
import android.widget.Toast;
import android.app.Activity;

import jp.co.aandd.cdltestapp.activity.MainActivity;
import jp.co.aandd.cdltestapp.ble.BleReceivedService;
import jp.co.aandd.cdltestapp.ble.ResultShow;

public class PairConnectActivity extends AppCompatActivity {

    Button pairButton, dataButton, showResult;
    String operation = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pair_connect);

        //Get the Bluetooth device
       final   BluetoothDevice btdevice = getIntent().getExtras().getParcelable("btdevice");
        Log.d("Sim","Bluetooth name of the BT device is " + btdevice.getName());

        //Declare the pair or connect button
        pairButton = (Button) findViewById(R.id.PairButton);
        pairButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.d("AD","User has clicked on the pair button");
                operation = "pair";
                BleReceivedService.getInstance().operation = "pair";
                Intent resultIntent = new Intent();
                resultIntent.putExtra("operation", "pair");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();


            }
        });

        dataButton = (Button) findViewById(R.id.getData);
        dataButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Log.d("AD","User has clicked on the data button");
                operation = "data";
                BleReceivedService.getInstance().operation = "data";
                Intent resultIntent = new Intent();
                resultIntent.putExtra("operation", "data");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();

            }
        });

        showResult = (Button) findViewById(R.id.getData2);
        showResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AD","User has clicked on the data button");
//                operation = "data";
//                BleReceivedService.getInstance().operation = "data";
                Intent resultIntent = new Intent(getApplicationContext(), ResultShow.class);
//                resultIntent.putExtra("operation", "data");
                startActivity(resultIntent);
                finish();

//                Intent intent = new Intent(PairConnectActivity.this, ResultShow.class);
//                startActivity(intent);
            }
        });

        pairButton.setVisibility(View.VISIBLE);
        dataButton.setVisibility(View.VISIBLE);
        showResult.setVisibility(View.VISIBLE);

    }


}
