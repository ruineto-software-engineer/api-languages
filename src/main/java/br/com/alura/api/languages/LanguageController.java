package br.com.alura.api.languages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

  @Autowired
  private LanguageRepository languageRepository;

  @GetMapping("/languages")
  public List<Language> getLanguages() {
    List<Language> languages = languageRepository.findAll();

    return languages;
  }

}
