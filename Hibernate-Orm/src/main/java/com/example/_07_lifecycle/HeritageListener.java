package com.example._07_lifecycle;

import javax.persistence.PostPersist;

public class HeritageListener {
	
	@PostPersist
	public void postPersist(Mother mother) {
		System.out.println("direme sonrasý :  " + mother);
	}

}
