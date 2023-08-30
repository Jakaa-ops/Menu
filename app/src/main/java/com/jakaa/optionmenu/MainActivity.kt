package com.jakaa.optionmenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemOne -> Toast.makeText(this, "Item One was Selected", Toast.LENGTH_SHORT).show()
            R.id.itemTwo -> Toast.makeText(this, "Item two was Selected", Toast.LENGTH_SHORT).show()
            R.id.subMenuOne -> Toast.makeText(this, "Sub menu One was Selected", Toast.LENGTH_SHORT).show()
            R.id.subMenuTwo -> Toast.makeText(this, "Sub Menu Two was Selected", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}