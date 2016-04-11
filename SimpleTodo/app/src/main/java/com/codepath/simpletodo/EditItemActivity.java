package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText eText = (EditText)findViewById(R.id.editText);
        String initialText = getIntent().getStringExtra("editItem");
        eText.setText(initialText);
        eText.setSelection(initialText.length());
    }


    public void onSave(View view) {
        EditText eText = (EditText)findViewById(R.id.editText);
        Intent data = new Intent();
        data.putExtra("editedText", eText.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }

}
