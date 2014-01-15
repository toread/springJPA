package com.toread.core.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Authority.class)
public abstract class Authority_ extends com.toread.core.domain.BaseEntity_ {

	public static volatile SetAttribute<Authority, Resource> resources;
	public static volatile SingularAttribute<Authority, String> name;
	public static volatile ListAttribute<Authority, Person> persons;

}

