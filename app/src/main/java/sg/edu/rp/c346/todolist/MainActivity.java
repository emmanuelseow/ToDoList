package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<AndroidVersion> alToDo;
    ArrayAdapter aaToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listviewToDo);

        alToDo = new ArrayList<AndroidVersion>();
        alToDo.add(new AndroidVersion("MSA", "1/7/2019"));
        alToDo.add(new AndroidVersion("Go For Haircut", "22/9/2019"));

        aaToDo = new ArrayAdapter(this, android.R.layout.simple_list_item_1, alToDo);
        lvToDo.setAdapter(aaToDo);
    }
}
