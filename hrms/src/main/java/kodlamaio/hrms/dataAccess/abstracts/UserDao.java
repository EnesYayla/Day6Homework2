package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> { 
	//JpaRepository verilen veri tipi için(User) "primary key alanının ne olduğunu bana ver ki soguları ona göre hazırlayayım." der 

	
}
