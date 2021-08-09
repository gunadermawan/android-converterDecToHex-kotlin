package com.gunder.converter_decimaltohex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
//    inisialisasi
    private var input:EditText? = null
    private var output: EditText? = null
    private var submit: Button? = null
    private var reset: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        inisialisasi variabel
        input = findViewById(R.id.input)
        output = findViewById(R.id.output)
        submit = findViewById(R.id.submit)
        submit!!.setOnClickListener {
            val string = input!!.text.toString()
            val i = string.toInt()
            val binary = Integer.toHexString(i)
            output!!.setText(binary)
        }
    }
}