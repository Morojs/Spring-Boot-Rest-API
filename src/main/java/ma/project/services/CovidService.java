package ma.project.services;

import ma.project.dao.CovidDao;
import ma.project.models.CovidModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CovidService implements CovidDao<CovidModel> {
    @Override
    public boolean Add() {
        return false;
    }
    @Override
    public boolean Delete() {
        return false;
    }
    @Override
    public boolean Update() {
        return false;
    }
    @Override
    public List<CovidModel> GetAll() {
        return null;
    }
    @Override
    public CovidModel getById() {
        return null;
    }
}
