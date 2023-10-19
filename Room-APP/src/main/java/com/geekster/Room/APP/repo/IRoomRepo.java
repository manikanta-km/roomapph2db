package com.geekster.Room.APP.repo;

import com.geekster.Room.APP.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRoomRepo extends CrudRepository<Room,Integer> {
}

// up to now we are using the in memory data i.e ram
// now we are using the database to store the data for that we are creating an interface and extending the CrudRepository<Table_Name,primary_col-data_type>
// and this has some inbuilt crud operations like below
//
//
//    <S extends T> S save(S entity);
//
//    <S extends T> Iterable<S> saveAll(Iterable<S> entities);
//
//    Optional<T> findById(ID id);
//
//    boolean existsById(ID id);
//
//    Iterable<T> findAll();
//
//    Iterable<T> findAllById(Iterable<ID> ids);
//
//    long count();
//
//    void deleteById(ID id);
//
//    void delete(T entity);
//
//    void deleteAllById(Iterable<? extends ID> ids);
//
//    void deleteAll(Iterable<? extends T> entities);
//
//    void deleteAll();
//
