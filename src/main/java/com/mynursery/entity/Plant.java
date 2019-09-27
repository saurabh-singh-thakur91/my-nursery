package com.mynursery.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("0")
public class Plant extends Product {
	
}
