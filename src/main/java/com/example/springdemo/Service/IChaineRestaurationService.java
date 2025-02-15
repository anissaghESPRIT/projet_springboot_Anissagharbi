package com.example.springdemo.Service;

import com.example.springdemo.entities.ChaineRestauration;
import com.example.springdemo.entities.Client;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChaineRestauration();
    ChaineRestauration addChaineRestauration(ChaineRestauration ch);
    ChaineRestauration updateChaineRestauration(ChaineRestauration ch);
    ChaineRestauration retrieveChaineRestauration(Long IdChaineRestauration);
    void removeChaineRestauration(Long IdChaineRestauration);
    List<ChaineRestauration> addChaineRestauration (List<ChaineRestauration> ChaineRestauration);
}

