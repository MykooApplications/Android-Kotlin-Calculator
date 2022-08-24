package com.mykoo.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var calcTextView: TextView
    lateinit var clearButton: Button
    lateinit var sevenButton: Button
    lateinit var eightButton: Button
    lateinit var nineButton: Button
    lateinit var fourButton: Button
    lateinit var fiveButton: Button
    lateinit var sixButton: Button
    lateinit var oneButton: Button
    lateinit var twoButton: Button
    lateinit var threeButton: Button
    lateinit var zeroButton: Button
    lateinit var divideButton: Button
    lateinit var multiplyButton: Button
    lateinit var minusButton: Button
    lateinit var addButton: Button
    lateinit var dotButton: Button
    lateinit var equalButton: Button

    var currentCalculation: Double = 0.0
    var finalCalculation: Double = 0.0
    var number1: Double = 0.0
    var number2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initilizeViews()


    }

    fun initilizeViews(){
        calcTextView = findViewById(R.id.calcTextView)
        clearButton = findViewById(R.id.clearButton)
        sevenButton = findViewById(R.id.sevenButton)
        eightButton = findViewById(R.id.eightButton)
        nineButton = findViewById(R.id.nineButton)
        fourButton = findViewById(R.id.fourButton)
        fiveButton = findViewById(R.id.fiveButton)
        sixButton = findViewById(R.id.sixButton)
        oneButton = findViewById(R.id.oneButton)
        twoButton = findViewById(R.id.twoButton)
        threeButton = findViewById(R.id.threeButton)
        zeroButton = findViewById(R.id.zeroButton)
        divideButton = findViewById(R.id.divideButton)
        multiplyButton = findViewById(R.id.multiplyButton)
        minusButton = findViewById(R.id.minusButton)
        addButton = findViewById(R.id.addButton)
        dotButton = findViewById(R.id.dotButton)
        equalButton = findViewById(R.id.equalButton)

        clearButton.setOnClickListener { println("clear pressed") }
        sevenButton.setOnClickListener { println("7 pressed") }
        eightButton.setOnClickListener { println("8 pressed") }
        nineButton.setOnClickListener { println("9 pressed") }
        fourButton.setOnClickListener { println("4 pressed") }
        fiveButton.setOnClickListener { println("7 pressed") }
        sixButton.setOnClickListener { println("6 pressed") }
        oneButton.setOnClickListener { println("1 pressed") }
        twoButton.setOnClickListener { println("2 pressed") }
        threeButton.setOnClickListener { println("3 pressed") }
        zeroButton.setOnClickListener { println("0 pressed") }
        divideButton.setOnClickListener { println("'/' pressed") }
        multiplyButton.setOnClickListener { println("X pressed") }
        minusButton.setOnClickListener { println("- pressed") }
        addButton.setOnClickListener { println("+ pressed") }
        dotButton.setOnClickListener { println(". pressed") }
        equalButton.setOnClickListener { println("= pressed") }
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Any {
        if (b == 0.0) {
            displayError()
            return "Error! Dividing by zero is not allowed."
        } else {
            return a / b
        }
    }

    fun displayError(){
        calcTextView.text = "ERROR"
    }

}