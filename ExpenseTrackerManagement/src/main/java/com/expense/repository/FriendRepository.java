package com.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long> {

}
