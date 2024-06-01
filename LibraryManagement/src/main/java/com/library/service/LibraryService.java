package com.library.service;

import com.library.dto.LibraryDTO;

public interface LibraryService {
	LibraryDTO createBook(LibraryDTO libraryDto);

	LibraryDTO getBookById(Long book_id);

}
