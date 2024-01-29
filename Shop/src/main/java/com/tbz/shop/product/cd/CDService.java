package com.tbz.shop.product.cd;

import com.tbz.shop.IdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CDService {
    @Autowired
    private CDRepository cdRepository;

    public List<CD> getAllCDs(){
        return cdRepository.findAll();
    }

    public CD getOneCD(Integer id) throws IdNotFoundException {return cdRepository.findById(id).orElseThrow(() -> new IdNotFoundException("ID "+ id +" not found"));}

    public CD createCD(CD cd) {
        return cdRepository.save(cd);
    }
}
