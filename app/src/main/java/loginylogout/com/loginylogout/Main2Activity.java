package loginylogout.com.loginylogout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button sal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sal = (Button) findViewById(R.id.sal);
        sal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceManager.delPref(v.getContext(),PreferenceManager.PREF_SW1);
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);



            }
        });



    }
}
