package com.toread.core.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ extends com.toread.core.domain.BaseEntity_ {

	public static volatile SingularAttribute<Account, Person> person;
	public static volatile SingularAttribute<Account, String> personId;
	public static volatile SingularAttribute<Account, String> code;
	public static volatile SingularAttribute<Account, String> password;

}

