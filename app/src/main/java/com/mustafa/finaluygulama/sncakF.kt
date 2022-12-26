package com.mustafa.finaluygulama

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class sncakF : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val a =inflater.inflate(R.layout.fragment_sncak, container, false)

        var mesaj = a.findViewById<EditText>(R.id.mesaj)
        var action = a.findViewById<EditText>(R.id.action)
        var spinner = a.findViewById<Spinner>(R.id.spinner)
        var secenek = arrayOf("Süre Seçiniz","2 sn","2.5 sn","3 sn","3.5 sn","4 sn")
        var adapter=ArrayAdapter(a.context,android.R.layout.simple_dropdown_item_1line,secenek)
        spinner.adapter=adapter

        spinner.onItemSelectedListener=object :
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when(p2){

                    0->{

                    }
                    1->{
                        Snackbar.make(activity!!.findViewById(android.R.id.content),mesaj.text.toString(),2000)
                            .setAction(action.text.toString()){
                                Toast.makeText(a.context,action.text.toString(),Toast.LENGTH_SHORT).show()
                            }.show()
                    }
                    2->{
                        Snackbar.make(activity!!.findViewById(android.R.id.content),mesaj.text.toString(),2000)
                            .setAction(action.text.toString()){
                                Toast.makeText(a.context,action.text.toString(),Toast.LENGTH_SHORT).show()
                            }.show()
                    }
                    3->{
                        Snackbar.make(activity!!.findViewById(android.R.id.content),mesaj.text.toString(),2000)
                            .setAction(action.text.toString()){
                                Toast.makeText(a.context,action.text.toString(),Toast.LENGTH_SHORT).show()
                            }.show()
                    }
                    4->{
                        Snackbar.make(activity!!.findViewById(android.R.id.content),mesaj.text.toString(),2000)
                            .setAction(action.text.toString()){
                                Toast.makeText(a.context,action.text.toString(),Toast.LENGTH_SHORT).show()
                            }.show()
                    }
                    5->{
                        Snackbar.make(activity!!.findViewById(android.R.id.content),mesaj.text.toString(),2000)
                            .setAction(action.text.toString()){
                                Toast.makeText(a.context,action.text.toString(),Toast.LENGTH_SHORT).show()
                            }.show()
                    }

                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }




        return a
    }


}