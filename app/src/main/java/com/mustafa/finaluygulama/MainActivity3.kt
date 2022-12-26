package com.mustafa.finaluygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var menu = findViewById<Button>(R.id.dugme)

        menu.setOnClickListener {


            val acilirMenu = PopupMenu(this,menu)
            acilirMenu.menuInflater.inflate(R.menu.popup,acilirMenu.menu)
            acilirMenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.RGB -> {
                        fragmentcagir(rgbF())
                        true
                    }
                    R.id.snack -> {
                        fragmentcagir(sncakF())
                        true
                    }
                    R.id.cikis -> {

                        true
                    }

                    else -> false
                }
                return@setOnMenuItemClickListener true
            }
            acilirMenu.show()

        }


    }

    fun fragmentcagir(bolum : Fragment){
        var gecis =supportFragmentManager.beginTransaction()
        gecis.replace(R.id.fragmentContainerView4,bolum)
        gecis.commit()
    }
}