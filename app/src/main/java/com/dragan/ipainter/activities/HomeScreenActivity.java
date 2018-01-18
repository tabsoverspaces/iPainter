package com.dragan.ipainter.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dragan.ipainter.R;
import com.dragan.ipainter.backend_classes_main.Project;

public class HomeScreenActivity extends AppCompatActivity {

    private Button newProjectButton;
    private TextView selectedProjectLabel;
    private Button goToProject;

    // selected project object
    private Project selectedProject;

    // boolean flag noting whether a project has been selected
    private boolean projectSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        this.defineHomeScreenWidgets();
    }

    /**
     * Method used to create and define behaviour for elements that are set up in the activity
     */
    private void defineHomeScreenWidgets()
    {
        // create elements
        this.newProjectButton = (Button) findViewById(R.id.newProjectButton);
        this.goToProject = (Button)findViewById(R.id.goToProject);
        this.selectedProjectLabel = (TextView)findViewById(R.id.selectedProjectLabel);

        this.goToProject.setEnabled(false);
        this.goToProject.setVisibility(View.INVISIBLE);

        // listeners to buttons
        newProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreenActivity.this, NewProjectActivity.class);

                startActivityForResult(i,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode==1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                Project project = (Project)data.getParcelableExtra("project");
                this.selectedProject = project;
                this.selectedProjectLabel.setText(this.selectedProject.getName());
                this.goToProject.setEnabled(true);
                this.goToProject.setVisibility(View.VISIBLE);
            }

            if(resultCode == Activity.RESULT_CANCELED)
            {
                // nothing for now
            }
        }
    }


}
