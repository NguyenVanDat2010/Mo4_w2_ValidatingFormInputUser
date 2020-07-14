package demo.repository;

import demo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional
public interface IUserRepository extends PagingAndSortingRepository<User,Long> {
}
