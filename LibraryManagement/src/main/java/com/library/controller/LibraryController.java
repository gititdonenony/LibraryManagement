package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.dto.LibraryDTO;
import com.library.service.LibraryService;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
	@Autowired
	LibraryService libraryService;

	@PostMapping("/create")
	public LibraryDTO createBook(@RequestBody LibraryDTO libraryDto) {
		return libraryService.createBook(libraryDto);
	}

	@GetMapping("/{book_id}")
	public LibraryDTO getBookById(@PathVariable Long book_id) {
		return libraryService.getBookById(book_id);
	}

	@GetMapping("/books")
	public List<LibraryDTO> getAllBooks() {
		return libraryService.getAllBooks();
	}

}
