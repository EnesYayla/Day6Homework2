package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;

@RestController // sen artık bir controller olarak tanımlısın
@RequestMapping("api/users") // eğer bana tanımlı olduğum adres üzerinden istem gelirse onu knu bu controller
								// ile karşılarım
public class UsersController { // burada yaptığımız şeyler, injection kurmanın farklı varyasyonlardır. İşler
								// servisler aracılığıyla yapılır
	UserService userSerice;

	@Autowired // tanımlı olduğu constructor için yeni bir 'new' oluştrur, mainde new yapmamıza gerek kalmaz
	public UsersController(UserService userSerice) {

		this.userSerice = userSerice;
	}

	@GetMapping("/getall")
	public List<User> getAll() {
		return this.userSerice.getAll();

	}

}
