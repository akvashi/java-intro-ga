package com.generalassembly.akvashi.myfirstandroid;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    TextView textView;

    EditText editText;

    Button button;
//
//    View.OnClickListener onClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            submit();
//        }
//    };
//
//    public class SubmitOnClickListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View v) {
//
//
//            submit();
//
//        }
//
//    }

//    public void submit( {
//
//    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);

        textView.setTextColor(getResources().getColor(R.color.our_color));

        editText = (EditText) findViewById(R.id.edit_text);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();

                editText.setText("Cleared");

                textView.setText(text);


            }
        });

    }

}
