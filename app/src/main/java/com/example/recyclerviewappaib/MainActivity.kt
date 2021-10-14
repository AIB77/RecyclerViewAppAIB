package com.example.recyclerviewappaib

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var CLmain:ConstraintLayout
    lateinit var rvMain:RecyclerView
    lateinit var usercolor:EditText
    lateinit var BTN:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CLmain=findViewById(R.id.mainL)
        rvMain=findViewById(R.id.RCV)
        usercolor=findViewById(R.id.editTextTextcolor)
        BTN=findViewById(R.id.buttonsub)

        val TheColor = ArrayList<String>()


        BTN.setOnClickListener {


            if (usercolor.text.isNotBlank()) {

                var userinput = usercolor.text.toString()
                TheColor.add(userinput)
                rvMain.adapter = RecyclerViewAdapter(TheColor)
                rvMain.layoutManager = LinearLayoutManager(this)
                usercolor.text = null



            } else {
                Snackbar.make(CLmain, "Enter The Amount", Snackbar.LENGTH_LONG).show()
            }


        }





    }
}