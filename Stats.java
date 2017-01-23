import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {
    
    @SerializedName("hot")
    @Expose
    private Boolean hot;
    @SerializedName("unreviewed_annotations")
    @Expose
    private Integer unreviewedAnnotations;
    @SerializedName("pageviews")
    @Expose
    private Integer pageviews;
    @SerializedName("concurrents")
    @Expose
    private Integer concurrents;

    public Boolean getHot() {
	return hot;
    }
    
    public void setHot(Boolean hot) {
	this.hot = hot;
    }
    
    public Integer getUnreviewedAnnotations() {
	return unreviewedAnnotations;
    }
    
    public void setUnreviewedAnnotations(Integer unreviewedAnnotations) {
	this.unreviewedAnnotations = unreviewedAnnotations;
    }
    
    public Integer getPageviews() {
	return pageviews;
    }
    
    public void setPageviews(Integer pageviews) {
	this.pageviews = pageviews;
    }

    public Integer getConcurrents() {
	return concurrents;
    }
    
    public void setConcurrents(Integer concurrents) {
	this.concurrents = concurrents;
    }
    
}
