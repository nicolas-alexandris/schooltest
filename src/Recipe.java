import java.util.List;

public class Recipe {
    // recipe id
//    private final int id;

    private String name;
    private FoodCategory category;
    private Difficulty difficulty;
    private int totalCookingTime;
    private List<String> ingredients;
    private List<String> photos;
    private List<RecipeStep> steps;

    // constructor
    public Recipe(String name, FoodCategory category, Difficulty difficulty, int totalCookingTime, List<String> ingredients, List<String> photos, List<RecipeStep> steps) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
        this.totalCookingTime = totalCookingTime;
        this.ingredients = ingredients;
        this.photos = photos;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public FoodCategory getCategory() {
        return category;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getTotalCookingTime() {
        return totalCookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public List<RecipeStep> getSteps() {
        return steps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(FoodCategory category) {
        this.category = category;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setTotalCookingTime(int totalCookingTime) {
        this.totalCookingTime = totalCookingTime;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public void setSteps(List<RecipeStep> steps) {
        this.steps = steps;
    }
}
