package com.example.MNSpellBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MNSpellBoot.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
}
