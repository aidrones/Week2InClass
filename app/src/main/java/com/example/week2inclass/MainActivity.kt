package com.example.week2inclass
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Context
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtName = findViewById<EditText>(R.id.txtName)

        btnSubmit.setOnClickListener{
            val userinput = txtName.text.toString()
            txtShow.setText(userinput)
            txtName.setText("")
            hideKeyboard()
        }
    }
    // function to hide keyboard
    //import android.content.Context
    //import android.view.inputmethod.InputMethodManager
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception){
        // TODO: handle exception
        }
    }
}
