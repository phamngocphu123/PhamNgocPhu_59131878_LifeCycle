package vn.edu.ntu.phamngocphu_59131878_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    TextView NP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","call onCreate ");
        Toast.makeText(getApplicationContext(), "call onCreate ", Toast.LENGTH_SHORT).show();

        NP = findViewById(R.id.PhamNgocPhu);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String tg = sdf.format(new Date());
        NP.setText(tg);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","call onStart ");
        Toast.makeText(getApplicationContext(), "call onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","call onPause ");
        Toast.makeText(getApplicationContext(), "call onPause ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","call onResume");
        Toast.makeText(getApplicationContext(), "call onResume ", Toast.LENGTH_SHORT).show();

        NP = findViewById(R.id.PhamNgocPhu);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String tg = sdf.format(new Date());
        NP.setText(tg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","call onDestroy ");
        Toast.makeText(getApplicationContext(), "call onDestroy ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","call onRestart  ");
        Toast.makeText(getApplicationContext(), "call onRestart ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","call onStop ");
        Toast.makeText(getApplicationContext(), "call onStop ", Toast.LENGTH_SHORT).show();
    }
}
