package com.example.ohber.zerosareheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static java.lang.System.loadLibrary;


public class Main extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the wipe button to a variable
        Button wipeB;
        wipeB = findViewById(R.id.wipeB);


        // Listen for button click
        wipeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // BEGIN BUTTON_CLICKED BLOCK

                int er; // init to 0

                // Move to inprogress activity
                setContentView(R.layout.activity_inprogress);

                // Start junk writer
                er = writeJunk();

                // END BUTTON_CLICKED BLOCK

                // Error code description notification
                if (er != 0) {
                    // TODO: add switch statement for error code notifications
                }

            }
        });
    }


    public int writeJunk() {
        int returnCode = 99; // Set to 99 as fail val, change accordingly.


        return returnCode;
    }
}
