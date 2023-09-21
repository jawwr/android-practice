package com.example.learningkt.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import com.example.learningkt.R
import java.text.DecimalFormat

class Calculator : AppCompatActivity(), View.OnClickListener {
    private lateinit var mainOutput: TextView
    private lateinit var expressionOutput: TextView

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operator: String? = null
    private var isResult: Boolean = false

    private val outputFormatter = DecimalFormat("#.######")
    private val operators = listOf("+", "-", "/", "*")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)

        mainOutput = findViewById(R.id.output_main)
        expressionOutput = findViewById(R.id.output_expression)

        val buttons = getAllButtonsInActivity()
        setOnClickListener(buttons)
    }

    private fun getAllButtonsInActivity(): List<Button> =
        findViewById<GridLayout>(R.id.calculator_buttons).children.map { it as Button }.toList()

    private fun setOnClickListener(btns: List<Button>) =
        btns.forEach { it.setOnClickListener(this) }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_clear -> clear()
            R.id.btn_equals -> equals()
            R.id.btn_delete -> delete()
            else -> inputValue(v as Button)
        }
    }

    private fun clear() {
        mainOutput.text = "0"
        expressionOutput.text = ""
        operator = null
        num1 = 0.0
        num2 = 0.0
        isResult = false
    }

    private fun inputValue(btn: Button) {
        if (btn.text !in operators) {
            inputNumber(btn)
            return
        }
        inputOperator(btn)
    }

    private fun inputOperator(btn: Button) {
        isResult = false
        if (num1 == 0.0) {
            num1 = mainOutput.text.toString().replace(",", ".").toDouble()
            expressionOutput.text = buildString {
                append(num1)
                append(" ")
                append(btn.text)
            }
            mainOutput.text = "0"
            operator = btn.text.toString()
            return
        }
        printValue(btn)
    }

    private fun inputNumber(btn: Button) {
        if (isResult) {
            clear()
            isResult = false
        }
        printValue(btn)
    }

    private fun printValue(btn: Button) {
        if (mainOutput.text == "0" && btn.text != "0") {
            mainOutput.text = btn.text
            return
        }
        mainOutput.text = buildString {
            append(mainOutput.text)
            append(btn.text)
        }
    }

    private fun delete() {
        val size = mainOutput.text.length
        if (size == 1) {
            mainOutput.text = "0"
            return
        }
        if (mainOutput.text[size - 1].toString() in operators) {
            operator = null
        }
        mainOutput.text = mainOutput.text.removeRange(size - 1, size)
    }

    private fun equals() {
        if (operator.isNullOrEmpty()) {
            return
        }
        num2 = mainOutput.text.toString().replace(",", ".").toDouble()
        val result: Double = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 == 0.0) Double.NaN else num1 / num2
            else -> throw RuntimeException("Wrong operation")
        }
        clear()
        mainOutput.text = outputFormatter.format(result)
        isResult = true
    }
}
