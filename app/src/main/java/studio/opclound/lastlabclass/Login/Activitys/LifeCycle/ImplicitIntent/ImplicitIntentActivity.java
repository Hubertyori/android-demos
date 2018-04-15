package studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ImplicitIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ImplicitIntent.AppIntentCaller.IntentCallerMainActivity;
import studio.opclound.lastlabclass.R;

public class ImplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
    }

    public void btn1onclick(View view) {
        Intent intent = new Intent(this, IntentCallerMainActivity.class);
        startActivity(intent);

    }

    public void btn2onclick(View view) {
        Intent intent = new Intent(this, IntentCallerMainActivity.class);
        startActivity(intent);

    }
}
