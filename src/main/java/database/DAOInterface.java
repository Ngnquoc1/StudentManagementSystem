package database;

import Model.ThiSinh;

import java.util.ArrayList;

public interface DAOInterface<T> {
    public int insertDB(T t);

    public int updateDB(T t);

    public int deleteDB(T t);

    public ArrayList<T> selectAllDB();

    public ArrayList<T> selectByID(int id);

    public ArrayList<T> selectByCondition(String Condition);
}
