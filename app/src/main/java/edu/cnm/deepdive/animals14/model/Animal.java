package edu.cnm.deepdive.animals14.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedList;
import java.util.List;

public class Animal {


  private String id;

  @Expose
  private String title;

  @Expose
  private String description;

  @Expose
  @SerializedName("href")
  private String imageUrl;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

}
