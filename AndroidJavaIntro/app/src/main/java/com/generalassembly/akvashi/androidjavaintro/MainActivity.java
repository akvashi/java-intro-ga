package com.generalassembly.akvashi.androidjavaintro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total;

    private TextView totalLabel;
    private Button addButton;
    private EditText nextNumberEdit;
    AddClicked clickListener = new AddClicked();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        totalLabel = (TextView) findViewById(R.id.total_label);
        addButton = (Button) findViewById(R.id.add_button);
        nextNumberEdit = (EditText) findViewById(R.id.next_number_edit);

        //Lesson on objects

        addButton.setOnClickListener(clickListener);

    }

    //Lesson on methods
    private void add() {

        String fromEdit = "OUr on click listener " + clickListener;

        Log.d("HERESTAG", fromEdit);

        //Lesson on types
//        int nextNumber = Integer.parseInt(fromEdit);

        //Lesson on operators
//        total = total + nextNumber;
        //total += nextNumber;

//        Integer totalObject = total;

        totalLabel.setText(fromEdit);

    }

    //Lesson on classes
    private class AddClicked implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            add();

        }

        @Override
        public String toString() {
            return "THIS IS AN ADDCLICK!";
        }
    }

    private void multiplier() {

        String fromEdit = nextNumberEdit.getText().toString();
        int nextNumber = Integer.parseInt(fromEdit);
        total = total + nextNumber;
        Integer totalObject = total;
        totalLabel.setText(totalObject.toString());

    }

    private void clear() {

    }


    //Lesson on classes
    private class MultiplierClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            multiplier();

        }
    }

}
