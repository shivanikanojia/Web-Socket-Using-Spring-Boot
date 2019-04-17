package com.inexture.webSockets.repositories;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.inexture.webSockets.model.LatLongModel;

@Repository
public interface latLongRepository extends CassandraRepository<LatLongModel, UUID> {

}
