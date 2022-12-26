
package com.mustafa.finaluygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var girisCubugu = findViewById<SeekBar>(R.id.seekBar);


        girisCubugu?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(girisCubugu: SeekBar,
                                           progress: Int, fromUser: Boolean) {

            }

            override fun onStartTrackingTouch(girisCubugu: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(girisCubugu: SeekBar) {
                // write custom code for progress is stoppeid
                if (girisCubugu.progress >=240){
                    val intent = Intent(applicationContext,MainActivity2::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    girisCubugu.progress = 0;

                }
                }
            })

    }
}