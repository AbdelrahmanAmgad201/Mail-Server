package com.example.backend.Repositories;

import com.example.backend.Entities.FolderOwner;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FolderOwnerRepository extends JpaRepository<FolderOwner, Long> {

}