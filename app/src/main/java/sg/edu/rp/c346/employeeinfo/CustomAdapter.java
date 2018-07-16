package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16003749 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeItem> employeeList;

    public CustomAdapter(@NonNull Context context, int resource,@NonNull ArrayList<EmployeeItem> objects) {
        super(context,resource,objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.employeeList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvDesc = rowView.findViewById(R.id.tvDescription);
        TextView tvSalary = rowView.findViewById(R.id.tvSalary);
        EmployeeItem currentItem = employeeList.get(position);
        tvName.setText(currentItem.getEmpName());
        tvDesc.setText(currentItem.getEmpDesc());
        tvSalary.setText(String.valueOf(currentItem.getEmpSalary()));
        return rowView;
    }
}
