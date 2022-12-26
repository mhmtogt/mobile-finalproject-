package com.mustafa.finaluygulama

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class bir : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val c=inflater.inflate(R.layout.fragment_bir, container, false)
        var resim = c.findViewById<ImageView>(R.id.imageView2)


        var renk ="siyah"


        //var yeniSiparis =view?.findViewById<ImageView>(R.id.imageView2)








        object : CountDownTimer(100000,500){

            override fun onTick(p0: Long) {
                if(renk=="siyah"){
                    resim.visibility=View.VISIBLE
                  renk ="beyaz"
                }
                else{
                    resim.visibility=View.INVISIBLE
                    renk ="siyah"


                }
               /* var a=p0.toInt()
                a=a/100
                if (a % 2 == 0){
                    yeniSiparis?.visibility=View.VISIBLE
                }
                else{
                    yeniSiparis?.visibility=View.INVISIBLE
                }*/

            }

            override fun onFinish() {


            }

        }.start()




        return c

    }


}