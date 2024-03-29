package com.example.a1stapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


// : = extemds
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)

        //TODO : Continue here
        //Java int x; vs Kotlin var x : int Int
        //val = value and var = variable
        //findViewById = Link UI to code
        val buttonDontClickMe : Button = findViewById(R.id.buttonClickME)
        buttonDontClickMe.setOnClickListener { showMessage() }


    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_message))

    }
}
