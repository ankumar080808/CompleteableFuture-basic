package com.anant.SpringbootCompletableFuture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anant.SpringbootCompletableFuture.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}