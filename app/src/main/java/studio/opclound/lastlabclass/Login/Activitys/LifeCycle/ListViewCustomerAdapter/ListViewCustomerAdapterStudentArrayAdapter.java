package studio.opclound.lastlabclass.Login.Activitys.LifeCycle.ListViewCustomerAdapter;

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

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


import java.util.List;

import studio.opclound.lastlabclass.R;

/**
 * This is a custom ArrayAdapter that extends ArrayAdapter
 */

class ListViewCustomerAdapterStudentArrayAdapter extends ArrayAdapter<ListViewCustomerAdapterStudent> {
    private int resourceId;

    public ListViewCustomerAdapterStudentArrayAdapter(Context context, int resource, List<ListViewCustomerAdapterStudent> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewCustomerAdapterStudent listViewCustomerAdapterStudent = getItem(position);
        View view;
        ListViewCustomerAdapterViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ListViewCustomerAdapterViewHolder();
            viewHolder.studentName = view.findViewById(R.id.tv_student_name);
            viewHolder.studentId = view.findViewById(R.id.tv_student_id);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ListViewCustomerAdapterViewHolder) view.getTag();

        }

        viewHolder.studentName.setText(listViewCustomerAdapterStudent.getName());
        Log.d(getContext().getPackageName().toString(), listViewCustomerAdapterStudent.getName());
        viewHolder.studentId.setText(String.valueOf(listViewCustomerAdapterStudent.getStudentId()));
        Log.d(getContext().getPackageName().toString(), String.valueOf(listViewCustomerAdapterStudent.getStudentId()));
        return view;

    }


}
