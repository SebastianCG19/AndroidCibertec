package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var num1:Int = 10
    var num2:Int=20
    var resultado: Int=0

    var aux: String? =null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        resultado = sumar(4,10)
        Log.v("Resultado", resultado.toString())
        Log.d("Resuntado" , resultado.toString())
        Log.i("Resultado" , "$resultado")
        Log.w("Resultado", "$resultado")
        Log.e("Resultado", "$resultado")
        Log.wtf("Resultado", "$resultado")
        crearLog()
        callBackFun {
            Log.wtf("No se", "Ejecutando")
        }
        callBackFunTwo({
            Log.wtf("Funcion ", "first")

        }){
            Log.wtf("Funcion ", "Action")

        }

        if (num2 < 30){
            crearLogConMsj("Es menor")
        }else{
            crearLogConMsj("Es mayor")
        }

        if (num2<30)crearLogConMsj("es Menor") else crearLogConMsj("Es mayor")

        //When
        when(num1){
            in 1..5 ->crearLogConMsj("Es menor de 6")
            6 -> crearLogConMsj("Es 6")
            in 7..20 -> crearLogConMsj("Es mayor que 6")

            else -> crearLogConMsj("Entro al else")
        }

        //For

        for (i in 1..5 ){
            crearLogConMsj("$i")
        }

        val nombres = listOf("Yeray","Sebastian","Xiomara")
        for (nombre in nombres){
            crearLogConMsj("$nombre")
        }

        //For con indice
        for ((index, nombre) in nombres.withIndex()){
            crearLogConMsj("$index - $nombre")
        }

        //While
        var contador = 1
        while (contador <= 5){
            crearLogConMsj("$contador")
            contador++
        }

        //Do while
        var contador2 = 0
        do {
            crearLogConMsj("$contador2")
            contador2++
        }while (contador2 > 5)

        val Audi = Carro(4,"R8 V10", 2)
        crearLogConMsj("${Audi.antigue}")

        Audi.agregarAnios()
        crearLogConMsj("${Audi.antigue}")

      //  val Rolls = Carro(4,10,"Cullinan")

        //let para evitar Nulos
        val profesor:String?="Sebas"
        val androidProfesor = profesor?.let {nomProfesor ->
            crearLogConMsj(nomProfesor)
        }
        //Run

        val nissan = Carro(4, "Skyline", 20).run {
            agregarAnios()
            for (i in 1..8 ){
                agregarAnios()
            }
            crearLogConMsj(antigue.toString())

        }
        crearLogConMsj("Para Git")




    }

    fun crearLog():Unit {
        Log.e("Error", "Error desde funcion")
    }
    fun sumar(a:Int,b: Int):Int{
    return a +b

    }

    fun callBackFun(action: () -> Unit){
        Log.d("callBackFun  ", "callBackFun")
        action()
    }

    fun callBackFunTwo(firstAction: () -> Unit ,action: () -> Unit){
        firstAction()
        Log.d("callBackFun  ", "callBackFun")
        action()
    }
    fun crearLogConMsj(msj:String):Unit{
        Log.e("Error", msj)
    }

}