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
    private var state: State = State.INPUT_FIRST

    private val outputFormatter = DecimalFormat("#.######")

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
            R.id.btn_div, R.id.btn_mul, R.id.btn_plus, R.id.btn_minus -> inputOperator(v as Button)
            else -> inputNumber(v as Button)
        }
    }

    private fun clear() {
        mainOutput.text = "0"
        expressionOutput.text = ""
        operator = null
        num1 = 0.0
        num2 = 0.0
        state = State.INPUT_FIRST
    }

    private fun inputOperator(btn: Button) {
        if (state == State.INPUT_FIRST) {
            num1 = mainOutput.text.toString().replace(",", ".").toDouble()
            expressionOutput.text = buildString {
                append(num1)
                append(" ")
                append(btn.text)
            }
            mainOutput.text = "0"
            operator = btn.text.toString()
            state = State.INPUT_SECOND
            return
        }
        if (mainOutput.text.isNotEmpty()) {
            equals()
            state = State.INPUT_FIRST
            inputOperator(btn)
            return
        }
        printValue(btn)
    }

    private fun inputNumber(btn: Button) {
        if (state == State.SHOW_RESULT) {
            clear()
            state = State.INPUT_FIRST
        }
        printValue(btn)
    }

    private fun printValue(btn: Button) {
        if (btn.text == "," && mainOutput.text == "0") {
            mainOutput.text = "0,"
            return
        }
        if (btn.text == "," && mainOutput.text.contains(",")) {
            return
        }
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
        if (state == State.SHOW_RESULT) {
            clear()
            return
        }
        val size = mainOutput.text.length
        if (size == 1) {
            mainOutput.text = "0"
            return
        }
        mainOutput.text = mainOutput.text.dropLast(1)
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
        state = State.SHOW_RESULT
    }
}

enum class State {
    INPUT_FIRST,
    INPUT_SECOND,
    SHOW_RESULT
}
