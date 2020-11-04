
import com.google.gson.annotations.SerializedName

data class RecipesItem(
    @SerializedName("receta")
    val recipes: List<Recipes>
)