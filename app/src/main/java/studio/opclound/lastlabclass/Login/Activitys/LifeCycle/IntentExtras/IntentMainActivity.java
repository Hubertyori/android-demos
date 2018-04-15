package studio.opclound.lastlabclass.Login.Activitys.LifeCycle.IntentExtras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import studio.opclound.lastlabclass.R;

public class IntentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_activity_main);

    }

    public void btnClick(View view) {
        String value = "Hello World! - This message was from the first activity.";
        Intent intent = new Intent(getApplicationContext(), NewActivity.class);
        intent.putExtra("keyword", value);
        startActivity(intent);
    }
}
