package com.example.menutoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.addPerson->Toast.makeText(this,"You clicked on Add Person",Toast.LENGTH_SHORT).show()
            R.id.settings->Toast.makeText(this,"You clicked on Settings",Toast.LENGTH_SHORT).show()
            R.id.favorites->Toast.makeText(this,"You clicked on Favorites",Toast.LENGTH_SHORT).show()
            R.id.closeApp->finish()
            R.id.feedback->Toast.makeText(this,"You clicked on Feedback",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}