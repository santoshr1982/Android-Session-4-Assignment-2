package customlistview.rsantosh.com.customlistview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import customlistview.rsantosh.com.customlistview.Model.NameAndPhone;
import customlistview.rsantosh.com.customlistview.R;

/**
 * Created by R.Santosh on 08-05-2016.
 */
public class NameAndPhoneAdapter extends ArrayAdapter {

    //Declaration of variables.
    private ArrayList<NameAndPhone> mNameAndPhone;
    private Context mContext;
    private LayoutInflater mLayoutInflater;


    //Constructor.
    public NameAndPhoneAdapter(Context context, int resource, ArrayList<NameAndPhone> NameAndPhone) {

        super(context, resource);
        this.mContext=context;
        this.mNameAndPhone=NameAndPhone;
        this.mLayoutInflater=LayoutInflater.from(mContext);

    }

    //To get the count of list.
    @Override
    public int getCount() {
        return mNameAndPhone.size();
    }


    //To get the position of the arraylist.
    @Override
    public Object getItem(int position) {
        return mNameAndPhone.get(position);
    }


    //To display the contents in array list.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Checking the nullvalue of convert view.
        if(convertView==null){
            convertView=mLayoutInflater.inflate(R.layout.item_name_and_phone,parent,false);
        }

        //Declaring and initialisation of the tex box.
        TextView textName = (TextView)convertView.findViewById(R.id.name);
        TextView textPhone = (TextView)convertView.findViewById(R.id.phoneNumberumber);

        //Displaying the values in to text boxes.
        NameAndPhone nameAndPhone = (NameAndPhone) getItem(position);
        textName.setText(nameAndPhone.strName);
        textPhone.setText(nameAndPhone.strPhoneNumber);

        return convertView;
    }

}
