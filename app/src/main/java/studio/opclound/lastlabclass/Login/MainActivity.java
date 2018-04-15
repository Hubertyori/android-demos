package studio.opclound.lastlabclass.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.AppPrivateDirectory.AppPrivateDirectoryMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.AssetsFloder.AssetsFloderMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.AudioRecorder.AudioRecorderMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ButtonStartActivity.ButtonStartActivityMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Button_Design.ButtonDesignMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Button_Intent.ButtonIntentMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Button_StartActivity_extra.ButtonStartActivityExtraMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Button_Toast.ButtonToastMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.DataBase.DataBaseMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.EditText.EditTextMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Fingerprint.FingerPrintMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.FragmentOne.FragmentMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.GetColor.GetColorMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.GradientBackGround.GradientBackGroundMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ImageButton.ImageButtonMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ImplicitIntent.ImplicitIntentActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.IntentExtras.IntentMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Layout.LayoutMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Layout_Final.LayoutFinalMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.LifeCycleMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ListView.ListViewMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ListView2.ListView2MainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ListViewCustomerAdapter.ListViewCustomerAdapterMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.RadioButtons_Listener.RadioButtonsListenerMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.RadioButtons_onClick.RadioButtonOnClickMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Service.ServiceMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ServiceDemo.ServiceDemoMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.UserName.UserNameMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.UserName_Final.UserNameFinalMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Weather_App_Design.WeatherAppDesignMainActivity;
import studio.opclound.lastlabclass.Login.Activitys.LifeCycle.WebView.WebViewMainActivity;
import studio.opclound.lastlabclass.R;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener {
    private TextView tvName;
    private ListView lsView;
    private SessionManager session;
    private Intent intent;
private String[] activityName = {"LifeCycle","UserName","UserName_Final","Layout","Layout_Final","Button_Design",
        "Button_Toast","Button_Intent",
        "Button_StartActivity","Button_StartActivity_extra",
        "ImageButton","EditText","RadioButtons_listener","RadioButtons_onclick","listView","GetColor"
        ,"GradientBackground","ImplicitIntent","Weather App Design",
"ListView","ListViewCustomAdapter","AudioRecorder","DataBase","FragmentOne","Webview","ServiceDemo",
        "Service","Fingerprint","AppPrivateDirectory","AssetsFolder","IntentExtras"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.user_name);
        lsView = findViewById(R.id.main_listview);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.main_list_item, R.id.tv_main__item, activityName);
        lsView.setAdapter(mAdapter);
        lsView.setOnItemClickListener(this);

        /**
         * Only logged in users should access this activity
         */
        session = new SessionManager(getApplicationContext());
        if (!session.isLoggedIn()) {
            logout();
        }

        /**
         * If the user just registered an account from Register.class,
         * the parcelable should be retrieved
         */
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // Retrieve the parcelable
            Feedback feedback = bundle.getParcelable("feedback");
            // Get the from the object
            String userName = feedback.getName();
            tvName.setText(userName);
        }


    }

    /**
     * Logging out the user:
     * - Will set isLoggedIn flag to false in SharedPreferences
     * - Clears the user data from SqLite users table
     */

    public void btnLogout(View view) {
        logout();
    }

    public void logout() {
        // Updating the session
        session.setLogin(false);
        // Redirect the user to the login activity
        startActivity(new Intent(this, Login.class));
        finish();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){
            case 0:
                intent = new Intent(this,LifeCycleMainActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this,UserNameMainActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this,UserNameFinalMainActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this,LayoutMainActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this,LayoutFinalMainActivity.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this,ButtonDesignMainActivity.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(this,ButtonToastMainActivity.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(this,ButtonIntentMainActivity.class);
                startActivity(intent);
                break;
            case 8:
                intent = new Intent(this,ButtonStartActivityMainActivity.class);
                startActivity(intent);
                break;
            case 9:
                intent = new Intent(this,ButtonStartActivityExtraMainActivity.class);
                startActivity(intent);
                break;
            case 10:
                intent = new Intent(this,ImageButtonMainActivity.class);
                startActivity(intent);
                break;
            case 11:
                intent = new Intent(this,EditTextMainActivity.class);
                startActivity(intent);
                break;
            case 12:
                intent = new Intent(this,RadioButtonsListenerMainActivity.class);
                startActivity(intent);
                break;
            case 13:
                intent = new Intent(this,RadioButtonOnClickMainActivity.class);
                startActivity(intent);
                break;
            case 14:
                intent = new Intent(this,ListViewMainActivity.class);
                startActivity(intent);
                break;
            case 15:
                intent = new Intent(this,GetColorMainActivity.class);
                startActivity(intent);
                break;
            case 16:
                intent = new Intent(this,GradientBackGroundMainActivity.class);
                startActivity(intent);
                break;
            case 17:
                intent = new Intent(this,ImplicitIntentActivity.class);
                startActivity(intent);
                break;
            case 18:
                intent = new Intent(this,WeatherAppDesignMainActivity.class);
                startActivity(intent);
                break;
            case 19:
                intent = new Intent(this,ListView2MainActivity.class);
                startActivity(intent);
                break;
            case 20:
                intent = new Intent(this,ListViewCustomerAdapterMainActivity.class);
                startActivity(intent);
                break;
            case 21:
                intent = new Intent(this,AudioRecorderMainActivity.class);
                startActivity(intent);
                break;
            case 22:
                intent = new Intent(this,DataBaseMainActivity.class);
                startActivity(intent);
                break;
            case 23:
                intent = new Intent(this,FragmentMainActivity.class);
                startActivity(intent);
                break;
            case 24:
                intent = new Intent(this,WebViewMainActivity.class);
                startActivity(intent);
                break;
            case 25:
                intent = new Intent(this,ServiceDemoMainActivity.class);
                startActivity(intent);
                break;
            case 26:
                intent = new Intent(this,ServiceMainActivity.class);
                startActivity(intent);
                break;
            case 27:
                intent = new Intent(this,FingerPrintMainActivity.class);
                startActivity(intent);
                break;
            case 28:
                intent = new Intent(this,AppPrivateDirectoryMainActivity.class);
                startActivity(intent);
                break;
            case 29:
                intent = new Intent(this,AssetsFloderMainActivity.class);
                startActivity(intent);
                break;
            case 30:
                intent = new Intent(this,IntentMainActivity.class);
                startActivity(intent);
                break;
                default:
                    Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}