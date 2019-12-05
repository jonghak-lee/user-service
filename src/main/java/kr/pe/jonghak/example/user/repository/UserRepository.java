package kr.pe.jonghak.example.user.repository;

import kr.pe.jonghak.example.user.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, String> {
}
