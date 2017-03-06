package test.android.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adds(5,6);



       // New Branch

    }

    private void adds(int i, int i1) {
        int sum=i+i1;
        Toast.makeText(MainActivity.this,"SUM IS:"+sum,Toast.LENGTH_SHORT).show();
        crateToast("SUM IS:"+sum);
    }



    private void crateToast(String s) {
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();

    }
}
