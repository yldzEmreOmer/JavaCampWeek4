package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammerLanguage;

public interface LanguageService {

	List<ProgrammerLanguage> getAll();

	void add(ProgrammerLanguage programmerLanguage) throws Exception;
	
	void delete(ProgrammerLanguage programmerLanguage);
	
	ProgrammerLanguage getById(int id);
	
	void update(ProgrammerLanguage programmerLanguage, int id);
}
