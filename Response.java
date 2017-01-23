import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {
    
    @SerializedName("hits")
    @Expose
    private List<Hit> hits = null;
    
    public List<Hit> getHits() {
	return hits;
    }
    
    public void setHits(List<Hit> hits) {
	this.hits = hits;
    }
    
}
