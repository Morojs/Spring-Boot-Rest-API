package ma.project.dao;

import java.util.List;

public interface CovidDao<T> {
    public boolean Add();
    public boolean Delete();
    public boolean Update();
    public List<T> GetAll();
    public T getById();
}
