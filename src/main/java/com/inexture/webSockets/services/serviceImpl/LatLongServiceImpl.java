package com.inexture.webSockets.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inexture.webSockets.model.LatLongModel;
import com.inexture.webSockets.repositories.latLongRepository;
import com.inexture.webSockets.services.LatLongService;

@Service
public class LatLongServiceImpl implements LatLongService{

	@Autowired
	latLongRepository latLongRepo;

	@Override
	public void saveLatLong(LatLongModel latLongModel) {
		latLongRepo.save(latLongModel);
	}
}
