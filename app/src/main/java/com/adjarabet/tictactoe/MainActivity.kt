package com.adjarabet.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    var firstplayer = ArrayList<Int>()
    var secondplayer = ArrayList<Int>()
    var activePlayer=1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)

    }

    override fun onClick(clickedview: View?) {


        if (clickedview is Button) {
            var buttonNumber = 0
            when (clickedview.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9

            }
            if (buttonNumber!=0){
                playGame(clickedview,buttonNumber)
            }
        }


    }

    fun playGame(view: Button,buttonNumber : Int) {

        if (activePlayer==1){
          view.text="X"
          view.setBackgroundColor(Color.RED)
          firstplayer.add(buttonNumber)
         activePlayer=2
      }  else{
          view.text="Y"
          view.setBackgroundColor(Color.GREEN)
          secondplayer.add(buttonNumber)
          activePlayer=1

      }
        view.isEnabled=false
        check()

    }


    fun check() {
        var winner = 0
        if (firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)) {
            winner = 1
        }
        if (secondplayer.contains(1) && secondplayer.contains(2) && secondplayer.contains(3)) {
            winner = 2
        }
        if (firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)) {
            winner = 1
        }
        if (firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)) {
            winner = 1
        }
        if (firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {
            winner = 1
        }
        if (firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)) {
            winner = 1
        }
        if (firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {
            winner = 1
        }
        if (firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)) {
            winner = 1
        }
        if (firstplayer.contains(7) && firstplayer.contains(5) && firstplayer.contains(3)) {
            winner = 1
        }
        if (secondplayer.contains(1) && secondplayer.contains(4) && secondplayer.contains(7)) {
            winner = 2

        }
        if (secondplayer.contains(2) && secondplayer.contains(5) && secondplayer.contains(8)) {
            winner = 2

        }
        if (secondplayer.contains(3) && secondplayer.contains(6) && secondplayer.contains(9)) {
            winner = 2
        }
        if (secondplayer.contains(4) && secondplayer.contains(5) && secondplayer.contains(6)) {
            winner = 2


        }
        if (secondplayer.contains(7) && secondplayer.contains(8) && secondplayer.contains(9)) {
            winner = 2
        }
        if (secondplayer.contains(1) && secondplayer.contains(5) && secondplayer.contains(9)) {
            winner = 2

        }
        if (secondplayer.contains(7) && secondplayer.contains(5) && secondplayer.contains(3)) {
            winner = 2
        }
        if (winner==1){
            Toast.makeText(this, "First one is winner iasnia", Toast.LENGTH_SHORT).show()

        }else if (winner==2){
            Toast.makeText(this, "second one is winner lomo", Toast.LENGTH_SHORT).show()
        }

    }


}