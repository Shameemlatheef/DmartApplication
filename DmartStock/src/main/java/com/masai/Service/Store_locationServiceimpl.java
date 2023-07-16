package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.ProductException;
import com.masai.Exception.Store_locationException;
import com.masai.Repositary.Store_locationRepo;
import com.masai.model.Product;
import com.masai.model.Store_location;
@Service
public class Store_locationServiceimpl implements Store_locationService {
	
@Autowired
private Store_locationRepo srepo;

@Override
public Store_location AddStore(Store_location store) throws Store_locationException {
	Store_location s=srepo.save(store);
	if(s==null){
		throw new Store_locationException("nott saved");
	}
	else {
		return s;
	}
}

@Override
public Store_location UpdateStore(Store_location store) throws Store_locationException {
	Optional<Store_location> op=srepo.findById(store.getStoreid());
	if(op.isEmpty()) {
		
		throw new Store_locationException("Store not updated");
	}
	else {
		Store_location  newstore=srepo.save(store);
		return newstore;
	}
}

@Override
public Store_location DeleteStore(Integer id) throws Store_locationException {
	Optional<Store_location> delsto=srepo.findById(id);
	if(delsto.isEmpty()) {
	

		throw new Store_locationException("Store  not deleted or not found");
	}
	else {
		Store_location delstore=delsto.get();
				srepo.delete(delstore);
				return delstore;
	}
}

@Override
public Store_location viewStore(Integer proid) throws Store_locationException {
	Optional<Store_location> view=srepo.findById(proid);
	if(view.isEmpty()) {
		throw new Store_locationException("Store  not  found");
		
	}
	else {
		Store_location viewsto=view.get();
		return viewsto;
	}
}

@Override
public List<Store_location> ViewAllstore() throws Store_locationException {
	List<Store_location> all=srepo.findAll();
	if(all.isEmpty()) {
		throw new Store_locationException(" No Store  found");
	}
	else
	return all;
}
}
	
	
	


