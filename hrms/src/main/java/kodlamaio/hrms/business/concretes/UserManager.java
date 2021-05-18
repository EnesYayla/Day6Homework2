package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
    @Autowired // Repository bağlantısı oluşturur, genellikle bağımlılık oluşturur siz tek bir instance e bağlıdır, 
    // bu anotasyonu yukarıdaki private nin üzerine koyarsak alttaki construtora gerek kalmaz fakat  tek bir instance ye bağlı olduğu için bu hâl daha iyidir
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}

}
