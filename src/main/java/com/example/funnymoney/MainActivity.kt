package com.example.funnymoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Calculate : Button = findViewById(R.id.calculate)
        var Income: EditText = findViewById(R.id.income)
        var Bills: TextView = findViewById(R.id.billsOutPut)
        var Entertainment: TextView = findViewById(R.id.entertainmentOut)
        var Groceries: TextView = findViewById(R.id.groceriesOut)
        var Lefover: TextView = findViewById(R.id.leftOverOut)
        var strNum = StringBuilder()


        Calculate.setOnClickListener{
            var billPercent: Double = .25 //preset bills to cost 25% of income
            var enterTainPercent: Double = .10 //presets entertainment to 10%
            var grocerPercent: Double = .20 //presets grocery cost to 20%
            var billOut = Income.text.toString().toDouble() * billPercent //how much would be
            Bills.text = billOut.toString()
        }

    }
}