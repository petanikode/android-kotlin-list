package com.petanikode.kotlinlist

import android.R.layout.simple_list_item_1
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // data yang akan kita tampilkan ke dala ListView
        val languages = listOf("Java", "Kotlin", "Javascript", "PHP", "Python")

        // memberikan adapter ke ListView
        lv_languages.adapter = ArrayAdapter(this, simple_list_item_1, languages)

        // menangani item saat dilklik
        lv_languages.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih: ${languages[position]}",Toast.LENGTH_SHORT).show()
        }
    }
}
