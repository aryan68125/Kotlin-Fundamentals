package com.example.kotlin_fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView_textView = findViewById<TextView>(R.id.textView)
        var number_of_times_button_clicked = findViewById<TextView>(R.id.textView2)
        number_of_times_button_clicked.text = ""

        val button_click_me = findViewById<Button>(R.id.button)
        //button_click_me.text = "haha" //change the button text

        var num = 0; //variable
        var times = 0
        button_click_me.setOnClickListener{
            if (num == 1)
            {
                button_click_me.text = "haha you click me"
                textView_textView.text = "You click the button"
                times +=1;
                number_of_times_button_clicked.text = "No of times button clicked = " + times.toString()
                num = 0;
                Toast.makeText(this@MainActivity, times.toString(), Toast.LENGTH_SHORT).show()
            }
            else if (num == 0 )
            {
                button_click_me.text = "click me"
                textView_textView.text = "Aditya click me"
                times +=1;
                number_of_times_button_clicked.text = "No of times button clicked = " + times.toString()
                num = 1
                Toast.makeText(this@MainActivity, times.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }
}