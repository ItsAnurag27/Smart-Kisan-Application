package com.example.optimizer;

// Import statements
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.optimizer.nointernet.InternetReceiver;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;



public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

//Spinner spinner;
//public static final String[] languages ={"Select languages","English","hindi"};


    Button button;
    BroadcastReceiver broadcastReceiver = null;
    TextView textView;
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Fix the rotation of the screen to portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_main);


        // Find the ImageView by its ID
        ImageView weatherImageView = findViewById(R.id.weatherid);

        // Set an OnClickListener on the ImageView
        weatherImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(MainActivity.this, MainActivityWeather.class);
                startActivity(intent); // Start the new activity
            }
        });



        // Initialize the BroadcastReceiver
        broadcastReceiver = new InternetReceiver();

        // Register BroadcastReceiver to monitor internet connectivity
        registerInternetStatusReceiver();

        // Your existing code for button click listener
        findViewById(R.id.profilea).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Profile.class));
            }
        });

        button = findViewById(R.id.sign_out);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        // Initialize SwipeRefreshLayout and TextView
//        textView = findViewById(R.id.textView);
//        swipeRefreshLayout = findViewById(R.id.swipe);
//        swipeRefreshLayout.setOnRefreshListener(this);




//        firebase get reference
//       DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("copyright");
//           databaseReference.setValue("All rights reserve");

    }

//    public void setLocal(Activity activity, String langCode){
//        Locale locale =new Locale(langCode);
//        Resources resources = activity.getResources();
//        Configuration config =resources.getConfiguration();
//        config.setLocale(locale);
//        resources.updateConfiguration(config,resources.getDisplayMetrics());
//    }

//    public void setLocal(Activity activity, String langCode){}

    // Method to register the BroadcastReceiver for internet status
    private void registerInternetStatusReceiver() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadcastReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        // Disconnect from the MQTT broker
//        mqttHandler.disconnect();

        // Unregister the BroadcastReceiver when activity is destroyed
        unregisterReceiver(broadcastReceiver);

        super.onDestroy();
    }

    @Override
    public void onRefresh() {
        // Simulate a refresh operation
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Refreshed!");
                swipeRefreshLayout.setRefreshing(false);
            }
        }, 3000);
    }

    private void publishMessage(String topic, String message) {
        Toast.makeText(this, "Publishing message: " + message, Toast.LENGTH_SHORT).show();
//        mqttHandler.publish(topic, message);
    }

    private void subscribeToTopic(String topic) {
        Toast.makeText(this, "Subscribing to topic " + topic, Toast.LENGTH_SHORT).show();
//        mqttHandler.subscribe(topic);
}
}