package studio.opclound.lastlabclass.Login.Activitys.LifeCycle.RadioButtons_onClick;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import studio.opclound.lastlabclass.R;

public class RadioButtonOnClickMainActivity extends Activity {
	RadioGroup radiogroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.redio_button_onclick_activity_main);
		
		// Connect the radioGroup
		radiogroup = (RadioGroup) findViewById(R.id.radioGroup);

		// Connect the button
		Button btn = (Button) findViewById(R.id.btn);
		// Adding a listener
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// retrieve the radio button that was selected
				int radioSelected = radiogroup.getCheckedRadioButtonId();

				// get the text associated with that radioId
				RadioButton selected = (RadioButton) findViewById(radioSelected);
				// Show a toast
				/**
				 * See the differences between the two toast below and try to
				 * understand
				 **/
				// Toast.makeText(getBaseContext(), selected+"",
				// Toast.LENGTH_SHORT).show();

				Toast.makeText(getBaseContext(), selected.getText(),
						Toast.LENGTH_SHORT).show();

			}
		});

	}

}
