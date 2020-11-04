
import com.google.gson.annotations.SerializedName

data class Recipes(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("Ingredientes")
    val ingredientes: String,
    @SerializedName("Ingredientes2")
    val ingredientes2: String,
    @SerializedName("Ingredientes3")
    val ingredientes3: String,
    @SerializedName("Ingredientes4")
    val ingredientes4: String,
    @SerializedName("Ingredientes5")
    val ingredientes5: String,
    @SerializedName("Ingredientes6")
    val ingredientes6: String,
    @SerializedName("Nombre Receta")
    val nombreReceta: String,
    @SerializedName("Preparacion")
    val preparacion: String,
    @SerializedName("Preparacion2")
    val preparacion2: String,
    @SerializedName("Preparacion3")
    val preparacion3: String,
    @SerializedName("Preparacion4")
    val preparacion4: String,
    @SerializedName("Preparacion5")
    val preparacion5: String,
    @SerializedName("Preparacion6")
    val preparacion6: String,
    @SerializedName("Recomendación de acompañamiento")
    val recomendaciónDeAcompañamiento: String
)