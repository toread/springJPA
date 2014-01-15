package com.toread.core.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ extends com.toread.core.domain.BaseEntity_ {

	public static volatile SingularAttribute<Person, Date> birthday;
	public static volatile SetAttribute<Person, Organization> organization;
	public static volatile SingularAttribute<Person, String> sex;
	public static volatile SetAttribute<Person, Authority> authorities;
	public static volatile SingularAttribute<Person, String> phoneNumber;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Account> account;

}

