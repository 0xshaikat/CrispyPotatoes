import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hit {
    
    @SerializedName("highlights")
    @Expose
    private List<Object> highlights = null;
    @SerializedName("index")
    @Expose
    private String index;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("result")
    @Expose
    private Result_ result;

    public List<Object> getHighlights() {
	return highlights;
    }

    public void setHighlights(List<Object> highlights) {
	this.highlights = highlights;
    }
    
    public String getIndex() {
	return index;
    }

    public void setIndex(String index) {
	this.index = index;
    }
    
    public String getType() {
	return type;
    }
    
    public void setType(String type) {
	this.type = type;
    }
    
    public Result_ getResult() {
	return result;
    }

    public void setResult(Result_ result) {
	this.result = result;
    }

}
