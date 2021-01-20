package fr.guillaumemrlrs.cvbril.dao;

import fr.guillaumemrlrs.cvbril.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{


}
