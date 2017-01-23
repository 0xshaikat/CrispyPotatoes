import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryArtist {
    
    @SerializedName("api_path")
    @Expose
    private String apiPath;
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("is_meme_verified")
    @Expose
    private Boolean isMemeVerified;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    
    public String getApiPath() {
	return apiPath;
    }
    
    public void setApiPath(String apiPath) {
	this.apiPath = apiPath;
    }
    
    public String getHeaderImageUrl() {
	return headerImageUrl;
    }
    
    public void setHeaderImageUrl(String headerImageUrl) {
	this.headerImageUrl = headerImageUrl;
    }
    
    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }
    
    public String getImageUrl() {
	return imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
    }
    
    public Boolean getIsMemeVerified() {
	return isMemeVerified;
    }
    
    public void setIsMemeVerified(Boolean isMemeVerified) {
	this.isMemeVerified = isMemeVerified;
    }

    public Boolean getIsVerified() {
	return isVerified;
    }
    
    public void setIsVerified(Boolean isVerified) {
	this.isVerified = isVerified;
    }
    
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
    public String getUrl() {
	return url;
    }

    public void setUrl(String url) {
	this.url = url;
    }
    
}
