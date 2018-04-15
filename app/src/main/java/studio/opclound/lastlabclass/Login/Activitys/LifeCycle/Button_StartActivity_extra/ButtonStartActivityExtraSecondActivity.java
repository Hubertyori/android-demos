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
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import studio.opclound.lastlabclass.R;

public class ButtonStartActivityExtraSecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_start_activity_extra_second_layout);

		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String retrievedInformation = extras.getString("shared_data");
			TextView display = findViewById(R.id.extra_txtLayout);
			display.setText(retrievedInformation);
		}

	}

}
