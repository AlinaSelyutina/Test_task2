package business_objects;

public enum Languages {
  ENGLISH("EN", "https://www.ibar.az/en/ferdi"),
  RUSSIAN("RU", "https://www.ibar.az/ru/ferdi"),
  AZERBAIJANI("AZ", "https://www.ibar.az/az/ferdi");

  private final String language;
  private final String url;

  Languages(String language, String url) {
    this.language = language;
    this.url = url;
  }

  public String getLanguage() {
    return language;
  }

  public String getUrl() {
    return url;
  }
}
