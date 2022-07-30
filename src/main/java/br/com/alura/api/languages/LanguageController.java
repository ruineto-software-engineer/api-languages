package br.com.alura.api.languages;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

  private List<Language> languages = List.of(
      new Language("Java", "https://cdn.jsdelivr.net/npm/programming-languages-logos/src/java/java.png", 1),
      new Language("PHP", "https://cdn.jsdelivr.net/npm/programming-languages-logos/src/php/php.png", 2));

  @GetMapping("/preferred-language")
  public String processPreferredLanguage() {
    return "Hello world, my preferred language is Java!";
  }

  @GetMapping("/languages")
  public List<Language> getLanguages() {
    return languages;
  }

}
