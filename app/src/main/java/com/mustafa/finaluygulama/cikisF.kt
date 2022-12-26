package com.mustafa.finaluygulama

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ProgressBar


class cikisF : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var a=inflater.inflate(R.layout.fragment_cikis, container, false)
        val tasarim=layoutInflater.inflate(R.layout.cikis3,null)
        val isim=tasarim.findViewById<EditText>(R.id.isim_alert)
        val sifre=tasarim.findViewById<EditText>(R.id.sifre_alert)
        val bar=tasarim.findViewById<ProgressBar>(R.id.progressBarcikis)

        //val ad = AlertDialog.Builder(this@cikisF)

       // ad.setView(tasarim)
        //ad.create().show()

        bar.setVisibility(View.INVISIBLE);
        return a




    }


}