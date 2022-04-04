package castor.no.c.programar.checkbox

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import java.lang.reflect.Type
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var edNombre: EditText
    lateinit var chkCursiva: CheckBox
    lateinit var chkNegrita: CheckBox
    lateinit var chkAmbos: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkCursiva = findViewById(R.id.chkCursiva)
        chkNegrita = findViewById(R.id.chkNegrita)
        chkAmbos = findViewById(R.id.chkAmbos)
        edNombre = findViewById(R.id.edNombre)
    }

    fun clickCheck(v: View) {
        Log.e("Check", "Le puchaste")
        val checkPresionado: CheckBox = v as CheckBox
        if (chkCursiva.isChecked && !chkNegrita.isChecked) {
           edNombre.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else if(chkNegrita.isChecked && !chkCursiva.isChecked) {
            edNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }
        else if (chkCursiva.isChecked && chkNegrita.isChecked) {
            edNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        } else {
            edNombre.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
        }
    }
}

   /* fun clickCheck(v: View){
        if (v is CheckBox) {
            val checked: Boolean = v.isChecked

            when (v.id) {
                R.id.chkCursiva ->{
                    if (checked){
                        edNombre.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
                    } else{
                        edNombre.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
                    }
                }
                R.id.chkNegrita ->{
                    if (checked){
                        edNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
                    } else{
                        edNombre.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
                    }
                }
                R.id.chkAmbos ->{
                    if(checked){
                        edNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
                    }else{
                        edNombre.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
                    }
                }
            }
        }
    }
}

    */
