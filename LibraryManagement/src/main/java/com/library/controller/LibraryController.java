package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
//Not Executing
	@GetMapping("/{book_id}")
	public LibraryDTO getBookById(@PathVariable Long book_id) {
		return libraryService.getBookById(book_id);
	}

	@GetMapping("/books")
	public List<LibraryDTO> getAllBooks() {
		return libraryService.getAllBooks();
	}

	@PutMapping("/update/{book_id}")
	public LibraryDTO updateBook(@PathVariable("book_id") Long book_id, @RequestBody LibraryDTO libraryDto) {
		return libraryService.updateBook(book_id, libraryDto);
	}

	@DeleteMapping("/delete/{book_id}")
	void DeleteBook(@PathVariable("book_id") Long book_id) {
		libraryService.DeleteBook(book_id);
	}
}
