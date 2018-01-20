package com.example.pogo.mathclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView_result.text = "0"
        plus_button.setOnClickListener {
            var soThu1: Int = (edit_text_one.text.toString()).toInt()
            var soThu2: Int = (edit_text_two.text.toString()).toInt()
            var ketQua = soThu1 + soThu2
            textView_result.text = ketQua.toString()
        }

        minus_button.setOnClickListener {
            var soThu1: Int = (edit_text_one.text.toString()).toInt()
            var soThu2: Int = (edit_text_two.text.toString()).toInt()
            var ketQua = soThu1 - soThu2
            textView_result.text = ketQua.toString()
        }

        multiply_button.setOnClickListener {
            var soThu1: Int = (edit_text_one.text.toString()).toInt()
            var soThu2: Int = (edit_text_two.text.toString()).toInt()
            var ketQua = soThu1 * soThu2
            textView_result.text = ketQua.toString()
        }

        divide_button.setOnClickListener {
            var soThu1: Int = (edit_text_one.text.toString()).toInt()
            var soThu2: Int = (edit_text_two.text.toString()).toInt()
            var ketQua = soThu1 / soThu2
            textView_result.text = ketQua.toString()
        }

    }
}
