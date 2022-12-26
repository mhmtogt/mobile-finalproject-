package com.mustafa.finaluygulama

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.SeekBar
import android.widget.TextView

class rgbF : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var a = inflater.inflate(R.layout.fragment_rgb, container, false)
        var seekR =a.findViewById<SeekBar>(R.id.seekBarRed)
        var seekG =a.findViewById<SeekBar>(R.id.seekBarGreen)
        var seekB =a.findViewById<SeekBar>(R.id.seekBarBlue)

        var textView5 = a.findViewById<TextView>(R.id.textView5)
        var arkaplan=a.findViewById<FrameLayout>(R.id.arka1)

        seekR.max = 255
        seekG.max = 255
        seekB.max = 255
        var renkR: Int = seekR.progress
        var renkG: Int = seekG.progress
        var renkB: Int = seekB.progress
        arkaplan.setBackgroundColor(Color.rgb(renkR, renkG, renkB))

        seekR.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, proggres: Int, p2: Boolean) {
                renkR = proggres
                arkaplan.setBackgroundColor(Color.rgb(renkR, renkG, renkB))
                textView5.setText("#"+"%x".format(renkR)+"%x".format(renkG)+"%x".format(renkB))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView5.setText("#"+"%x".format(renkR)+"%x".format(renkG)+"%x".format(renkB))

            }
        })

        seekG.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, proggres: Int, p2: Boolean) {
                renkG = proggres
                arkaplan.setBackgroundColor(Color.rgb(renkR, renkG, renkB))
                textView5.setText("#"+"%x".format(renkR)+"%x".format(renkG)+"%x".format(renkB))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView5.setText("#"+"%x".format(renkR)+"%x".format(renkG)+"%x".format(renkB))

            }
        })

        seekB.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, proggres: Int, p2: Boolean) {
                renkB = proggres

                arkaplan.setBackgroundColor(Color.rgb(renkR, renkG, renkB))
                textView5.setText("#"+"%x".format(renkR)+"%x".format(renkG)+"%x".format(renkB))
                // textView4.text="B: "+renkB.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView5.setText("#"+"%x".format(renkR)+"%x".format(renkG)+"%x".format(renkB))
                }
            })

        return a
    }

}