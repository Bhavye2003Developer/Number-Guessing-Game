package com.example.numberguessinggame

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.example.numberguessinggame.R.color.green
import com.example.numberguessinggame.R.id.background
import com.example.numberguessinggame.R.id.textView

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLeft : Button = findViewById(R.id.btnLeft)
        val btnRight : Button = findViewById(R.id.btnRight)
        val textView : TextView = findViewById(R.id.textView)
        val background : ConstraintLayout = findViewById<ConstraintLayout>(R.id.background)
        var num_correct : Int = 0
        var num_wrong : Int = 0
        var text = ""
        var x = (0..9).random()
        var y = (0..9).random()
        if (x==y) {
            x = 1
            y = 2
        }

        btnLeft.setText(x.toString())
        btnRight.setText(y.toString())

        btnLeft.setOnClickListener {
            if (x<y){
                num_correct++
                x = (0..9).random()
                y = (0..9).random()
                if (x==y) {
                    x = 1
                    y = 2
                }
                btnLeft.setText(x.toString())
                btnRight.setText(y.toString())
                Toast.makeText(this,"Right answer",Toast.LENGTH_SHORT).show()
                background.setBackgroundColor(getColor(R.color.green))
                text = "Number of right answers : $num_correct\nNumber of wrong answers : $num_wrong"
                textView.setText(text)
                textView.setTextColor(getColor(R.color.black))
            }
            else{
                num_wrong++
                Toast.makeText(this,"Wrong answer",Toast.LENGTH_SHORT).show()
                background.setBackgroundColor(getColor(R.color.red))
                text = "Number of right answers : $num_correct\nNumber of wrong answers : $num_wrong"
                textView.setText(text)
                textView.setTextColor(getColor(R.color.white))
            }
        }
        btnRight.setOnClickListener {
            if (y<x){
                num_correct++
                x = (0..9).random()
                y = (0..9).random()
                if (x==y) {
                    x = 1
                    y = 2
                }
                btnLeft.setText(x.toString())
                btnRight.setText(y.toString())
                Toast.makeText(this,"Right answer",Toast.LENGTH_SHORT).show()
                background.setBackgroundColor(getColor(R.color.green))
                text = "Number of right answers : $num_correct\nNumber of wrong answers : $num_wrong"
                textView.setText(text)
                textView.setTextColor(getColor(R.color.black))
            }
            else{
                num_wrong++
                Toast.makeText(this,"Wrong answer",Toast.LENGTH_SHORT).show()
                background.setBackgroundColor(getColor(R.color.red))
                text = "Number of right answers : $num_correct\nNumber of wrong answers : $num_wrong"
                textView.setText(text)
                textView.setTextColor(getColor(R.color.white))
            }
        }
    }
}