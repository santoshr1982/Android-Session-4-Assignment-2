package customlistview.rsantosh.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import customlistview.rsantosh.com.customlistview.Adapter.NameAndPhoneAdapter;
import customlistview.rsantosh.com.customlistview.Model.NameAndPhone;

public class CustomListView extends AppCompatActivity {


    //Declaration of variables.
    private ArrayList<NameAndPhone> mNameAndPhone;
    private ListView mListView;
    private NameAndPhoneAdapter mNameAndPhoneAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        //Initialisation of variables.
        mNameAndPhone = getNameAndPhone();
        mListView = (ListView)findViewById(R.id.nameAndPhoneList);
        mNameAndPhoneAdapter = new NameAndPhoneAdapter(getApplicationContext(), R.layout.item_name_and_phone,mNameAndPhone);
        mListView.setAdapter(mNameAndPhoneAdapter);

    }

    private ArrayList<NameAndPhone> getNameAndPhone() {

        //Creating the object for array list.
        ArrayList<NameAndPhone> mNameAndPhone = new ArrayList<>();


        //Initialisation of values to array list.
        mNameAndPhone.add(new NameAndPhone("Name 1","Phone Number 1"));
        mNameAndPhone.add(new NameAndPhone("Name 2","Phone Number 2"));
        mNameAndPhone.add(new NameAndPhone("Name 3","Phone Number 3"));
        mNameAndPhone.add(new NameAndPhone("Name 4","Phone Number 4"));
        mNameAndPhone.add(new NameAndPhone("Name 5","Phone Number 5"));
        mNameAndPhone.add(new NameAndPhone("Name 6","Phone Number 6"));
        mNameAndPhone.add(new NameAndPhone("Name 7","Phone Number 7"));

        return mNameAndPhone;
    }
}
