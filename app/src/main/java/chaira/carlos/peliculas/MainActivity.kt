package chaira.carlos.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenarPeliculas()
        var adapter=AdaptadorMovies(this,peliculas)
        var listView: ListView=findViewById(R.id.lv_lista)
        listView.adapter=adapter
    }

    private fun llenarPeliculas(){
        var peliculaUno=Pelicula(1,getString(R.string.peliculaUno),getString(R.string.peliculaUnoDesc),102,R.drawable.bigheroseis)
        peliculas.add(peliculaUno)
        var peliculaDos=Pelicula(2,getString(R.string.peliculaUno),getString(R.string.peliculaUnoDesc),102,R.drawable.leapyear)
        peliculas.add(peliculaDos)
        var peliculaTres=Pelicula(3,getString(R.string.peliculaUno),getString(R.string.peliculaUnoDesc),102,R.drawable.mib)
        peliculas.add(peliculaTres)
        var peliculaCuatro=Pelicula(4,getString(R.string.peliculaUno),getString(R.string.peliculaUnoDesc),102,R.drawable.toystory)
        peliculas.add(peliculaCuatro)
        var peliculaCinco=Pelicula(5,getString(R.string.peliculaUno),getString(R.string.peliculaUnoDesc),102,R.drawable.inception)
        peliculas.add(peliculaCinco)
    }

}