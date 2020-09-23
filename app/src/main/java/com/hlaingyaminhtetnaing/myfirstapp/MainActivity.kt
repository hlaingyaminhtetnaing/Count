package com.hlaingyaminhtetnaing.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener{
            Toast.makeText(
                this,"This is a toast.",
                Toast.LENGTH_LONG).show()

        }
        btn_Count.setOnClickListener {
            var Count:Int=txt_Count.text.toString().toInt()
            Count+=1
            txt_Count.text=Count.toString()
        }
        btn_random.setOnClickListener {
            var randomNum:Int=(0..100).random()
            txt_Count.text=randomNum.toString()
        }
    }
}