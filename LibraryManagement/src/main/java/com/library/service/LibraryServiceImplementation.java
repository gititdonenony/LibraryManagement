package com.library.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dto.LibraryDTO;
import com.library.entity.LibraryEntity;
import com.library.repository.LibraryRepository;

@Service
public class LibraryServiceImplementation implements LibraryService {
	@Autowired
	LibraryRepository libraryRepository;

	@Override

	public LibraryDTO createBook(LibraryDTO libraryDto) {
		LibraryEntity libraryEntity = new LibraryEntity();
		BeanUtils.copyProperties(libraryDto, libraryEntity);
		LibraryEntity savedBook = libraryRepository.save(libraryEntity);
		LibraryDTO savedBookDto = new LibraryDTO();
		BeanUtils.copyProperties(savedBook, savedBookDto);
		return savedBookDto;
	}

}
