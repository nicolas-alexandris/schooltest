import java.util.List;

public class RecipeStep {
    private final String title;
    private final String description;
    private final List<String> photos;
    private final List<String> materials;
    private final int totalTime;

    public RecipeStep(String title, String description, List<String> photos, List<String> materials, int totalTime) {
        this.title = title;
        this.description = description;
        this.photos = photos;
        this.materials = materials;
        this.totalTime = totalTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public int getTotalTime() {
        return totalTime;
    }

    // modify photos
    public void addPhoto(String photo) {
        photos.add(photo);
    }

    // remove photo
    public void removePhoto(String photo) {
        photos.remove(photo);
    }
}
