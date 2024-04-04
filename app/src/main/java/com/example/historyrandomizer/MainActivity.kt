package com.example.historyrandomizer

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {

            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {

                val name = when (age) {

                    96 -> "Queen Elizabeth 56: " +


                            "Has ruled most of European countries. " +
                            "Longest reigning ruler known for 7 decades. "

                    86 -> "Nicola Tesla : " +


                            "Famously known as Dr Light holds the record for brilliant records. " +
                            "Creator of AC (alternative current). " +
                            "Discovered how light bulbs work."

                    79 -> "Mahatma Gandhi : " +


                            "Gandhi was nominated for the Nobel Peace Prize five times but never received the award." +
                            "As a young child Gandhi was very shy and would run home as soon as school ended to avoid talking to anyone." +
                            "Time Magazine named Mahatma Gandhi Person of the Year in 1930."

                    69 -> "Marco Polo : " +


                            "Polo was only 15 years old when he left Venice on the great adventure that took him to the court of Kublai Khan" +
                            "He was influential in Christopher Columbus' decision to strike out for unknown territory" +
                            "He has a species of sheep named after him"

                    56 -> "Adolf Hitler : " +


                            "He once lived in a homeless shelter" +
                            "He was Time’s “Man of the Year” in 1938" +
                            "He survived numerous assassination attempts"

                    73 -> "Charles Darwin : " +


                            "Darwin was born on the same day as Abraham Lincoln." +
                            "He waited more than 20 years to publish his groundbreaking theory on evolution." +
                            " He composed a pro/con list to decide on whether to marry."

                    52 -> "William Shakespeare : " +


                            "Shakespeare’s father held a lot of different jobs, and at one point got paid to drink beer." +
                            " Shakespeare married an older woman who was three months pregnant at the time." +
                            "Nobody knows what Shakespeare did between 1585 and 1592."

                    56 -> "Abraham Lincoln : " +


                            "Lincoln remains the tallest person to serve as president, at 6’ 4 ." +
                            "Lincoln only lost one election by direct vote of the people—his first run for the Illinois House of Representatives in 1832." +
                            "Lincoln led the country through its greatest crisis, the Civil War, and was on the verge of victory when he died."

                    83 -> "Thomas Jefferson : " +


                            "Thomas Jefferson wrote the Declaration of Independence in 1776" +
                            "He helped create the human Bill of Rights to add to the Constitution of the United States." +
                            "He designed and began the University of Virginia"

                    95 -> "Nelson Mandela :" +


                            " He was the first black president of South Africa" +
                            "Mandela was imprisoned from 1962-1990 for treason and conspiracy against the government. He was sentenced to life in prison" +
                            "Mandela received the Nobel Peace Prize in 1993"


                    else -> null

                }

                val message = if (name != null) "Your age matches $name."
                else "No Historical figures found with entered age."
                resultTextView.text = message
            } else {

                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
            }


            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""


            }

        }
    }
}
