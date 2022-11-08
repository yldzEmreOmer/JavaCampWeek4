package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammerLanguage;

public interface LanguageRepository {

	List<ProgrammerLanguage> getAll();

	void add(ProgrammerLanguage programmerLanguage);
	
	void delete(ProgrammerLanguage programmerLanguage);
	
	ProgrammerLanguage getById(int id);
	
	void update(ProgrammerLanguage programmerLanguage, int id);
}
