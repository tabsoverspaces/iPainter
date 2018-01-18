package com.dragan.ipainter.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dragan.ipainter.R;
import com.dragan.ipainter.backend_classes_main.Project;

public class NewProjectActivity extends AppCompatActivity {

    private EditText projectNameText;
    private EditText projectLocationText;
    private EditText clientNameText;
    private Button backButton;
    private Button createProjectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);

        this.defineCreateProjectWidgets();
    }

    /**
     * Method used to create and define behaviour for widgets that are set up in the activity
     */
    private void defineCreateProjectWidgets()
    {
        // find components
        this.projectNameText = (EditText)findViewById(R.id.projectNameTextField);
        this.projectLocationText = (EditText)findViewById(R.id.locationTextField);
        this.clientNameText = (EditText)findViewById(R.id.clientNameTextField);
        this.backButton = (Button)findViewById(R.id.backButton);
        this.createProjectButton = (Button)findViewById(R.id.createProjectButton);

        this.createProjectButton.setEnabled(false);

        // add listeners to text fields
        this.projectNameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if((NewProjectActivity.this.projectNameText.getText().toString().length()>0))
                {
                    NewProjectActivity.this.createProjectButton.setEnabled(true);
                }
                else
                {
                    NewProjectActivity.this.createProjectButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        // add listeners to buttons
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                setResult(Activity.RESULT_CANCELED, returnIntent);
                finish();
            }
        });

        this.createProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String projectName = NewProjectActivity.this.projectNameText.getText().toString();
                String location = NewProjectActivity.this.projectLocationText.getText().toString();
                String clientName = NewProjectActivity.this.clientNameText.getText().toString();

                Project project = new Project(projectName, location, clientName);

                // create intent with data
                Intent returnIntent = new Intent();
                returnIntent.putExtra("project", project);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });


    }
}
