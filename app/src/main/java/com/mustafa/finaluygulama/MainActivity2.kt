package com.mustafa.finaluygulama

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

val PREFS_FILENAME = "com.ekreimh.prtefs"
val KEY_NAME = "NAME"
val KEY_PASSWORD = "PASSWORD"
val DEGISIM = "AAA"
val sw ="degısım"

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        var isim = findViewById<TextView>(R.id.editTextTextPersonName2);
        var sifre = findViewById<TextView>(R.id.editTextTextPersonName);
        var beniHatirla = findViewById<Switch>(R.id.switch2);





        val prefences = getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE);
        val editor = prefences.edit();
        val switch1 = prefences.getBoolean(sw,false)
        beniHatirla.isChecked = switch1
        var durum = beniHatirla.isChecked;
        var dosyadurumu = prefences.getString(DEGISIM, "")
        if (dosyadurumu == "1") {
            beniHatirla.isChecked = true;
            isim.text = prefences.getString(KEY_NAME, "");
            sifre.text = prefences.getString(KEY_PASSWORD, "");
        } else {
            //beniHatirla.isChecked =true;


        }
        Toast.makeText(
            applicationContext,
            "Kaydedilmiş\n" +
                    "İsim : ${prefences.getString(KEY_NAME, "Değer Yok")}\n" +
                    "Şifre : ${prefences.getString(KEY_PASSWORD, "Değer Yok")}\n" +
                    "Unutma: ${durum.toString()} ",
            Toast.LENGTH_SHORT
        ).show();

        beniHatirla.setOnClickListener {
            if (beniHatirla.isChecked()) {
                durum = true
                editor.putString(KEY_NAME, isim.text.toString())
                editor.putString(KEY_PASSWORD, sifre.text.toString())
                editor.putString(DEGISIM, "1")
                editor.apply()
                Toast.makeText(
                    applicationContext,
                    "Kaydedilmiş\n" +
                            "İsim : ${prefences.getString(KEY_NAME, "")}\n" +
                            "Şifre : ${prefences.getString(KEY_PASSWORD, "")}\n" +
                            "Unutma: ${durum.toString()} ",
                    Toast.LENGTH_SHORT
                ).show();
            } else {
                // bu kısma buton kapatıldığızı yapılması gerekenler
            }
        }
        if(isim.text.toString()=="Mustafa Tatlı"&&sifre.text.toString()=="02205076012"){


            if (beniHatirla.isChecked) {


                editor.putString(KEY_NAME, isim.text.toString())
                editor.putString(KEY_PASSWORD, sifre.text.toString())
                editor.putBoolean(sw, beniHatirla.isChecked)
                editor.apply()


            }
            else{
                editor.remove(KEY_NAME)
                editor.remove(KEY_PASSWORD)
                editor.remove(sw)
                editor.apply()
            }

            object: CountDownTimer(2000,1000){
                override fun onTick(p0 : Long) {



                }

                override fun onFinish() {
                    var gecis = Intent(applicationContext, MainActivity3::class.java)
                    startActivity(gecis)
                    finish()
                }

            }.start()}
        isim.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (s.toString() == "Mustafa Tatlı") {
                    var a = true;

                    sifre.addTextChangedListener(object : TextWatcher {
                        override fun afterTextChanged(s: Editable?) {
                            if (s.toString() == "02205076012" && a == true) {
                                val intent = Intent(applicationContext,MainActivity3::class.java)
                                startActivity(intent)

                                finish()
                            } else {

                            }
                        }

                        override fun beforeTextChanged(
                            s: CharSequence?,
                            start: Int,
                            count: Int,
                            after: Int
                        ) {
                        }

                        override fun onTextChanged(
                            s: CharSequence?,
                            start: Int,
                            before: Int,
                            count: Int
                        ) {

                        }
                    })

                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {



            }
        })



    }
}