package kodlama.io.devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.ProgrammerLanguage;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<ProgrammerLanguage> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(ProgrammerLanguage programmerLanguage) throws Exception {
		languageService.add(programmerLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(ProgrammerLanguage programmerLanguage) {
		languageService.delete(programmerLanguage);
	}

	@RequestMapping("/getbyid")
	public void getById(int id) {
		languageService.getById(id);
	}
	@PutMapping("/update")
	public void update(ProgrammerLanguage programmerLanguage) {
		languageService.update(programmerLanguage, 0);
	}
}
