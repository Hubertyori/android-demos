package studio.opclound.lastlabclass.Login.Activitys.LifeCycle.Button_StartActivity_extra;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *Introduction to intent and Android Manifest 
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import studio.opclound.lastlabclass.R;

public class ButtonStartActivityExtraMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_start_activity_extra_activity_main);


		final EditText userInput =findViewById(R.id.et_input);
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String information = userInput.getText().toString();
				//Todo: handle the case where information is empty
				Intent intent = new Intent(getApplicationContext(),
						ButtonStartActivityExtraSecondActivity.class);
				intent.putExtra("shared_data", information);
				startActivity(intent);
			}
		});
	}

}
