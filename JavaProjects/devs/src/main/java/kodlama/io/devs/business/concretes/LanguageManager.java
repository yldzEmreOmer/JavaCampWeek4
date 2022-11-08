package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammerLanguage;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammerLanguage> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammerLanguage programmerLanguage) throws Exception{
		if(programmerLanguage != null) {
			for (ProgrammerLanguage language : languageRepository.getAll()) {
				if(language.getName().equals(programmerLanguage.getName())){
					throw new Exception("Aynı isimde olamaz.");
				}
				languageRepository.add(programmerLanguage);
			}
		}
		else
			throw new Exception("Boş yazılamaz.");
		

	}

	@Override
	public void delete(ProgrammerLanguage programmerLanguage) {
		languageRepository.delete(programmerLanguage);
		
	}

	@Override
	public ProgrammerLanguage getById(int id) {
		
		return languageRepository.getById(id);
	}

	@Override
	public void update(ProgrammerLanguage programmerLanguage, int id) {
		 
		languageRepository.update(programmerLanguage, id);
		
	}



}
