package com.example.learningkt.rockPaperScissors

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.learningkt.R
import kotlin.random.Random

class RockPaperScissors : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rock_paper_scissor)

        val btns = getAllButtonsInActivity()
        setHandler(btns)
    }

    private fun getAllButtonsInActivity(): List<Button> =
        listOf(
            findViewById(R.id.rock),
            findViewById(R.id.paper),
            findViewById(R.id.scissor)
        )

    private fun setHandler(btns: List<Button>) = btns.forEach { it.setOnClickListener(this) }

    override fun onClick(v: View?) {
        val handler = when (v?.id) {
            R.id.rock -> GameHandler.RockHandler
            R.id.paper -> GameHandler.PaperHandler
            R.id.scissor -> GameHandler.ScissorHandler
            else -> throw RuntimeException("Unknown choice")
        }
        val result = handler.handle()
        val intent = Intent(this, ResultActivity::class.java).apply {
            val bundle = Bundle().apply {
                putString("RESULT", result.result)
            }
            putExtras(bundle)
        }
        startActivity(intent)
    }
}

sealed class GameHandler {
    protected fun getBotResult() = Option[Random.nextInt(3)]

    abstract fun handle(): Result

    data object RockHandler : GameHandler() {
        override fun handle(): Result {
            return when (getBotResult()) {
                Option.ROCK -> Result.EQUALS
                Option.PAPER -> Result.LOSE
                Option.SCISSOR -> Result.WIN
            }
        }
    }

    data object PaperHandler : GameHandler() {
        override fun handle(): Result {
            return when (getBotResult()) {
                Option.ROCK -> Result.WIN
                Option.PAPER -> Result.EQUALS
                Option.SCISSOR -> Result.LOSE
            }
        }
    }

    data object ScissorHandler : GameHandler() {
        override fun handle(): Result {
            return when (getBotResult()) {
                Option.ROCK -> Result.LOSE
                Option.PAPER -> Result.WIN
                Option.SCISSOR -> Result.EQUALS
            }
        }
    }
}

enum class Result(val result: String) {
    WIN("Вы выиграли"),
    LOSE("Вы проиграли"),
    EQUALS("Ничья");
}

enum class Option {
    ROCK,
    PAPER,
    SCISSOR;

    companion object {
        operator fun get(index: Int): Option {
            val options = values()
            if (options.size <= index) {
                throw IllegalArgumentException("wrong value")
            }
            return values()[index]
        }
    }
}
