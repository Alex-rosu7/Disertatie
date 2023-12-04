package com.Service;

import com.JPARepositories.IParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService {
    private IParentRepository parentRepository;

    @Autowired
    public ParentService(IParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }
}
