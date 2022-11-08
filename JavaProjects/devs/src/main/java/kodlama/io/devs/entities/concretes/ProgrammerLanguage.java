package kodlama.io.devs.entities.concretes;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="ProgrammerLanguage")
public class ProgrammerLanguage {


	private int id;
	
	
	private String name;
}
