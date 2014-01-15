package com.toread.core.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Organization.class)
public abstract class Organization_ extends com.toread.core.domain.TreeEntity_ {

	public static volatile SingularAttribute<Organization, String> name;
	public static volatile SetAttribute<Organization, Person> persons;

}

