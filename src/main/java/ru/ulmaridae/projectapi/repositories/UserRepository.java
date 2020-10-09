package ru.ulmaridae.projectapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.ulmaridae.projectapi.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
