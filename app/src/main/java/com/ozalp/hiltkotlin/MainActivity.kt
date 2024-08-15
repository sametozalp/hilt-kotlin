package com.ozalp.hiltkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Field Injection
    @Inject
    lateinit var lars: Musician

    @Inject
    lateinit var myClass: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // sing fonksiyonunu test etmek için  bir sürü şey oluşturmak zorunda kalabilirdik.
        // dependency injection sayesinde bunları manuel olarak oluşturmamıza gerek kalmıyor

        /*
            val instrument = Instrument()
            val band = Band()
            var james = Musician(instrument, band)
            james.sing()
        */

        lars.sing()

        /*
            Scope kapsamları resimde görüldüğü gibidir.
            @Singleton tanımlara k tüm uygulama byunca çalışır.
            @ViewScoped tanımlarsak viewler gözüktüğü sürece.
        */

        println(myClass.myFunction())

    }
}