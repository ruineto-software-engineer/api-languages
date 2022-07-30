package br.com.alura.api.languages;

public class Language {

  private String title;
  private String image;
  private int rank;

  public Language(String title, String image, int rank) {
    this.title = title;
    this.image = image;
    this.rank = rank;
  }

  public String getTitle() {
    return title;
  }

  public String getImage() {
    return image;
  }

  public int getRank() {
    return rank;
  }

}
