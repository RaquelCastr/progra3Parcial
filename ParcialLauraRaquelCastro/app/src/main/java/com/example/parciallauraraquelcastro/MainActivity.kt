package com.example.parciallauraraquelcastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ejercicio1()
    }

    private fun Ejercicio1(){
        var colores = "Rosado"
        if(colores == "Amarillo"){
            println("El color seleccionado es $colores")
        }else if (colores == "blanco"){
            println("El color seleccionado es $colores")
        }else if(colores == "Anaranjado"){
            println("El color seleccionado es $colores")
        }else if(colores == "Azul"){
            println("El color seleccionado es $colores")
        }else if(colores == "violeta"){
            println("El color seleccionado es $colores")
        }else{
            println("El color no ha sido encontrado")
        }

    }
    private fun Ejercicio2(){
        var comida = "Hamburguesa"

        when(comida){
            "Pupusas", "Nuegados", "Tamales"->{
                println("El pais al que pertenece esta comida es El Salvador") }
            "Tacos", "Enchiladas", "Sopa de tortilla"->{
                println("El pais al que pertenece esta comida es Mexico")}
            "Baleadas", "Yuca", "Mariscada"->{
                println("El pais al que pertenece esta comida es Honduras")}
            "Pizza", "Hot dog"->{
                println("El pais al que pertenece esta comida es EEUU")
            }else ->{
                println("No se conoce el pais de origen del platillo")
            }
        }


    }
    private fun Ejercicio3(){
        for(x in 0..10) {
            println(x)
        }
        for(x in 0..20 step 2){  println(x)
        }
        for(x in 10 downTo 0){  println(x)
        }
        for(x in 30 downTo 0 step 3){  println(x)
        }

    }


}