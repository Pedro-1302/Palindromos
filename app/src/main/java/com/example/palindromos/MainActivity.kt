package com.example.palindromos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//Fazer um icone pro app
// Ex: rir - ovo - asa

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonCheck.setOnClickListener {
            val text = editText.text.toString()
            if (isPalindrome(text)) {
                Toast.makeText(this, "É Palindromo ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Não é Palindromo ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isPalindrome(text: String): Boolean {
        val reverseString = text.reversed()
        return text.equals(reverseString, ignoreCase = true)
    }

}