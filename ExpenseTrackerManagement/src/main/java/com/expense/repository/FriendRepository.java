package com.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.entity.Friend;
@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

}
