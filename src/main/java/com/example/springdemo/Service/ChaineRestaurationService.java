package com.example.springdemo.Service;
import com.example.springdemo.entities.ChaineRestauration;

import java.util.List;

public class ChaineRestaurationService implements IChaineRestaurationService {

    @Override
    public List<ChaineRestauration> retrieveAllChaineRestauration() {
        return List.of();
    }

    @Override
    public ChaineRestauration addChaineRestauration(ChaineRestauration ch) {
        return null;
    }

    @Override
    public ChaineRestauration updateChaineRestauration(ChaineRestauration ch) {
        return null;
    }

    @Override
    public ChaineRestauration retrieveChaineRestauration(Long IdChaineRestauration) {
        return null;
    }

    @Override
    public void removeChaineRestauration(Long IdChaineRestauration) {

    }

    @Override
    public List<ChaineRestauration> addChaineRestauration(List<ChaineRestauration> ChaineRestauration) {
        return List.of();
    }
}
